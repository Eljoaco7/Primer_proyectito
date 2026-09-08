package EJEMPLOSCLASE;

public class Recta {
    private Punto p1;
    private Punto p2;
    public Recta(Punto p1,Punto p2){
        if(p1 == null)
            p1 = new Punto(0,0);
         else
            this.p1 = p1;
        if(p2 == null)
            p2 = new Punto(0,1);
         else
            this.p2 = p2;
    }
    public void copy(Recta l){
        p1.copy(l.obtenerP1());
        p2.copy(l.obtenerP2());

    }
    public Punto obtenerP1(){
        return p1;
    }
    public Punto obtenerP2(){
        return p2;
    }
    public boolean equals(Recta l){
        return p1 == l.obtenerP1() &&
               p2 == l.obtenerP2();

    }
    public Recta clone(){
        return new Recta(p1,p2);
    }
    public float longitud(){
        return p1.distancia(p2);
    }
    public boolean mayor(Recta l){
        return longitud() > l.longitud();
    }
    public String toString(){
        return p1.toString + " " + p2.toString();

    }
}
