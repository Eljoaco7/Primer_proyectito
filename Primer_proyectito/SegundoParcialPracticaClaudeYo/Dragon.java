package SegundoParcialPracticaClaudeYo;

public class Dragon extends Criatura {

    // Atributos de instancia

    protected int nivelFuego;
    protected boolean enfurecido;

    // Constructor

    public Dragon(int v, int p, int nf, boolean e){
        super(v, p);
        nivelFuego = nf;
        enfurecido = e;
    }

    // Consultas

    public int obtenerNivelFuego(){
        return nivelFuego;
    }

    public boolean estaEnfurecido(){
        return enfurecido;
    }

    public boolean equals(Criatura c){
        boolean iguales = false;

        if(getClass() == c.getClass()){
            Dragon d = (Dragon) c;
            iguales = super.equals(c)
            && nivelFuego == d.obtenerNivelFuego()
            && enfurecido == d.estaEnfurecido();
        }

        return iguales;
    }

    // Comandos

    public void recibirDanio(int d){
        if(!estaEnfurecido()){
            super.recibirDanio(d);
        }
        else{
            if(d > obtenerNivelFuego()){
                super.recibirDanio(d - obtenerNivelFuego());
            }
        }
    }

    public void atacar(Criatura c){
        if(estaEnfurecido() && obtenerNivelFuego() > 2){
            c.recibirDanio(obtenerPoder()*3);
        }
        else{
            super.atacar(c);
        }
    }

    
    
}
