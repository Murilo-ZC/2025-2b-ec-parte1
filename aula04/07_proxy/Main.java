// Sujeito real pesado
class HeavyImage implements Image {
    private final String path; 
    private boolean loaded=false;
    HeavyImage(String p){ 
        this.path=p; 
    }
    private void load(){ 
        if(!loaded){ 
            System.out.println("[LOAD] "+path); 
            loaded=true; 
        } 
    }
    public void show(){ 
        load(); 
        System.out.println("show "+path); 
    }
}


// Interface comum
interface Image { void show(); }


// Proxy virtual: carrega sob demanda e faz cache
class ImageProxy implements Image {
    private final String path; 
    private HeavyImage real;
    public ImageProxy(String p){ 
        this.path=p; 
    }
    public void show(){
        if(real==null){ 
            real = new HeavyImage(path); 
        }
        real.show();
    }
}


// Cliente
class Main {
    public static void main(String[] args){
        Image img = new ImageProxy("/imgs/bg-huge.png");
        System.out.println("— primeiro show —"); img.show();
        System.out.println("— segundo show —"); img.show(); // Sem recarregar
    }
}