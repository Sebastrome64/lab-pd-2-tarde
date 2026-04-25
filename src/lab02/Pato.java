package lab02;
public abstract class Pato {
    Volable volable;
    Cuaqueable cuaqueable;
    
    public Pato() {
    }
    
    abstract void mostrar();
    
    
    public void realizarCuaqueo() {
        cuaqueable.cuaquear();
    }
    
    public void nadar() {
        System.out.println("TODOS LOS PATOS NADAN ");
        
    }

    public void setVolable(Volable volable) {
        this.volable = volable;
    }

    public void setCuaqueable(Cuaqueable cuaqueable) {
        this.cuaqueable = cuaqueable;
    }
}