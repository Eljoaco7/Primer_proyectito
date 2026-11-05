package SegundoParcialPracticaYo;

public class TablaPersonajes {
    
    // Atributos de instancia

    protected Personaje [] t;

    // Constructor

    public TablaPersonajes(int max){
        t = new Personaje[max];
    }

    // Comandos

    public boolean agregarPersonaje(Personaje p){
        boolean encontrePrimera = false;
        
        if(p != null){
            for(int i = 0; i < t.length &&  !encontrePrimera; i++){
                if(t[i] == null){
                    t[i] = p;
                    encontrePrimera = true;
                }
            }
        }

        return encontrePrimera;
    }

    public void eliminarMasDebil(){
        int posMin = 0;
        boolean hay = false;

        for(int i = 0; i < t.length; i++){
            if(t[i] != null && !hay || t[i].obtenerFuerza() < t[posMin].obtenerFuerza()){
                posMin = i;
                hay = true;
            }
        }
        if(hay){
            t[posMin] = null;
        }
    }

    // Consultas

    public Personaje obtenerPersonaje(int pos){
        Personaje toRet = null;

        if(pos>=0 && pos<t.length){
            toRet = t[pos];
        }

        return toRet;
    }
}
