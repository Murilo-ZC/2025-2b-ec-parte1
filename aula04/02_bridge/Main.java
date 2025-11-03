interface Renderer { 
    void drawCircle(int radius); void drawRect(int w,int h); 
    }


class VectorRenderer implements Renderer {
    public void drawCircle(int radius){ 
        System.out.println("[Vector] Circle r="+radius); 
        }
    public void drawRect(int w,int h){ 
        System.out.println("[Vector] Rect "+w+"x"+h); 
        }
}


class RasterRenderer implements Renderer {
    public void drawCircle(int radius){ 
        System.out.println("[Raster] Circle r="+radius); 
        }
    public void drawRect(int w,int h){ 
        System.out.println("[Raster] Rect "+w+"x"+h); 
        }
}


abstract class Shape {
    protected final Renderer renderer;
    protected Shape(Renderer r){ this.renderer=r; }
    public abstract void draw();
    }


class Circle extends Shape {
    private final int radius;
    public Circle(Renderer r,int radius){ 
        super(r); 
        this.radius=radius; 
        }
    public void draw(){ 
        renderer.drawCircle(radius); 
        }
}


class Rect extends Shape {
    private final int w,h;
    public Rect(Renderer r,int w,int h){ 
        super(r); this.w=w; this.h=h; 
        }
    public void draw(){ 
        renderer.drawRect(w,h); 
        }
}



class Main {
    public static void main(String[] args){
        Renderer vec = new VectorRenderer();
        Renderer ras = new RasterRenderer();
        new Circle(vec, 10).draw();
        new Rect(ras, 20, 15).draw();
    }
}