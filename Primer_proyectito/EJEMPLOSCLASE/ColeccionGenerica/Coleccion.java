package EJEMPLOSCLASE.ColeccionGenerica;

public class Coleccion {

    // Atributos de instancia

    protected Elemento [] t;
    protected int cant;

    // Constructor

    public Coleccion(int max){
        t = new Elemento[max];
        cant = 0;
    }

    // Consultas

    public int cantElementos(){
        return cant;
    }
    
}
