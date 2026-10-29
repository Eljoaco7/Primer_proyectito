package EJEMPLOSCLASE.MatrizGenerica;

public class Imagen extends MatrizGenerica {

    // Atributos de instancia = lo que hereda es la matriz de la matriz generica

    // Constructor

    public Imagen(int n, int m){
        super(n, m);
    }

    public int cantidadNegros(){
        int cont = 0;
        Pixel p;

        for(int i = 0; i < cantFilas(); i++){
            for(int j = 0; j < cantColumnas(); j++){
                if(m[i][j] != null){
                    p = (Pixel) m[i][j];
                    if(p.obtenerR() == 0 && p.obtenerG() == 0 && p.obtenerB() == 0){
                        cont++;
                    }
                }
            }
        }

        return cont;
    }
    
}
