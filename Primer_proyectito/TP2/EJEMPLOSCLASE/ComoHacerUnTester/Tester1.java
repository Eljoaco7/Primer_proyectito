package EJEMPLOSCLASE.ComoHacerUnTester;

public class Tester1 {
    public static void main(String[] args) {
       private void mostrarSec(SecuenciaEnteros s){
        for(int i = 0; i < s.cantElementos(); i++){
            System.out.println(s.obtenerEntero(i) + " ");
        }
       }
        SecuenciaEnteros s = new SecuenciaEntero(5);
         s.establecerEntero(0,1);
         s.establecerEntero(1,5);
         s.establecerEntero(2,2);
         s.establecerEntero(3,3);
         s.establecerEntero(4,4);
        
    }
    
}
