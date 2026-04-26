package lab02;

public class PatoDeGoma extends Pato {

    public void PatoDeGoma() {
        volable = new NoVuela();
        cuaqueable = new Chirreo();
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un PATITO DE GOMA");

    }
}
