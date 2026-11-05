package SegundoParcialPracticaYo;



public class Planta extends Personaje {

    protected int energia;

    public Planta(int s, int f, int ener){
        super(s, f);
        energia = ener;
    }

    public int obtenerEnergia(){
        return energia;
    }

    public boolean equals(Personaje p){
        boolean iguales = false;

        if(p != null){
            iguales = super.equals(p);
            if(iguales){
                Planta pl = (Planta) p;
                iguales = energia == pl.obtenerEnergia();
            }
        }

        return iguales;
    }
}
