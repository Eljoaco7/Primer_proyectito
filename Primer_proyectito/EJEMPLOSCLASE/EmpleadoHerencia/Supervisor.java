package Primer_proyectito.EJEMPLOSCLASE.EmpleadoHerencia;

import Ej_8.Fecha;

public class Supervisor extends Operario {

    
//Constructor
    public Supervisor (int leg, float sb, Fecha fi){
    super(leg,sb,fi);
}
//Consultas
    public int obtenerVacaciones(Fecha hoy){
    /*Retorna 2 días por año de antigüedad
    hasta un máximo de 30 días */
    int a = obtenerAntiguedad(hoy);
    int v = 2*a;
    if (v > 30)
    v = 30;
return v;
    }
}
