package lab02;
public interface Volable {
    public void volar();
    
}
public class VuelaConAlas implements Volable {
    
    public void volar() {
        System.out.println("Puedo volar con mis alas");
    }
    
    public class NoVuela implements Volable{
        
        public void volar() {
            System.out.println("INCAPAZ DE VOLAR");
        }
    }
}
