// Estado intrínseco compartilhado
class ShapeStyle {
    public final String stroke; 
    public final String fill;
    private ShapeStyle(String stroke,String fill){ 
        this.stroke=stroke; 
        this.fill=fill; 
    }
    // Factory com cache
    private static final java.util.Map<String,ShapeStyle> CACHE = new java.util.HashMap<>();
    public static ShapeStyle of(String stroke,String fill){
        String key = stroke+"|"+fill;
        return CACHE.computeIfAbsent(key, k -> new ShapeStyle(stroke, fill));
    }
}


// Objetos leves referenciam o estilo
class Circle { 
    private final int r; 
    private final ShapeStyle style;
    public Circle(int r, ShapeStyle s){ 
        this.r=r; 
        this.style=s; 
    }
    public void draw(){ 
        System.out.println("Circle r="+r+" style=("+style.stroke+","+style.fill+")"); 
    }
}


class Main {
    public static void main(String[] args){
        var red = ShapeStyle.of("#f00","none");
        var red2 = ShapeStyle.of("#f00","none");
        System.out.println("Mesma instância? "+(red==red2)); // true
        new Circle(5, red).draw();
        new Circle(10, red2).draw();
    }
}