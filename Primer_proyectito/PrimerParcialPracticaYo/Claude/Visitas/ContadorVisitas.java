package Claude.Visitas;

public class ContadorVisitas {

    // Atributos de clase

    private static final int minVisitas = 100;

    // Atributos de instancia

    public int [] registro;

    // Constructor

    //requiere n > 0
    public ContadorVisitas(int n){
        registro = new int [n];
    }

    // Comandos

    public void establecerVisitas(int d, int cant){
        if(d >= 0 && d < registro.length && cant >= 0){
            registro[d] = cant;
        }
    }

    public void copy(ContadorVisitas o){
       registro = new int[o.registro.length];
        for(int i = 0; i < registro.length; i++){
            registro[i] = o.registro[i];
        }
    }

    // Consultas

    public int obtenerCantDias(){
        return registro.length;
    }

    public int obtenerVisitas(int d){
        int retorno = -1;
        if(d >= 0 && d < obtenerCantDias()){
            retorno = registro[d];
        }
        return retorno;
    }

    public boolean alMenosNDiasMeta(int n){
        boolean cumple = false;
        int cont = 0;
        if(n <= obtenerCantDias()){
            for(int i = 0; i < obtenerCantDias() && !cumple; i++){
                if(registro[i] >= minVisitas){
                    cont++;
                }
                if (cont >= n){
                    cumple = true;
                }
            }
        }
        return cumple;
    }

    public boolean hayRachaMeta(int k){
        boolean hay = false;
        int cont = 0;

        if(k <= obtenerCantDias()){
            for(int i = 0; i < obtenerCantDias() && !hay; i++){
                if(registro[i] >= minVisitas){
                    
                 cont++;
                }
                else{
                    cont = 0;
                }
                if(cont >= k){
                    hay = true;
                }
            }
        }
        return hay;
    }

    public int diaMenosVisitas(){
        int diaMin = 0;
        int visitasMin= registro[diaMin];

        for(int i = 0; i < obtenerCantDias(); i++){
            if(registro[i] < visitasMin){
                visitasMin = registro[i];
                diaMin = i;
            }
        }
        return diaMin;
    }

    public ContadorVisitas clone(){
        ContadorVisitas clon = new ContadorVisitas(obtenerCantDias());
        for(int i = 0; i < registro.length; i++){
            clon.registro[i] = registro[i];
        }
     return clon;
    }

    public boolean equals(ContadorVisitas o){
     boolean iguales = false;
     if (o != null && obtenerCantDias() == o.obtenerCantDias()){
        iguales = true;
        for(int i = 0; i < obtenerCantDias() && iguales; i++){
            if(registro[i] != o.registro[i]){
                iguales = false;
            }
        }
    }
    return iguales;
}
}


    

