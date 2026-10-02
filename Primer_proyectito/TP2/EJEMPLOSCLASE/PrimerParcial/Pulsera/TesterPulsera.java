package EJEMPLOSCLASE.PrimerParcial.Pulsera;

public class TesterPulsera {
    public static void main(String[] args) {
        PulseraFitness p = new PulseraFitness(7);
        p.establecerCantPasos(0, 11000);
        p.establecerCantPasos(1, 9000);
        p.establecerCantPasos(2, 10000);
        p.establecerCantPasos(3,11000);
        p.establecerCantPasos(4, 8000);
        p.establecerCantPasos(5, 6000);
        p.establecerCantPasos(6, 4000);

        for(int i = 0; i < p.obtenerCantDias(); i++)
         System.out.println("Dia " + i + " Pasos : " + p.obtenerCantPasos(i));

        System.out.println("Al menos 3 dias Esperado: (true)");

        System.out.println(p.alMenosNDiasCumplidos(3));

        System.out.println("Al menos 5 dias Esperado: (false)");

        System.out.println(p.alMenosNDiasCumplidos(5));

        System.out.println("Al menos 9 dias Esperado: (false)");

        System.out.println(p.alMenosNDiasCumplidos(9));

        
        
    }
    
}
