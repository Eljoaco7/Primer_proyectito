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
        grosor = b.obtenerGrosor();
        color = b.obtenerColor();
    }

    // Consultas

    public int obtenerGrosor(){
        return grosor;
    }

    public Color obtenerColor(){
        return color;
    }

    public Borde clone(){
        Borde clon = new Borde(grosor, color);
        return clon;
    }

    public boolean equals(Borde b){
        return grosor == b.obtenerGrosor()
        && color == b.obtenerColor();
    }

    public String toString(){
        
        return "Borde[grosor=" + grosor + ", color=" + color + "]";
    }
}