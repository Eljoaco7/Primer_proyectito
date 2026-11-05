package TP5.Ej_1;

import TP2.Ej_10.Jugador;

public class Historicos {
    
    // Atributos de instancia

    protected Jugador [] jugadoresHistoricos;
    protected int cant;

    // Constructor

    public Historicos(int n){
        jugadoresHistoricos = new Jugador[n];
        cant = 0;
    }

    // Comandos

    public void establecerJugador(Jugador j){
        jugadoresHistoricos[cant] = j;
        cant++;
    }

    public void ordenar() {
    Jugador aux;

    for (int i = 0; i < cant - 1; i++) {
        for (int k = 0; k < cant - 1 - i; k++) {
            if (jugadoresHistoricos[k].obtenerNombre().compareTo(jugadoresHistoricos[k + 1].obtenerNombre()) > 0) {
                aux = jugadoresHistoricos[k];
                jugadoresHistoricos[k] = jugadoresHistoricos[k + 1];
                jugadoresHistoricos[k + 1] = aux;
            }
        }
    }
  }

    // Consultas

    public boolean estaLlena(){
        return cant == cantPosiciones();
    }

    public int cantPosiciones(){
        return jugadoresHistoricos.length;
    }

    public int cantJugadores(){
        return cant;
    }

    public Jugador obtenerJugador(int p){
        return jugadoresHistoricos[p];
    }

    public boolean mMayores(int g, int m) {
    boolean cumple = false;
    int cont = 0;

    if (cant >= m) {
        // Recorre mientras queden elementos y cont no supere m
        for (int i = 0; i < cant && cont <= m; i++) {
            if (jugadoresHistoricos[i].obtenerGolesConvertidos() > g) {
                cont++;
            }
        }
        
        // Verifica si la cantidad fue EXACTAMENTE m
        if (cont == m) {
            cumple = true;
        }
    }

    return cumple;
}

    public boolean alMenosMMayores(int g, int m){
        boolean cumple = false;
        int cont = 0;

        for(int i = 0; i < cant && !cumple; i++){
            if(jugadoresHistoricos[i].obtenerGolesConvertidos() > g){
                cont++;
            }
            if(cont >= m){
                cumple = true;
            }
        }

        return cumple;
    }

    public Historicos goleadores(int g){
        Historicos h = new Historicos(cantPosiciones());
        for(int i = 0; i < cant; i++){
            if(jugadoresHistoricos[i].obtenerGolesConvertidos() > g){
                h.establecerJugador(jugadoresHistoricos[i]);
            }
        }

        return h;
    }


}

