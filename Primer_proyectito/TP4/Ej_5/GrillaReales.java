package Primer_proyectito.TP4.Ej_5;

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


   



}
