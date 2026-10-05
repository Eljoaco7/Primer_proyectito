public class TesterPulseraFitness{
    public static void main (String[]args){
        PulseraFitness pf = new PulseraFitness(7);
        pf.establecerCantPasos(0, 12000);
        pf.establecerCantPasos(1, 14000);
        pf.establecerCantPasos(2, 16000);
        pf.establecerCantPasos(3, 8000);
        pf.establecerCantPasos(4, 18000);
        pf.establecerCantPasos(5, 19000);
        pf.establecerCantPasos(6, 20000);

        System.out.println("MUESTRO EL ESTADO DE LOS DIAS Y PASOS DEL ARREGLO: ");
        System.out.println("CANTIDAD PASOS DIA -1 (DIA NO VALIDO) = " + pf.obtenerCantPasos(-1));
        System.out.println("CANTIDAD PASOS DIA 0 = " + pf.obtenerCantPasos(0));
        System.out.println("CANTIDAD PASOS DIA 1 = " + pf.obtenerCantPasos(1));
        System.out.println("CANTIDAD PASOS DIA 2 = " + pf.obtenerCantPasos(2));
        System.out.println("CANTIDAD PASOS DIA 3 = " + pf.obtenerCantPasos(3));
        System.out.println("CANTIDAD PASOS DIA 4 = " + pf.obtenerCantPasos(4));
        System.out.println("CANTIDAD PASOS DIA 5 = " + pf.obtenerCantPasos(5));
        System.out.println("CANTIDAD PASOS DIA 6 = " + pf.obtenerCantPasos(6));
        System.out.println("CANTIDAD PASOS DIA 7 (DIA NO VALIDO) = " + pf.obtenerCantPasos(7));

        System.out.println(" <<VERIIFCO EL METODO alMenosNDiasCumplidos>> ");
        System.out.println("HAY AL MENOS 2 DIAS QUE CUMPLEN? ESPERADO = TRUE " + pf.alMenosNDiasCumplidos(2));
        System.out.println("HAY AL MENOS 10 DIAS QUE CUMPLEN? ESPERADO = FALSE " + pf.alMenosNDiasCumplidos(10));
        System.out.println("HAY AL MENOS 7 DIAS QUE CUMPLEN? ESPERADO = FALSE " + pf.alMenosNDiasCumplidos(7));
        }

}