package Ej_8;

public class Fecha {
    // Atributos de instancia
    private int dia,mes,anio;

    // Constructor
    public Fecha(int d, int m, int a){
        dia = d;
        mes = m;
        anio = a;

    }

    // Comandos
    public void establecerDia(int d){
        dia = d;

    }
    public void establecerMes(int m){
        mes = m;
    }
    public void establecerAnio(int a){
        anio = a;
    }
    
    // Consultas
    public int obtenerDia(){
        return dia;
    }
    public int obtenerMes(){
        return mes;
    }
    public int obtenerAnio(){
        return anio;
    }
    public boolean esBisiesto(){
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }
    public boolean esAnterior(Fecha f){
        if(anio != f.anio){
            return anio < f.anio;
        }
        if (mes != f.mes){
            return mes < f.mes;
        }
        
            return dia < f.dia;
    }
    public boolean mismoAnio(Fecha f){
        return anio == f.anio;
    }
    public boolean equals(Fecha f){
        if (f != null)
            return anio == f.anio 
         && mes == f.mes 
         && dia == f.dia;
         else
            return false;
    }
    public String toString(){
        return dia + "/" + mes + "/" + anio;
    }

}
