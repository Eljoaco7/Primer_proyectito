package EJEMPLOSCLASE.NotasParciales;

public class NotasParciales {
    private static final int min = 60;
    private int [][] np;
    public NotasParciales(int nfil, int ncol){
        np = new int[nfil][ncol];

    }

    public void establecerNota(int n, int f, int c){
        if(n >= 0 && n <= 100)
            np[f][c] = n;
    }

    public int obtenerNota(int f, int c){
        return np[f][c];
    }

    public int cantAprobados(){
        int cont = 0;
        for(int i = 0; i < np.length; i++)
            for(int j = 0; j < np[0].length; j++)
              if(np[i][j] > min)
                cont++;
    }
    /*public int cantAprobados(){                  LO MISMO PERO EL RECORRIDO ES AL REVEZ, onda en vez de filaXcolumna es ColumnaXFIla
        int cont = 0;
        for(int j = 0; j < np[0].length; i++)
        
            for(int i = 0; i < np.length; i++)
              if(np[i][j] > min)
                cont++;
    } */
}
