package Primer_proyectito.TP3.Ej_4;

import Ej_9.Color;

public class Borde {
    // Atributos de instancia

    private int grosor;
    private Color color;

    // Constructor

    public Borde(int g, Color c){
        grosor = g;
        color = c;
    }

    // Comandos

    public void establecerGrosor(int g){
        grosor = g;
    }

    public void establecerColor(Color c){
        color = c;
    }

    public void copy(Borde b){
        if (b != null){
            grosor = b.grosor;
            color = b.color;
        }
    }

    // Consultas

    public int obtenerGrosor(){
        return grosor;
    }

    public Color obtenerColor(){
        return color;
    }

    public Borde clone(){
        return new Borde(grosor, color);
    }

    public boolean equals(Borde b){
        boolean retorno = false;
        
         if (grosor == b.grosor && color == b.color){
            retorno = true;
         }
         return retorno;
    }

    public String toString(){
        
        return "Borde[grosor=" + grosor + ", color=" + color + "]";
    }

    
}
