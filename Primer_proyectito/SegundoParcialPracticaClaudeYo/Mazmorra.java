package SegundoParcialPracticaClaudeYo;

public class Mazmorra {
    
    // Atributos de clase

    protected static final int cantFilas = 4;

    // Atributos de instancia

    protected Criatura[][] m;

    // Constructor

    public Mazmorra(int cantCols){
        m = new Criatura[cantFilas][cantCols];
    }

    // Comandos

    public void establecerCriatura(int f, int c, Criatura cr){
        if(cr != null){
            m[f][c] = cr;
        }
        else{
            m[f][c] = null;
        }

    }

    // Consultas

    public Criatura obtenerCriatura(int f, int c){
        Criatura retorno = null;
        if(f >= 0 && f < m.length && c >= 0 && c < m.length){
            retorno = m[f][c];
        }

        return retorno;
    }

    public int primerFilaConNConPoderP(int n, int p){
        boolean cumple = false;
        int toRet = -1;

        for(int i = 0; i < m.length && !cumple; i++){
            int cont = 0;
            for(int j = 0; j < m[0].length && !cumple; j++){
                if(m[i][j] != null && m[i][j].obtenerPoder() == p){
                    cont++;
                }
                if(cont >= n){
                    cumple = true;
                    toRet = i;
                }
            }
        }

        return toRet;
    }

    public TablaCriaturas criaturasEquiv(Criatura c) {
    TablaCriaturas retorno = null;

    if (c != null) {
        retorno = new TablaCriaturas(cantFilas * m[0].length);
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (m[i][j] != null && m[i][j].equals(c))
                    retorno.agregarCriatura(m[i][j]);
        }
        return retorno;
    }

    
}
