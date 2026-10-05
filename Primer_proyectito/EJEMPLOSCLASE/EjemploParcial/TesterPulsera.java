
package Primer_proyectito.EJEMPLOSCLASE.EjemploParcial;


public class TesterPulsera{
    public static void main(String args[]){
        PulseraFitness p = new PulseraFitness(7);
        p.establecerCantPasos(0,11000);
        p.establecerCantPasos(1,9000);
        p.establecerCantPasos(2,10000);
        p.establecerCantPasos(3,11000);
        p.establecerCantPasos(4,8000);
        p.establecerCantPasos(5,6000);
        p.establecerCantPasos(6,4000);
        
        System.out.println("Al menos 3 dia. (TRUE)"+p.alMenosNDiasCumplidos(3));
        System.out.println("Al menos 2 dia. (TRUE)"+p.alMenosNDiasCumplidos(2));
        System.out.println("Al menos 4 dia. (FALSE)"+p.alMenosNDiasCumplidos(4));
    }
}