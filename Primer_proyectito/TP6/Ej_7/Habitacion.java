package TP6.Ej_7;

public class Habitacion extends Alojamiento {

    // Atributos de instancia

    private int camas;

    // Constructor

    public Habitacion(int id, int p, int c){
        super(id, p);
        camas = c;
    }

    // Consultas

    public int obtenerCamas(){
        return camas;
    }
    
    public double costoDiario(int p){
        return camas * p/2.0;
    }

}
