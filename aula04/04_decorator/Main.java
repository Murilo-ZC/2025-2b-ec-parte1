interface Drawable { void draw(); }


// Núcleo (component)
class Circle implements Drawable { 
    private final int r; 
    public Circle(int r){
        this.r=r;
    } 
    public void draw(){ 
        System.out.println("Circle r="+r); 
    } 
    
}

class Rect implements Drawable {
    private final int w,h;
    public Rect(int w, int h){
        this.w = w;
        this.h = h;
    }

    public void draw(){
        System.out.println("Rect w="+this.w+" h="+ this.h);
    }
}

// Decorator base
abstract class DrawableDecorator implements Drawable {
    protected final Drawable inner;
    protected DrawableDecorator(Drawable inner){ 
        this.inner = inner; 
    }
}


// Concretos
class BorderDecorator extends DrawableDecorator {
    public BorderDecorator(Drawable d){ 
        super(d); 
    }
    public void draw(){ 
        System.out.println("+ Borda 1px"); 
        inner.draw(); 
    }
}


class ShadowDecorator extends DrawableDecorator {
    public ShadowDecorator(Drawable d){ 
        super(d); 
    }
    public void draw(){ 
        System.out.println("+ Sombra suave"); 
        inner.draw(); 
    }
}


public class Main {
    public static void main(String[] args){
        Drawable base = new Circle(12);
        Drawable fancy = new BorderDecorator(new ShadowDecorator(base));
        fancy.draw();

        base = new Rect(3,4);
        fancy = new ShadowDecorator(base);
        fancy.draw();
    }
}