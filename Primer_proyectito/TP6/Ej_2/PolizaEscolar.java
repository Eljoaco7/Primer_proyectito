package Primer_proyectito.TP6.Ej_2;

public class PolizaEscolar extends Poliza {

    // Atributos de instancia

    protected int cantAlumnos;
    protected int cantDocentes;
    
    // Constructores

    public PolizaEscolar(int np){
        super(np);
        cantAlumnos = 0;
        cantDocentes = 0;
    }

    public PolizaEscolar(int np, float i, float r, int ca, int cd){
        super(np,i,r);
        cantAlumnos = ca;
        cantDocentes = cd;
    }

    // Comandos

    public void establecerCantAlumnos(int n){
        cantAlumnos = n;
    }

    public void establecerCantDocentes(int n){
        cantDocentes = n;
    }

    // Consultas

    public int obtenerCantAlumnos(){
        return cantAlumnos;
    }

    public int obtenerCantDocentes(){
        return cantDocentes;
    }

    public double obtenerCostoPoliza(int p){
        return super.obtenerCostoPoliza() + cantAlumnos*p*1.5 + cantDocentes*p;
    }


}
