package Primer_proyectito.TP5.Ej_1;

import Ej_10.Jugador;

public class Historicos {
    
    // Atributos de instancia

    private Jugador [] jugadoresHistoricos;
    private int cant; // Sólo las primeras cant posiciones están ligadas

    // Constructor

    public Historicos(int n){
        jugadoresHistoricos = new Jugador[n];
        cant = 0;
    }

    // Comandos

    //Requiere que la colección no esté llena y j ligada
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
        return cant == jugadoresHistoricos.length;
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

    public boolean mMayores(int g, int m){
        boolean cumple = false;
        int cont = 0;

        for(int i = 0; i < cant; i++){
            if(jugadoresHistoricos[i].obtenerGolesConvertidos() > g)
            cont++;
        }

        if(cont == m){
            cumple = true;
        }

        return cumple;
    }

    public boolean alMenosMMayores(int g, int m){
        boolean cumple = false;
        int cont = 0;

        for(int i = 0; i < cant && cont < m; i++){
            if(jugadoresHistoricos[i].obtenerGolesConvertidos() > g)
            cont++;
        }

        if(cont == m){
            cumple = true;
        }

        return cumple;
    }

    public Historicos goleadores(int g) {
        Historicos resultado = new Historicos(cantPosiciones());
        for (int i = 0; i < cant; i++) {
            Jugador j = jugadoresHistoricos[i];
            if (j.obtenerGolesConvertidos() > g) {
                resultado.establecerJugador(j);
            }
        }
        return resultado;
    }
}

