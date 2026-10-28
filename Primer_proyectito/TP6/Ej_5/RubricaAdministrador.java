package Primer_proyectito.TP6.Ej_5;

public class RubricaAdministrador extends RubricaLider {

    // Atributos de instancia

    private int proyectos;

    // Constructor

    public RubricaAdministrador(int l, int c, int a, int r, int go, int ga, int p){
        super(l, c, a, r, go, ga);
        proyectos = p;
    }

    // Comandos

    public void aumentarProyectos(){
        proyectos++;
    }

    // Consultas

    public int obtenerProyectos(){
        return proyectos;
    }

    public String toString(){
        return super.toString() + " Proyectos = " + proyectos;
    }

    public double productividad(){
        return 4 * promedio() + proyectos * 10;
    }
    
}
