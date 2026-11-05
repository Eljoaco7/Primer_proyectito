package TP7.Ej_1;

import TP6.Ej_5.Rubrica;

public class Staff {

    // Atributos de instancia

    protected Rubrica [] s;
    protected int cant;

    // Constructor

    public Staff(int max){
        s = new Rubrica[max];
        cant = 0;
    }

    // Comandos

    public boolean agregarRubica(Rubrica r){
        boolean toRet = false;
        
        if(r != null && !estaLlena()){
            s[cant] = r;
            cant++;
            toRet = true;
        }

        return toRet;
    }

    public void eliminar(int p) {
        // 1) Asigno null a las que tienen productividad menor a p
        for (int i = 0; i < cant; i++) {
            if (s[i].productividad() < p) {
                s[i] = null;
            }
        }
        // 2) Comprimo: muevo las no nulas al principio, manteniendo el orden
        int j = 0; // próxima posición donde va una rúbrica "sobreviviente"
        for (int i = 0; i < cant; i++) {
            if (s[i] != null) {
                s[j] = s[i];
                j++;
            }
        }
        // 3) Anulo las posiciones que quedaron sobrando y actualizo cant
        for (int k = j; k < cant; k++) {
            s[k] = null;
        }
        cant = j;
    }

    // Consultas

    public boolean estaLlena(){
        return cant == s.length;
    }

    public int cantPosiciones(){
        return s.length;
    }

    public int cantRubricas(){
        return cant;
    }

    public Rubrica obtenerRubrica(int p){
        return s[p];
    }

    public int contarMayorP(int p){
        int cont = 0;

        for(int i = 0; i < cant; i++){
            if(s[i].productividad() > p){
                cont++;
            }
        }

        return cont;
    }

    public Staff totalMayorStaff(int t){
        Staff nuevo = new Staff(cantPosiciones());
        for(int i = 0; i < cant; i++){
            if(s[i].total() > t){
                nuevo.agregarRubica(s[i]);
            }
        }

        return nuevo;
    }
}