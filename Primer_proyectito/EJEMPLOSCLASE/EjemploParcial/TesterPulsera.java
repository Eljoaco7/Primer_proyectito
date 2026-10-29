
package EJEMPLOSCLASE.EjemploParcial;


public class TesterPulsera{
    public static void main(String args[]){
        PulseraFitness p = new PulseraFitness(6);
        p.establecerCantPasos(0,1000);
        p.establecerCantPasos(1,20000);
        p.establecerCantPasos(2,30000);
        p.establecerCantPasos(3,3000);
        p.establecerCantPasos(4,63000);
        p.establecerCantPasos(5,1000);
        
        
        System.out.println("Al menos 3 dia. (TRUE)"+p.alMenosNDiasCumplidos(3));
        System.out.println("Al menos 2 dia. (TRUE)"+p.alMenosNDiasCumplidos(2));
        System.out.println("Al menos 4 dia. (FALSE)"+p.alMenosNDiasCumplidos(4));
        System.out.println(p.obtenerCantDias());
        System.out.println(p.diaMasActivo());    
    
    }
}