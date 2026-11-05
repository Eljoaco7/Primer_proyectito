package SegundoParcialPracticaClaudeYo;

public class TablaCriaturas {
    
    // Atributos de instancia

    protected Criatura[] t;

    // Constructor

    public TablaCriaturas(int max){
        t = new Criatura[max];
    }

    // COmandos
    
    public boolean agregarCriatura(Criatura c){
        boolean encontre = false;
        if(c != null){
            for(int i = 0; i < t.length && !encontre; i++){
                if(t[i] == null){
                    t[i] = c;
                    encontre = true;
                }
            }
        }
        return encontre;
    }

    public void eliminarMenosVida(){
        boolean hayCandidata = false;
        int pos = 0;

        for(int i = 0; i < t.length; i++){
            if(t[i] != null && (!hayCandidata || t[i].obtenerVida() < t[pos].obtenerVida())){
                hayCandidata = true;
                pos = i;
            }
        }

        if(hayCandidata){
            t[pos] = null;
        }
    }

    public Criatura obteneCriatura(int pos){
        Criatura toRet = null;
        if(pos >= 0 && pos < t.length){
            toRet = t[pos];
        }

        return toRet;
    }
}
