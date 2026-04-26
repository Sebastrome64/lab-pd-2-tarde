package lab02;

public abstract class Pato {

    protected Volable volable;
    protected Cuaqueable cuaqueable;

    public abstract void mostrar();

    public void realizarVuelo() {
        volable.volar();
    }

    public void realizarCuaqueo() {
        cuaqueable.cuaquear();
    }

    public void nadar() {
        System.out.println("TODOS LOS PATOS NADAN");
    }

    public void setVolable(Volable v) {
        this.volable = v;
    }

    public void setCuaqueable(Cuaqueable c) {
        this.cuaqueable = c;
    }
}
