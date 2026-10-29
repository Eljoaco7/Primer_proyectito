package EJEMPLOSCLASE.EmpleadoHerencia;

import TP2.Ej_8.Fecha;

// Clase que hereda a la clase empleado
public class Vendedor extends Empleado {

    //Atributos de instancia
protected float ventasAcumuladas;
//Constructor
public Vendedor (int leg, float sb, Fecha fi, float v){
super(leg,sb,fi);
ventasAcumuladas = v; }
//Comandos
public void acumularVentas(float m){
ventasAcumuladas =+ m; }
public void inicializarVentas (){
ventasAcumuladas = 0; }
//Consultas
public float obtenerVentaAcumulada(){
return ventasAcumuladas; }
public float obtenerComisionAnual(){
return (float) (ventasAcumuladas * 0.05);}

}
