package Primer_proyectito.TP3.Ej_6;

import Ej_10.Jugador;
 

public class Equipo {
    // Atributos de instancia

    private String nombre;
    private Jugador capitan;
    private int pG,pE,pP;
    private int gFavor,gContra;

    // Constructor

    public Equipo(String nom, Jugador cap){
        nombre = nom;
        capitan = cap;
        pG = 0;
        pE = 0;
        pP = 0;
        gFavor = 0;
        gContra = 0;
    }

    // Comandos

    public void incrementarPG(boolean jugoElCap){
        pG++;
        if(jugoElCap){
            capitan.aumentarUnPartido();
        }

    }

    public void incrementarPE(boolean jugoElCap){
        pE++;
        if(jugoElCap){
            capitan.aumentarUnPartido();
        }

    }

    public void incrementarPP(boolean jugoElCap){
        pP++;
        if(jugoElCap){
            capitan.aumentarUnPartido();
        }

    }

    public void aumentarGFavor(int total, int delCap){
        gFavor++;
        if(delCap > 0)
            capitan.aumentarGoles(delCap);
    }
    public void aumentarGContra(int total){
        gContra++;
    }

    // Consultas

    public String obtenerNombre(){
        return nombre;
    }
    public Jugador obtenerCapitan(){
        return capitan;
    }
    public int obtenerPG(){
        return pG;
    }
    public int obtenerPE(){
        return pE;
    }
    public int obtenerPP(){
        return pP;
    }
    public int obtenerGFavor(){
        return gFavor;
    }
    public int obtenerGContra(){
        return gContra;
    }
    public int obtenerPartidos(){
        return pG + pE + pP;
    }
    public int obtenerPuntos(){
        int puntos;
        puntos = pG*3 + pE*1;
        return puntos;
    
    }

    public Equipo mejorPuntaje(Equipo e){
        Equipo retorno = this;
        int misPuntos = this.obtenerPuntos();
        int PuntosRivales = e.obtenerPuntos();
        if(PuntosRivales > misPuntos){
            retorno = e;
         } else if(PuntosRivales==misPuntos){
            if (e.obtenerGFavor() > this.obtenerGFavor()){
                retorno = e;
            } else if (e.obtenerGFavor() == this.obtenerGFavor()){
                if (e.obtenerGContra() < this.obtenerGContra()){
                    retorno = e;
                }
            }


         }
         return retorno;
        }
        public Jugador capitanConMasGoles(Equipo e){
            Jugador retorno;
            if (capitan.obtenerGolesConvertidos() > e.obtenerCapitan().obtenerGolesConvertidos()){
                retorno = capitan;
             } else {
                retorno = e.obtenerCapitan();
             }

            return retorno;
        }

        public String toString(){
            String retorno;
         retorno = "Nombre: " + nombre + " - Capitan: " + capitan.obtenerNombre()
                + " - PG: " + pG + " - PE: " + pE + " - PP: " + pP
                + " - GFavor: " + gFavor + " - GContra: " + gContra
                + " - Puntos: " + this.obtenerPuntos();
        return retorno; 
        }

        public boolean equals(Equipo e) {
        boolean retorno = false;
        // requiere e ligado
        if (nombre.equals(e.obtenerNombre())
                && capitan.equals(e.obtenerCapitan())
                && pG == e.obtenerPG()
                && pE == e.obtenerPE()
                && pP == e.obtenerPP()
                && gFavor == e.obtenerGFavor()
                && gContra == e.obtenerGContra()) {
            retorno = true;
        }
        return retorno;

          


        }
        
        

    }