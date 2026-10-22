package Primer_proyectito.EJEMPLOSCLASE.ContenedorAbs;

public class Contaminante extends Contenedor{

    // Atributos de instancia
    protected float toxicidad;

    // Constructor

    public Contaminante(float v, float d, float t){
        super(v,d);
        toxicidad = t;
    }

    // Consultas

    public float obtenerToxicidad(){
        return toxicidad;
    }

    public float obtenerImpacto(){
        return toxicidad*volumen*densidad;
    }

    public String toString(){
        return super.toString() + "" + toxicidad;
    }
    
}
