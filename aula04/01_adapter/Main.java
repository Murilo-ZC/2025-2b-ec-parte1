import java.util.*;

interface Drawable { 
    void draw(); 
}


class Circle implements Drawable {
    private final int r;
    public Circle(int r){ 
        this.r = r; 
        }
    @Override 
    public void draw(){ 
        System.out.println("[Circle] r="+r); 
        }
}

class Rect implements Drawable { 
    public final int w,h; 
    public Rect(int w,int h){ 
        this.w=w; this.h=h; 
        } 
    @Override
    public void draw(){
        System.out.println("[Rect] w="+ this.w + " h="+ this.h);
    }        
}

class LegacyImage {
    private final String path;
    public LegacyImage(String path){ 
        this.path=path; 
        }
    public void drawBitmap(){ 
        System.out.println("[Legacy] drawBitmap: "+path); 
        }
}



class LegacyImageAdapter implements Drawable {
    private final LegacyImage legacy;
    public LegacyImageAdapter(LegacyImage legacy){ 
        this.legacy = legacy; 
        }
    @Override 
    public void draw(){ 
        legacy.drawBitmap(); 
        }
}


// Cliente que depende apenas da ABSTRAÇÃO (Drawable)
class Canvas {
    private final List<Drawable> items = new ArrayList<>();
    public void add(Drawable d){ 
        items.add(d); 
        }
    public void render(){ 
        items.forEach(Drawable::draw); // <- Polimorfismo aqui
        } 
}


// Demonstração: objetos diferentes, mesma chamada .draw()
class Main {
    public static void main(String[] args){
        Canvas canvas = new Canvas();
        canvas.add(new Circle(12)); // nativo
        canvas.add(new Rect(3,4));
        canvas.add(new LegacyImageAdapter(new LegacyImage("logo.bmp"))); // adaptado
        canvas.render(); // chamadas .draw() são despachadas dinamicamente
    }
}