public class PulseraFitness {

    // Atributos de clase
 private static final int minPasos = 10000;

 // Atributos de instancia

 private int [] registro;

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

 // Consultas

 public int obtenerCantDias(){
    return registro.length;
 }

 public int obtenerCantPasos(int d){
    int pasos = -1;
    if(d >= 0 && d < obtenerCantDias()){
        pasos = registro[d];
    }

    return pasos;
 }

 public boolean alMenosNDiasCumplidos(int n){
    boolean cumple = false;
    int cont = 0;
    if(n <= obtenerCantDias()){
        for(int i = 0; i < obtenerCantDias() && !cumple; i++){
            if(registro[i] >= minPasos){
                cont++;
            }
            if(cont >= n){
                cumple = true;
            }
        }
    }
    return cumple;
}
public int diaMasActivo(){
    int diaMax = 0;
    int pasosMax = registro[diaMax];

    for(int i = 0; i < obtenerCantDias(); i++){
        if(registro[i] > pasosMax){
            pasosMax = registro[i];
            diaMax = i;
        }
    }

    return diaMax;
}


}