import java.util.*;

interface Drawable { void draw(); }

// Folhas
class Circle implements Drawable { 
    private final int r; 
    public Circle(int r){this.r=r;} 
    public void draw(){ System.out.println("Circle r="+r); } 
}


class Rect implements Drawable { 
    private final int w,h; 
    public Rect(int w,int h){this.w=w;this.h=h;} 
    public void draw(){ 
        System.out.println("Rect "+w+"x"+h); 
        } 
}


// Composto
class Group implements Drawable {
    private final List<Drawable> children = new ArrayList<>();
    public Group add(Drawable d){ 
        children.add(d); 
        return this; 
        }
    public void draw(){ 
        children.forEach(Drawable::draw); 
        }
}

class Main {
    public static void main(String[] args){
        Group root = new Group()
        .add(new Circle(10))
        .add(new Rect(20,15));
        Group layer = new Group().add(new Circle(5)).add(new Circle(7));
        root.add(layer);
        root.draw(); // desenha tudo
    }
}