package Primer_proyectito.TP6;

public class PlanBase {
    
    // Atributos de instancia

    protected int usuarios;
    protected int base;

    // Constructor

    public PlanBase(int u, int b){
        usuarios = u;
        base = b;
    }

    // Consultas

    public int obtenerUsuarios(){
        return usuarios;
    }

    public int obtenerBase(){
        return base;
    }
}
