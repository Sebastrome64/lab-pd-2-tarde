package lab02;
public interface Cuaqueable {
    public void cuaquear();
}
public class Cuaqueo implements Cuaqueable {
    public void cuaquear() {
        System.out.println("Soy un verdadero pato por eso hago CUAC CUAC");
    }
    public class CuaqueoMudo implements Cuaqueable{
        public void cuaquear() {
            System.out.println("<<Silencio>>");
        }
        public class Chirreo implements Cuaqueable{
            public void cuaquear() {
                System.out.println("Chirr Chirr ");
            }
        }
    }
}
