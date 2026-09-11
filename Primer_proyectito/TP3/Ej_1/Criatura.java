package Primer_proyectito.TP3.Ej_1;

import Ej_4.Refugio;

public class Criatura {
    // Atributos de clase
    private static final int maxEnergia = 100;
    private static final int minEnergia = 0;
    private static final int consumoEnergia = 10;

    // Atributos de instancia

    private int energia,caminatas;
    private boolean despierto;
    private Refugio refugio;

    // Constructor

    public Criatura(Refugio r){
         refugio = r;
         energia = maxEnergia;
         caminatas = 0;
         despierto = true;

    }
    // Comandos

    public boolean comer(){
        boolean retorno = false;
        if(despierto && refugio.obtenerAlimentos() > 0){
            retorno = true;
            refugio.consumirAlimento();
            if(energia < maxEnergia)
                energia++;

        }
        return retorno;

    }
    public boolean beber(){
        boolean retorno = false;
        if(despierto && refugio.obtenerBebidas() > 0){
            retorno = true;
            refugio.consumirBebida();
            if(energia < maxEnergia)
                energia++;

        }
        return retorno;


    }
    public boolean dormir(){
        boolean retorno = false;
        if(despierto && refugio.ocuparCama()){
            
            despierto = false;
            retorno = true;
        }
        return retorno;

    }
    public boolean despertar(){
        boolean retorno = false;
        if (!despierto)
            despierto = true;
            refugio.desocuparCama();
            caminatas = 0;
            retorno = true;
        return retorno;


    }
    public boolean caminar(){
    boolean retorno = false;
    if (despierto && energia >= consumoEnergia && caminatas < 3){
        energia = energia - consumoEnergia;
        caminatas++;
        retorno = true;
    } else if (despierto && caminatas >= 3) {
        if (refugio.ocuparCama()) {
            despierto = false;
        } else {              // si no hay camas
            energia = minEnergia;
        }
        retorno = true;
    }
    return retorno;
}



    // Consultas

    public int obtenerEnergia(){
        return energia;
    }
    public int obtenerCaminatas(){
        return caminatas;
    }
    public int obtenerHumor(){
        int humor = 1;
        if (refugio.esHabitable()==false){    // se que es redundante pero queria cumplir la consigna
            humor = 1;
        }
        else if (energia >= 0 && energia <= 40)
            humor = 1;
        else if (energia > 40 && energia <= 70)
            humor = 2;
        else
            humor = 3;
        return humor;
    }
    
    public  Refugio obtenerRefugio(){
        return refugio;
    }
    
    public boolean estaDormido(){
        return !despierto;
    }

    public boolean mayorEnergia(Criatura c){
        return energia > c.obtenerEnergia();
    }

    public String toString(){
        return "Energia: " + energia + " / " + "Caminatas: " + caminatas + " / " + "Despierto: " + despierto + " / " + "Humor: " + obtenerHumor(); 
    }

    
    
    
}
