package Primer_proyectito.TP6.Ej_5;

public class RubricaLider extends Rubrica {

    // Atributos de instancia

    protected int gestionConflictos;
    protected int gestionCambios;

    // Constructor

    public RubricaLider(int l, int c, int a, int r, int go, int ga){
        super(l, c,a,r);
        gestionConflictos = go;
        gestionCambios = ga;
    }

    // Comandos

    public void establecerConflictos(int p){
        gestionConflictos = p;
    }

    public void establecerCambios(int p){
        gestionCambios = p;
    }

    // Consultas

    public int obtenerConflictos(){
        return gestionConflictos;
    }

    public int obtenerCambios(){
        return gestionCambios;
    }

    public String toString(){
        return super.toString() + " Conflictos = " + gestionConflictos + " Cambios = " + gestionCambios;

    }

    public int total(){
        return comunicacion + autonomia + responsabilidad + gestionConflictos + gestionCambios;
    }

    public double promedio(){
        return (comunicacion + autonomia + responsabilidad + gestionConflictos + gestionCambios) / 5.0;
    }

    
    
}
