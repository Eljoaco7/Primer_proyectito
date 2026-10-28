package TP6.Ej_5;

public class RubricaProgramador extends Rubrica {

    // Atributos de instancia

    private int lineasCodidgo;

    // Constructor

    public RubricaProgramador(int l, int c, int a, int r, int lc){
        super(l, c, a, r);
        lineasCodidgo = lc;
    }

    // Comandos

    public void aumentarLineasCodigo(int p){
        lineasCodidgo = lineasCodidgo + p;
    }

    // Consultas

    public int obtenerLineasCodigo(){
        return lineasCodidgo;
    }

    public String toString(){
        return super.toString() + " Lineas de codigo = " + lineasCodidgo;
    }

    public double productividad(){
        return 1.5 * comunicacion + 3 * autonomia + 5 * responsabilidad + lineasCodidgo/10000;
    }

    
    
}
