//CanvasBad.java
import java.util.*;

class CanvasBad {
    private List<Object> items = new ArrayList<>(); // Sem tipo claro


    public void add(Object o){ items.add(o); }


    // Renderização toda em if/else - difícil de escalar
    public void render(){
        for(Object o : items){
            if(o instanceof CircleBad){
                CircleBad c = (CircleBad)o;
                System.out.println("Desenhando Círculo com raio="+c.radius+" em modo RASTER fixo");
            } else if(o instanceof RectBad){
                RectBad r = (RectBad)o;
                System.out.println("Desenhando Retângulo w="+r.w+" h="+r.h+" em modo RASTER fixo");
            } else if(o instanceof HeavyImageBad){
                HeavyImageBad img = (HeavyImageBad)o;
                // Sempre carrega pesado, mesmo sem precisar
                img.load();
                System.out.println("Mostrando imagem pesada: "+img.path);
            }
        }
    }
}


//CircleBad.java
class CircleBad { public final int radius; public CircleBad(int r){ this.radius=r; } }


//RectBad.java
class RectBad { public final int w,h; public RectBad(int w,int h){ this.w=w; this.h=h; } }


//HeavyImageBad.java
class HeavyImageBad { 
    public final String path; public HeavyImageBad(String p){ this.path=p; }
    public void load(){ System.out.println("[LOAD] Carregando bitmap enorme de "+path); }
}


//MainBad.java
public class MainBad {
    public static void main(String[] args){
        CanvasBad c = new CanvasBad();
        c.add(new CircleBad(10));
        c.add(new RectBad(20, 15));
        c.add(new HeavyImageBad("/imgs/bg-huge.png"));
        c.render();
    }
}