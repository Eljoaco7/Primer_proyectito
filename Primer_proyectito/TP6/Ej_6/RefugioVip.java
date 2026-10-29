package TP6.Ej_6;

import TP2.Ej_4.Refugio;

public class RefugioVip extends Refugio {
    
    // Atributos de clase

    private static final int capacidadSillones = 10;

    // Atributos de instancia

    private int sillones;

    // Constructor

    public RefugioVip(int a, int b, int c, int s){
        super(a, b, c);
        if(s > capacidadSillones){
            sillones = capacidadSillones;
        }
        else {
            sillones = s;
        }
    }

    // Comandos

    public boolean ocuparSillon(){
        boolean ret = false;
        if(sillones < capacidadSillones){
            sillones++;
            ret = true;
        }

        return ret;
    }

    public boolean desocuparSillon(){
        boolean ret = false;
        if(sillones > 0){
            sillones--;
            ret = true;
        }

        return ret;
    }

    // Consultas

    public int obtenerSillones(){
        return sillones;
    }

    public int disponibilidad(){
        return super.disponibilidad() + obtenerSillones();
    }

    public RefugioVip clone(){
        RefugioVip rv = new RefugioVip(alimentos, bebidas, camas, sillones);
      return rv;
    }


    
}
