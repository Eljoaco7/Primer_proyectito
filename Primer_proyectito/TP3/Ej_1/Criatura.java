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
        Criatura c = new Criatura(r);
         c.energia = maxEnergia;
         c.caminatas = 0;
         c.despierto = true;

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

    
    
    
}
