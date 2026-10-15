package Primer_proyectito.EJEMPLOSCLASE.EmpleadoHerencia;

import Ej_8.Fecha;

// Clase que hereda a la clase empleado
public class Vendedor extends Empleado {

    // Atributos de instancia

    protected float ventaAcumulada;

    // Constructor

    public Vendedor(int leg, float sb, Fecha fi, float v){
        super(leg, sb, fi);
        ventaAcumulada = v;
    }

    
}
