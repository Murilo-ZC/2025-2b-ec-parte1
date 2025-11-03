// Subsistema (oculto ao cliente)
class VectorEngine { 
    void line(){ 
        System.out.println("[Vector] line()"); 
    } 
}

class RasterEngine { 
    void blit(){ 
        System.out.println("[Raster] blit()"); 
    } 
}


class AssetLoader { 
    void load(String p){ 
        System.out.println("[Asset] load "+p); 
    } 
}


// Facade
class GraphicsFacade {
    private final VectorEngine vector = new VectorEngine();
    private final RasterEngine raster = new RasterEngine();
    private final AssetLoader assets = new AssetLoader();

    public void drawCircle(int r){ 
        vector.line(); 
        System.out.println("draw circle r="+r); 
    }
    public void drawImage(String path){ 
        assets.load(path); 
        raster.blit(); 
        System.out.println("image: "+path); 
    }
}


// Cliente
class Main {
    public static void main(String[] args){
        GraphicsFacade g = new GraphicsFacade();
        g.drawCircle(10);
        g.drawImage("/imgs/logo.png");
    }
}