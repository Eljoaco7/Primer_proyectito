package EJEMPLOSCLASE.EmpleadoHerencia;

import TP2.Ej_8.Fecha;

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

    public int obtenerVacaciones(Fecha hoy){
/*Requiere hoy posterior a fechaIngreso. Retorna la cantidad de días de
vacaciones que le corresponden empleado.
7 si antigüedad mayor o igual a 1 y menor o igual a 5.
15 si antigüedad mayor a 5 y menor o igual a 10.
25 si antigüedad es mayor a 10.
Si tiene menos de 1 año, no tiene vacaciones */
int a = obtenerAntiguedad(hoy);
int v = 0;
if (a > 10) v = 25;
else
if (a > 5 ) v = 15;
else if (a >= 1) v = 7;
return v;
}

public float obtenerSueldoNeto(Planilla p, Fecha hoy){
/*Requiere p ligada y hoy posterior a fechaIngreso
Retorna el sueldo neto del empleado calculado como el sueldo
básico incrementado según un porcentaje dependiente de la
antigüedad y obtenido de la planila p.
Si tiene 15 años o más el sueldo neto es el doble del básico*/
int a = obtenerAntiguedad(hoy);
float sn = 0;
int porc;
if (a >= 15)
sn = 2 * sueldoBasico;
else{
porc = p.obtenerPorcentaje(a);
sn = sueldoBasico + (sueldoBasico * porc / 100); }
return sn;
}

public int obtenerAntiguedad(Fecha hoy){
/* Requiere hoy posterior a fechaIngreso.
   Retorna la cantidad de años completos transcurridos entre
   fechaIngreso y hoy. */
    int a = hoy.obtenerAnio() - fechaIngreso.obtenerAnio();

    boolean aunNoCumplio =
        hoy.obtenerMes() < fechaIngreso.obtenerMes()
        || (hoy.obtenerMes() == fechaIngreso.obtenerMes()
            && hoy.obtenerDia() < fechaIngreso.obtenerDia());

    if (aunNoCumplio) a = a - 1;

    return a;
}

    
    
}
