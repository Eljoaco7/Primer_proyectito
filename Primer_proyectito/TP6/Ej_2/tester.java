package Primer_proyectito.TP6.Ej_2;

public class tester {
    public static void main(String[] args) {
        Poliza p1, p2, p3;
        p1 = new Poliza(111, 100, 120);
        p2 = new PolizaEscolar(112, 100, 120, 1000, 1500);
        p3 = new PolizaFabrica(113, 100, 120, 20, 50000);
        System.out.println(p1.obtenerNroPoliza()+" "+p1.obtenerCostoPoliza());
        System.out.println(p2.obtenerNroPoliza()+" "+p2.obtenerCostoPoliza());
        System.out.println(p3.obtenerNroPoliza()+" "+p3.obtenerCostoPoliza());


    
    
    
    }
}
