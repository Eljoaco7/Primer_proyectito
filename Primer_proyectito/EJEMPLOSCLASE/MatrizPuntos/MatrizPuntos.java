package Primer_proyectito.EJEMPLOSCLASE.MatrizPuntos;

import Claude.Circulo.*;;



public class MatrizPuntos {

    private Punto[][] mat;

    // Constructor

    public MatrizPuntos(int nfil, int ncol){
        mat = new Punto[nfil][ncol];
    }

    // Comandos

    public void establecerPunto(int f, int c, Punto p){
        mat[f][c] = p;
    }

    public void reemplazarNulos(){
        for(int i = 0; i < cantFilas(); i++){
            for(int j = 0; j < cantFilas(); i++){
                if(null == mat[i][j]){
                    mat[i][j] = new Punto(0,0);
                }
            }
        }
    }

    // Consultas

    public int cantFilas(){
        return mat.length;
    }

    public int cantCol(){
        return mat[0].length;
    }

    public Punto obtenerPunto(int f, int c){
        return mat[f][c];
    }

    public float mayorDistancia(){
        float mayor = 0;

        if(cantCol() >= 2){
            for(int i = 0; i < cantFilas(); i++){
                for(int j = 0; j < cantCol() - 1; j++){
                    if(mat[i][j] != null && mat[i][j + 1] != null && mat[i][j].distancia(mat[i][j + 1]) > mayor){
                        mayor = mat[i][j].distancia(mat[i][j + 1]);
                    }

                }

            }
        }    
        
      return mayor;  
    }

    public boolean hayNSeguidos(int f, int n){
        int cont = 0;
        if(n > 0 && n <= cantCol()){
            for(int j = 0; j < cantCol() && cont < n; j++){
                if(mat[f][j] != null && mat[f][j].obtenerX() == 0){
                    cont++;
                
                } else {
                    cont = 0;
                }
            }
        }

        return cont >= n;
    }

    public boolean hayAlMenosMconN(Punto p, int n, int m){
        int cantF = 0;
        int cantP = 0;

        for(int i = 0; i < cantFilas() && cantF < m; i++){
            cantP = 0;
            for(int j = 0; j < cantFilas() && cantP < m; j++){
                if(mat[i][j] != null && mat[i][j].esInverso(p)){
                    cantP++;
                }
                if(cantP >= m){
                    cantF++;
                }
            }
        }
        return cantF >= m;
    }
    

    public boolean hayExactamenteMconN(Punto p, int n, int m){
        int cantF = 0;
        int cantP = 0;

        for(int i = 0; i < cantFilas() && cantF < m + 1; i++){
            cantP = 0;
            for(int j = 0; j < cantFilas() && cantP < m; j++){
                if(mat[i][j] != null && mat[i][j].esInverso(p)){
                    cantP++;
                }
                if(cantP >= m){
                    cantF++;
                }
            }
        }
        return cantF >= m;
    }

    public TablaPuntos tablaInversos(Punto p){
        TablaPuntos tp = new TablaPuntos(cantFilas());
        boolean encontre = false;
        
        for(int i = 0; i < cantFilas(); i++){
            encontre = false;
            for(int j = 0; j < cantCol() && !encontre; j++){
                if(mat[i][j] != null && mat[i][j].esInverso(p)){
                    tp.insertar(i,mat[i][j])
                    encontre = true;
                }
            }
            if(!encontre){
                tp.insertar(i,null);
            }
        }
        return tp;
    }
}
