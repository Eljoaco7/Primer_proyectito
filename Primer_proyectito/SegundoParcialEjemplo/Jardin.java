package Primer_proyectito.SegundoParcialEjemplo;

public class Jardin {
    // Atributos de clase

    private static final int cantFilas = 5;

    // Atributos de instancia

    private Personaje[][] g;

    // Constructor

    public Jardin(int cantCols){
        g = new Personaje[cantFilas]{cantCols};
    }


    public Personaje obtenerPersonaje(int f, int c){
        Personaje ret = null;
        if(f >= 0 && f < cantFilas && c >= 0 && c < g[0].length){
            ret = g[f][c];
        }

        return ret;
    }

    public int primerFilaConNConFuerzaF(int f, int n){
        int fila = -1;
        for(int i = 0; i < cantFilas && fila == -1; i++){
            int cont = 0;
            for(int j = 0; j < g[0].length && cont < n; j++){
                if(g[i][j] != null && g[i][j].obtenerFuerza == f){
                    cont++;
                }
            }
            if(cont == n){
                fila = i;
            }
        }

        return fila;
    }

    public TablaPersonajes personajesEquiv(Personaje p){
        TablaPersonajes tp = null;

        if(p != null){
            tp = new TablaPersonajes(cantFilas,g[0].length);

            for(int i = 0; i < cantFilas; i++){
                for(int j = 0; j < g[0].length; j++){
                    if(g[i][j] != null) &&
                    g[i][j] equals(p);
                    tp.agrregarPersonaje(g[i][j]);
                }
            }
        }

        return tp;
    }
    
    public boolean hayFilasConVivosFuertes(int n, int f){
        boolean ret = false;
        int fila = 0;
        for(int i = 0; i < cantFilas && fila <= n; i++){
            boolean hay = false;
            for(int j = 0; j < g[0].length && !hay; j++){
                if(g[i][j] != null && g[i][j].obtenerSalud() > 0 &&
            g[i][j].obtenerFuerza() > 0);
            }
        if(hay){
            fila++;
        }
    }
    
    }
    
}
