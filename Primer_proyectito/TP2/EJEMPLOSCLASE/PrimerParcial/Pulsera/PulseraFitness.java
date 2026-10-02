package EJEMPLOSCLASE.PrimerParcial.Pulsera;

public class PulseraFitness {
    // Atributos de clase

    private static final int minPasos = 10000;

    // Atributos de intancia

    private int[] registro;

    // Constructor

    public PulseraFitness(int n){
        registro = new int[n];
        
    }

    // Comandos

    public void establecerCantPasos(int d, int pasos){
        if(d >= 0 && d < registro.length && pasos >= 0){
            registro[d] = pasos;
        }

    }

    public int obtenerCantPasos(int d){
        int paso = -1;
        if(d >= 0 && d < registro.length){
            paso = registro[d];
        }
        return paso;
    }

    public int obtenerCantDias(){
        return registro.length;
    }

    public boolean alMenosNDiasCumplidos(int n){
        boolean encontre = false;
        int cont = 0;

       if(n <= registro.length) 
        for(int i = 0; i < registro.length && !encontre; i++){
            if(registro[i] >= minPasos)
                cont++;
                
            if(cont == n)
             encontre = true;
        }

        return encontre;
    }

    /*public boolean alMenosNDiasCumplidos(int n){
        int hay = 0;

       if(n <= registro.length) 
        for(int i = 0; i < registro.length && hay < n; i++){
            if(registro[i] >= minPasos)
                hay++;
        }

        return (hay == n);
    }   */


        public int diaMasActivo(){
            int maxDia = 0;
            int maxPasos = registro[0];

            for(int i = 1; i < registro.length; i++){
                if(registro[i] > maxPasos){
                    maxPasos = registro[i];
                    maxDia = i;
                }
            }

            return maxDia;
        }
    


    }
