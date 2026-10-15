package Primer_proyectito.EJEMPLOSCLASE.EmpleadoHerencia;

import Ej_8.Fecha;

public class Empleado {

    // Atributos de instancia

    protected int legajo;
    protected float sueldoBasico;
    protected Fecha fechaIngreso;

    // Constructor

    public Empleado(int leg, float sb, Fecha fi){
        legajo = leg;
        sueldoBasico = sb;
        fechaIngreso = fi;
    }

    // Comandos

    public void establecerSueldoBasico(float sb){
        sueldoBasico = sb;
    }

    // Consultas

    public int obtenerLegajo(){
        return legajo;
    }

    public float obtenerSueldoBasico(){
        return sueldoBasico;
    }

    public Fecha obtenerFechaIngreso(){
        return fechaIngreso;
    }

    
    
}
