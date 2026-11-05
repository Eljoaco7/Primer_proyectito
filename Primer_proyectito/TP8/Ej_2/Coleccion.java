package TP8.Ej_2;

public class Coleccion {

    protected Elemento [] col;

    protected int cant;

    // Constructor

    public Coleccion(int max){
        col = new Elemento[max];
    }

    // Comandos

    public void insertar(Elemento e){
        col[cant] = e;
        cant++;
    }

    public void eliminar(Elemento e){
        int p = -1;
        for(int i = 0; i < cant; i++){
            if(col[i] != null && col[i].esEquivalente(e)){
                p = i;
            }
            
        }
        if(p != -1){
            for(int j = p; j < cant - 1; j++){
                col[j] = col[j + 1];
            }

            col[cant - 1] = null;
            cant--;
        }
    }
    
}
