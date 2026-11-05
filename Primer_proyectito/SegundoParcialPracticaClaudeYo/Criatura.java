package SegundoParcialPracticaClaudeYo;

abstract class Criatura {

    // Atributos de instancia

    protected int vida;
    protected int poder;

    // Constructor

    public Criatura(int v, int p){
        vida = v;
        poder = p;
    }

    // Consultas

    public int obtenerVida(){
        return vida;
    }

    public int obtenerPoder(){
        return poder;
    }

    public boolean equals(Criatura c){
        boolean iguales = false;

        if(getClass() == c.getClass()){
            iguales = vida == c.obtenerVida()
            && poder == c.obtenerPoder();
        }
        return iguales;
    }

    // Comandos

    public void recibirDanio(int d){
        if(vida >= d){
            vida = vida - d;
        }
        else{
            vida = 0;
        }

    }

    public void atacar(Criatura c){
        if(this.obtenerPoder() > c.obtenerPoder()){
            c.recibirDanio(obtenerPoder() - c.obtenerPoder());
        }
    }
    
}
