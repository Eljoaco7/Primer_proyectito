package SegundoParcialPracticaYo;

abstract class Personaje {

    // Atributos de instancia

    protected int salud;
    protected int fuerza;

    // Constructor

    public Personaje(int s, int f){
        salud = s;
        fuerza = f;
    }

    // Consultas

    public int obtenerSalud(){
        return salud;
    }

    public int obtenerFuerza(){
        return fuerza;
    }

    public boolean equals(Personaje p){
        boolean iguales = getClass() == p.getClass();

        if(iguales){
            iguales = salud == p.obtenerSalud()
            && fuerza == p.obtenerFuerza();
        }

        return iguales;
    }

    // Comandos

    public void recibirAtaque(int d){
        if(salud > 0 && salud >= d){
            salud = salud - d;
        }
        else{
            salud = 0;
        }
    }

    public void atacar(Personaje p){
        if(p.obtenerFuerza() < obtenerFuerza()){
            p.recibirAtaque(obtenerFuerza());
        }
    }
    
}
