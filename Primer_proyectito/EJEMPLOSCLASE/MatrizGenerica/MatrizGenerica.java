package EJEMPLOSCLASE.MatrizGenerica;

public class MatrizGenerica {

    // Atributos de instancia

    protected Elemento [][] m;   // la clase elemento va a ser abstracta por ser una clase "Ficticia"

    // Constructor

    public MatrizGenerica(int f, int c){
        m = new Elemento[f][c];
    }

    // Comandos

    public void establecerE(int f, int c, Elemento e){
        m[f][c] = e;
    }

    public void invertirFilas(int f1, int f2){
        Elemento aux = null;

        for(int i = 0; i < cantColumnas(); i++){
            aux = m[f1][i];
            m[f1][i] = m[f2][i];
            m[f2][i] = aux;
        }
    }

    // Consultas

    public boolean existePos(int f, int c){
        return (f >= 0 && f < cantFilas() && c >= 0 && c < cantColumnas()); // esta es la forma correcta de controlar si son validas
    }

    public int cantFilas(){
        return m.length;
    }

    public int cantColumnas(){
        return m[0].length;
    }

    public Elemento obtenerE(int f, int c){
        return m[f][c];
    }

    public MatrizGenerica clone(){
        MatrizGenerica mg = new MatrizGenerica(cantFilas(), cantColumnas());
        for(int i = 0; i < cantFilas(); i++){
            for(int j = 0; j < cantColumnas(); j++){
               if(m[i][j] != null){ 
                mg.establecerE(i, j, m[i][j].clone());
              }

              else{
                mg.establecerE(i, j, null);
              }

             

            }
        }

        return mg;
    }

    public boolean equals(MatrizGenerica mg){
        boolean es = cantFilas() == mg.cantFilas()
        && cantColumnas() == mg.cantColumnas();

        for(int i = 0; i < cantFilas() && es; i++){
            for(int j = 0; j < cantColumnas() && es; j++){
                if(m[i][j] != null && mg.obtenerE(i,j) != null){
                    es = m[i][j].equals(mg.obtenerE(i, j));
                }
                else {
                    es = m[i][j] == mg.obtenerE(i, j);
                }
            }
        }

        return es;

    }

    public boolean TodosNeutros(){
        boolean todos = true;

        for(int i = 0; i < cantFilas() && todos; i++){
            for(int j = 0; j < cantColumnas() && todos; j++){
                if(m[i][j] != null){
                    todos = m[i][j].esNeutro();
                }
            }
        }

        return todos;
    }

    


    
}
