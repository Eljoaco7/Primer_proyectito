package EJEMPLOSCLASE.MatrizGenerica;

abstract class Pixel extends Elemento {

    // Atributos de instancia

    protected int r,g,b;

    // Constructor

    public Pixel(int r, int g ,int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }


    // Comandos

    public Elemento clone(){
        Pixel p = new Pixel(r,g,b);
        return p;
    }

    public boolean equals(Elemento e){
        boolean toRet = this == e;
        if(!toRet && e !=null){
            if(getClass() == e.getClass()){
                Pixel aux = (Pixel) e;
                toRet = r == aux.obtenerR() && g == aux.obtenerG() && b == aux.obtenerB();
            }
        }
    }

    


    
}
