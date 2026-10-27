package Primer_proyectito.SegundoParcialEjemplo;

public class Zombie extends Personaje {

    protected int velocidad;
    protected boolean casco;

    public Zombie(int s, int f, int velo, boolean c){
        super(s, f);
        velocidad = velo;
        casco = c;
    }

    public boolean equals (Personaje p){
        boolean eq = false;
        if(p != null){
            if(this == p){
                eq = true;
            }
            else if(getClass() == p.getClass()){
                Zombie z = (Zombie) p;
                eq = super.equals(p) 
                && velocidad == z.obtenerVelocidad 
                && casco == z.tieneCasco;
            }
        }

        return eq;
    }
    
    public void recibirAtaque(int d){
        if(!casco){
            super.recibirAtaque(d);
        }
        else
            salud = d/2;

        if(salud < d){
            salud = 0;
        }
    }
    
    
}
