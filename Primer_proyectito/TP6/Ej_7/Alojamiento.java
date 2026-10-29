package TP6.Ej_7;

abstract class Alojamiento {

    // Atributos de instancia

    protected int id;
    protected int personas;

    // Constructor

    public Alojamiento(int id, int p){
        this.id = id;
        personas = p;
    }

    // Consultas

    public int obtenerId(){
        return id;
    }

    public int obtenerPersonas(){
        return personas;
    }

    public String toString(){
        return "ID = " + id + " PERSONAS = " + personas;
    }

    abstract double costoDiario(int p);
    
}
