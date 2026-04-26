package lab02;

public class PatoReal extends Pato {

    public PatoReal() {
        volable = new VuelaConAlas();
        cuaqueable = new Cuaqueo();
    }

    @Override
    public void mostrar() {
        System.out.println("Yo soy un verdadero PATO REAL");
    }
}
