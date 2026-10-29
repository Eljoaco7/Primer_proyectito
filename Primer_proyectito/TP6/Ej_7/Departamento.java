package TP6.Ej_7;

public class Departamento extends Alojamiento {

    // Atributos de instancia

    private int ambientes;
    private boolean balcon;

    // Constructor

    public Departamento(int id, int p, int a, boolean b){
        super(id, p);
        ambientes = a;
        balcon = true;
    }

    // Consultas

    public boolean tieneBalcon(){
        return balcon;
    }

    public double costoDiario(int p){
        double toRet = 0;
        if(tieneBalcon()){
            toRet = ambientes * p + 150;
        }
        else{
            toRet = ambientes * p;
        }

        return toRet;
    }
    
}
