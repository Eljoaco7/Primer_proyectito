package SegundoParcialPracticaYo;

public class Jardin {
    
    // Atributos de clase

    protected static final int cantFilas = 5;

    // Atributos de instancia

    protected Personaje [][] g;

    // Constructor

    public Jardin(int cantCols){
        g = new Personaje[cantFilas][cantCols];
    }

    // Comandos

    public void establecerPersonaje(int f, int c, Personaje p){
        if(p != null){
            g[f][c] = p;
        }
    }

    // Consultas

    public Personaje obtenerPersonaje(int f, int c){
        Personaje toRet = null;
        if(f >= 0 && f < cantFilas() && c >= 0 && c < cantCols()){
            toRet = g[f][c];
        }

        return toRet;
    }

    public int primerFilaConNConFuerzaF(int n, int f){
        int fila = -1;
        boolean encontre = false;
        

        for(int i = 0; i < cantFilas() && !encontre; i++){
            int cont = 0;
            for(int j = 0; j < cantCols() && ! encontre; j++){
                if(g[i][j] != null && g[i][j].obtenerFuerza() == f){
                    cont++;
                }
                if(cont >= n){
                    fila = i;
                    encontre = true;
                }
            }
        }
        return fila;
    }

    private int cantFilas(){
        return g.length;
    }

    private int cantCols(){
        return g[0].length;
    }

    public TablaPersonajes personajesEquiv(Personaje p){
        TablaPersonajes c = null;
        
        if(p != null){
            c = new TablaPersonajes(cantCols()*cantFilas());
            for(int i = 0; i < cantFilas(); i++){
                for(int j = 0; j < cantCols(); j++){
                    
                    if(g[i][j] != null && g[i][j].equals(p)){
                        c.agregarPersonaje(g[i][j]);
                    }
                }
            }
        }
        return c;
    }

    public boolean hayFilasConVivosFuertes(int n, int f){
        int filas = 0;

        for(int i = 0; i < cantFilas() && filas <= n; i++){
            boolean cumple = false;
            for(int j = 0; j < cantCols() && !cumple; j++){
                if(g[i][j]!=null && g[i][j].obtenerSalud()>0 && g[i][j].obtenerFuerza()>f){
                    cumple = true;
                }

                if(cumple){
                    filas++;
                }
            }
        }

        return filas == n;
    }



}

