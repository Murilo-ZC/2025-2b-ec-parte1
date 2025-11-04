import java.util.Random;

class RichTextEditor{
    private String s;
    public RichTextEditor(){
        this.s = "";
    }
    void write(String s){
        this.s += s;
    }
    void read(){
        System.out.println(this.s);
    }
}

class RandomNumeroGenerator{
    private int max;
    private Random random;
    public RandomNumeroGenerator(int max){
        this.random = new Random();
        this.max = max;
    }

    public int getInteiro(){ return this.random.nextInt(max);}
    public float getReal(){ return this.random.nextFloat()*max;}
}

class BoldAdapter{
    static public String bold(String s){
        return "**"+s+"**";
    } 
}

class ItalicAdapter{
    static public String italic(String s){
        return "*"+s+"*";
    }
}

class RandomNumeroGeneratorAdapter{
    private RandomNumeroGenerator random;
    public RandomNumeroGeneratorAdapter(RandomNumeroGenerator r){
        this.random = r;
    }

    public String getInt(){return this.random.getInteiro()+"";}
    public String getFloat(){ return this.random.getReal()+"";}
}

class Main{
    public static void main(String args[]){
        RichTextEditor editor = new RichTextEditor();
        editor.write("BlupBlup\n");
        editor.write("Alguem roubou minhas folhas!\n");
        RandomNumeroGeneratorAdapter adapter = new RandomNumeroGeneratorAdapter(new RandomNumeroGenerator(10));
        editor.write(adapter.getFloat());
        editor.write("\n");
        editor.write(adapter.getInt());
        editor.write("\n");
        editor.write(BoldAdapter.bold("Nome:")+ "Vegeta\n");
        editor.write(ItalicAdapter.italic("Raca:")+"Sayajin");
        editor.read();
    }
}