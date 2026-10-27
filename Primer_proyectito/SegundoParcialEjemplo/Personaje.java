package Primer_proyectito.SegundoParcialEjemplo;

public abstract class Personaje {
    // Atributos de instancia

    protected int salud;
    protected int fuerza;

    // Constructor

    public Personaje(int s, int f){
        salud = s;
        fuerza = f;
    }

    // Consultas

    public boolean equals(Personaje p){
        boolean eq = false;
        if(this == p){
            eq = true;
        }
        else if(getClass() == p.getclass()){
            eq = salud == p.obtenerSalud 
            && fuerza == p.obtenerFuerza;
        }

        return eq;
    }

    public void recibirAtaque(int d){
        if(d >= salud){
            salud = 0;
        }
        else
            salud = salud - d;
    }

    public void atacar(Personaje p){
        if(p.obtenerFuerza() < fuerza){
            p.recibirAtaque(fuerza);
        }
    }

    

    
}
