
package Primer_proyectito.EJEMPLOSCLASE.EjemploParcial;


public class PulseraFitness{
    //Atributos de clase
    private static final int minPasos=10000;

    //Atributos de instancia
    private int [] registro;
    
    public PulseraFitness(int n){
        registro = new int[n];
    }

    //Comandos
    public void establecerCantPasos(int d, int pasos){
        if(d>=0 && d<registro.length && pasos>=0){
            registro[d] = pasos;
        }
    }
    
    //Consultas
    public int obtenerCantDias(){
        return registro.length;
    }
    
    public int obtenerCantPasos(int d){
        int pasos = -1;
        if(d>=0 && d<registro.length)
            pasos = registro[d];
        return pasos;
    }
    
    //Recorrido no exhaustivo
    public boolean alMenosNDiasCumplidos(int n){
       int cont = 0;
       if(n<=registro.length)
           for(int i = 0; i<registro.length && cont<n; i++){
               if(registro[i]>=minPasos)
                   cont++;
           }
       return cont>=n;
    }
    
    //Recorrido exhaustivo
    public int diaMasActivo(){
        int diaMax = 0;
        int pasosMax = registro[diaMax];
        for(int i = 1; i<registro.length; i++){
            if(registro[i]>pasosMax){
                pasosMax = registro[i];
                diaMax = i;
            }
        }
        return diaMax;
    }
}