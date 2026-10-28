package TP4.Ej_5;

public class GrillaReales {

    // Atributos de instancia

    private float [][] grilla;

    // Constructor

    public GrillaReales(int f, int c){
        grilla = new float [f][c];
    }

    // Comandos

    public void establecerReal(int f, int c, float r){
        grilla[f][c] = r;
    }

    public void reemplazar(float r1, float r2){
        for (int i = 0; i < cantFilas(); i++) {
            for (int j = 0; j < cantColumnas(); j++) {
                if(grilla[i][j] == r1){
                    grilla[i][j] = r2;
                }
            }
        }
    }

    public boolean intercambiarFilas(int f1, int f2){
    boolean retorno = false;

    if(0 <= f1 && 0 <= f2 && f1 < cantFilas() && f2 < cantFilas()){
        retorno = true;
        for(int j = 0; j < cantColumnas(); j++){
            float aux = grilla[f1][j];
            grilla[f1][j] = grilla[f2][j];
            grilla[f2][j] = aux;
        }
    }
    return retorno;
  }

    // Consultas

    public float obtenerReal(int f, int c){
        return grilla[f][c];
    }

    public int cantFilas(){
        return grilla.length;
    }

    public int cantColumnas(){
        return grilla[0].length;
    }

    public float total(){
        float sumadetodos = 0;

        for(int i = 0; i < cantFilas(); i++){
            for(int j = 0; j < cantColumnas(); j++){
                sumadetodos = sumadetodos + grilla[i][j];
            }
        }
        return sumadetodos;
    }

    public float totalColumna(int c) {
        float suma = 0;
        for (int i = 0; i < cantFilas(); i++) {
            suma += grilla[i][c];
        }
        return suma;
    }

    public boolean estaNum(float r){
        boolean esta = false;

        for(int i = 0; i < cantFilas() && !esta; i++){
            for(int j = 0; j < cantColumnas() && !esta; j++){
                if(grilla[i][j] == r){
                    esta = true;
                }
            }
        }

        return esta;
    }

    public int cantidadMayores(float r){
        int cont = 0;

        for(int i = 0; i < cantFilas(); i++){
            for(int j = 0; j < cantColumnas(); j++){
                if(grilla[i][j] > r){
                    cont++;
                }
            }
        }
        return cont;
    }

    public boolean esFilaCreciente(int f){
        boolean es = true;

        for(int j = 0; j < cantColumnas() && es; j++){
            if(grilla[f][j] < grilla[f][j+1]){
                es = false;
            }
        }
        return es;
    }

    public boolean hayNMayoresConsecutivos(int n, float r){
        boolean tiene = false;
        

        for(int i = 0; i < cantFilas() && !tiene; i++){
            int cont = 0;
            for(int j = 0; j < cantColumnas() && !tiene; j++){
                if(grilla[i][j] > r){
                    cont++;
                }
                else
                    cont = 0;
                if(cont == n){
                    tiene = true;
                }
            }
        }

        return tiene;
    }

    public boolean esTranspuesta(GrillaReales g){
        GrillaReales t = this.transpuesta();
        boolean es = true;

        if(t.cantFilas() == g.cantFilas() && t.cantColumnas() == g.cantColumnas()){
            for(int i = 0; i < cantFilas() && es; i++){
                for(int j = 0; j < cantColumnas() && es; j++){
                    if(t.obtenerReal(i, j) != g.obtenerReal(i, j)){
                        es = false;
                    }
                }
            }
        }
        return es;
    }

    public GrillaReales transpuesta(){
        GrillaReales t = new GrillaReales(cantColumnas(), cantFilas());
        

        for(int i = 0; i < cantFilas(); i++){
            for(int j = 0; j < cantColumnas(); j++){
                t.establecerReal(j, i, grilla[i][j]);
            }
        }
        return t;
    }
}
