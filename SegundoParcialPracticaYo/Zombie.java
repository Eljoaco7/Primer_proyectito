package SegundoParcialPracticaYo;

public class Zombie extends Personaje {

    // Atributos de instancia

    protected int velocidad;
    protected boolean casco;

    // Constructor

    public Zombie(int s, int f, int vel, boolean c){
        super(s, f);
        velocidad = vel;
        casco = c;
    }

    // Consultas

    public int obtenerVelocidad(){
        return velocidad;
    }

    public boolean tieneCasco(){
        return casco;
    }

    public boolean equals(Personaje p){
        boolean iguales = false;

        if(p != null && getClass() == p.getClass()){
            Zombie z = (Zombie) p;
            iguales = super.equals(p) 
            && velocidad == z.obtenerVelocidad() 
            && casco == z.tieneCasco();
        }

        return iguales;
    }

    public void recibirAtaque(int d){
        if(!tieneCasco()){
            super.recibirAtaque(d);
        }
        else if (salud > 0 && salud >= d/2){
            salud = salud - d/2;
        }
        else{
            salud = 0;
        }
    }

    public void atacar(Personaje p){
        if(tieneCasco() && velocidad > 2){
            p.recibirAtaque(obtenerFuerza()*2);
        }
        else{
            super.atacar(p);
        }
    }


    
}
