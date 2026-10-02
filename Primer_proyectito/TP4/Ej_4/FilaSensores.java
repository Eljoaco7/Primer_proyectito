package Primer_proyectito.TP4.Ej_4;
import Ej_5.Sensor;


public class FilaSensores {

    // Atributos de instancia

    private Sensor[] fs;

    // Constructor

    public FilaSensores(int cant){
        fs = new Sensor [cant];
    }

    // Comandos

    public void establecerSensor(int p, Sensor s){
        if(p < fs.length){
            fs[p - 1] = s;
        }
    }

    public void intercambiar(int p1, int p2){
        if(p1 < fs.length && p2 < fs.length){
            Sensor p1aux= fs[p1 - 1];

            fs[p1 - 1] = fs[p2 - 1];
            fs[p2 - 1] = p1aux;

        }
    }


    
}
