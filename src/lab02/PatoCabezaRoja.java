package lab02;

public class PatoCabezaRoja extends Pato {

    public PatoCabezaRoja() {
        volable = new VuelaConAlas();
        cuaqueable = new Cuaqueo();
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un real PATO CABEZA ROJA");
    }
}
