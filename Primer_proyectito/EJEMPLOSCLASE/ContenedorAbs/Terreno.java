package Primer_proyectito.EJEMPLOSCLASE.ContenedorAbs;

public class Terreno {

    // Atributos de instancia

    private Contenedor[][] t;

    // Constructor

    public Terreno(int nF, int nC){
        t = new Contenedor[nF]{nC};
    }

    // Comandos

    public void colocar(Contenedor con, int f, int c){
        t[f][c] = con;
    }

    // ...

    // Consultas

    public int cantMayorImpacto(float g){
        int cont = 0;
        
        for(int i = 0; i < cantFilas(); i++){
            for(int j = 0; j < cantColumnas(); j++){
                if(t[i][j] != null)
                    if(t[i][j].obtenerImpacto() > g)
                        cont++;
            }
        }
        return cont;
    }

    public int cantFilas(){
        return t.length;
    }

    /*public float mayorToxicidad(){
        float mayor = 0;
        for(int i = 0; i < cantFilas(); i++){
            for(int j = 0; j < cantColumnas(); j++){
                if(t[i][j] != null && t[i][j].obtenerToxicidad() > mayor){
                    mayor = t[i][j].obtenerToxicidad();
                }
            }
        }
        return mayor;
    }*/

     // Esto da error en ejecucion pero por ahora no sabemos asegurar que va a llegar un contaminante de una
    public float mayorToxicidad(){
        float mayor = 0;
        Contaminante c;
        for(int i = 0; i < cantFilas(); i++){
            for(int j = 0; j < cantColumnas(); j++){
                if(t[i][j] != null){
                    c = (Contaminante) t[i][j];
                    if(c.obtenerToxicidad() > mayor){
                        mayor = c.obtenerToxicidad();
                    }

                    
                }
            }
        }
        return mayor;
    }

    
}
