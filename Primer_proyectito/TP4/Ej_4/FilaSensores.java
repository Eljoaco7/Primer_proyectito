package TP4.Ej_4;
import TP2.Ej_5.Sensor;


public class FilaSensores {

    // Atributos de instancia

    private Sensor [] fs;

    // Constructor

    public FilaSensores(int cant){
        fs = new Sensor[cant];
    }

    // Comandos

    public void establecerSensor(int p, Sensor s){
        if(p >= 1 && p < cantFila()){
            fs[p - 1] = s;
        }
    }

    public void intercambiar(int p1, int p2){
        if(p1 >= 1 && p1 < cantFila() && p2 >= 1 && p2 < cantFila()){
            Sensor aux = fs[p1 - 1];
            for(int i = 0; i < cantFila(); i++){
                fs[p1 - 1] = fs[p2 - 1];
                fs[p2 - 1] = aux;
            }
        }
    }

    public void copy(FilaSensores a){
        for(int i = 0; i < cantFila(); i++){
            fs[i - 1].copy(a.obtenerSensor(i - 1));
        }
    }

    // Consultas

    public Sensor obtenerSensor(int p){
        Sensor aux = null;
        if(p >= 0 && p < cantFila()){
            aux = fs[p - 1];
        }

        return aux;
    }

    public boolean posicionValida(int p){
        return p >= 0 && p < cantFila();
    }

    public int cantFila(){
        return fs.length;
    }

    public int cantSensores(){
        int cont = 0;
        for(int i = 0; i < cantFila(); i++){
            if(fs[i] != null){
                cont++;
            }

        }
        return cont;
    }

    public int cantidadRiesgo(int n){
        int cont = 0;

        for(int i = 0; i < cantFila(); i++){
            if(fs[i] != null && fs[i].riesgo()){
                cont++;
            }
        }
        return cont;
    }

    public boolean hayNRiesgo(int n){
        boolean toRet = false;
        int cont = 0;

        for(int i = 0; i < cantFila() && !toRet; i++){
            if(fs[i].riesgo()){
                cont++;
            }
            if(cont == n){
                toRet = true;
            }
        }
        return toRet;
    }

    public boolean dosConsecutivosEmergencia(){
        boolean hay = false;

        for(int i = 0; i < cantFila() - 1 && !hay; i++){
            if(fs[i].riesgo() && fs[i + 1].riesgo()){
                hay = true;
            }
        }
        return hay;
    }

    public boolean equals(FilaSensores a){
        boolean iguales = cantFila() == a.cantFila();

        for(int i = 0; i < cantFila() && iguales; i++){
            iguales = fs[i] == a.obtenerSensor(i+1);
        }
        return iguales;
    }

    public FilaSensores clone(){
        FilaSensores clon = new FilaSensores(cantFila());

        for(int i = 0; i < cantFila(); i++){
            clon.establecerSensor(i, obtenerSensor(i).clone());
        }
        return clon;
    }

    public FilaSensores filaCompleta() {
        FilaSensores nueva = new FilaSensores(cantFila());
        int j = 0;
        for (int i = 0; i < fs.length; i++)
            if (fs[i] != null) {
                nueva.fs[j] = fs[i];
                j++;
            }
        return nueva;
    }
}


