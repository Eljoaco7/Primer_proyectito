package Primer_proyectito.EJEMPLOSCLASE.EmpleadoHerencia;

import Ej_8.Fecha;

public class Operario extends Empleado {
    //Atributos de instancia
protected int horas;
//Constructor
public Operario (int leg, float sb, Fecha fi){
super(leg,sb,fi);
}
//Comandos
public void establecerHoras(int h){
horas = h; }
//Consultas
public int obtenerHoras (){
return horas; }
public float obtenerPremio (float p){
return horas * p ; }

}
