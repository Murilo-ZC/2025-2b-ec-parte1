import java.util.*;

interface Renderable{
    String render(String s);
}

class BoldRender implements Renderable{
    @Override
    public String render(String s){
        return "**"+s+"**";
    }
}

class ItalicRender implements Renderable{
    @Override
    public String render(String s){
        return "*"+s+"*";
    }
}

class CrossRender implements Renderable{
    @Override
    public String render(String s){
        return "~"+s+"~";
    }
}

class RegularRender implements Renderable{
    @Override
    public String render(String s){
        return s;
    }
}

class FormattedText{
    private String text;
    private Renderable renderable;
    public FormattedText(String text, Renderable r){
        this.text = text;
        this.renderable=r;
    }

    public String getText(){
        return renderable.render(text);
    }
}

class RichTextEditor{
    private List<FormattedText> texts;
    public RichTextEditor(){
        this.texts = new ArrayList();
    }

    public void add(FormattedText text){
        this.texts.add(text);
    }

    public String getText(){
        String res = "";
        for(int i = 0; i < this.texts.size() ; i++ ){
            res += texts.get(i).getText()+"\n";
        }
        return res;
    }
}

public class Main{
    public static void main(String args[]){
        RichTextEditor editor = new RichTextEditor();
        FormattedText t1 = new FormattedText("Ola", new RegularRender());
        FormattedText t2 = new FormattedText("Godot", new BoldRender());
        FormattedText t3 = new FormattedText("TONINHO", new ItalicRender());
        editor.add(t1);
        editor.add(t2);
        editor.add(t3);
        editor.add(t1);
        System.out.println(editor.getText());
    }
}