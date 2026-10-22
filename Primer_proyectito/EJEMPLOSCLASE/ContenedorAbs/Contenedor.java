package Primer_proyectito.EJEMPLOSCLASE.ContenedorAbs;

abstract class Contenedor {

    // Atributos de instancia

    protected float volumen;
    protected float densidad;

    // Constructor

    public Contenedor(float v, float d){
        volumen = v;
        densidad = d;
    }
    
    // Consultas

    public float obtenerVolumen(){
        return volumen;
    }

    public float obtenerDensidad(){
        return densidad;
    }

    abstract public float obtenerImpacto();

    public String toString(){
        return volumen + "" + densidad;
    }


}
