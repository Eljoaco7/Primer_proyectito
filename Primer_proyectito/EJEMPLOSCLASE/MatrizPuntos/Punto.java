package EJEMPLOSCLASE.MatrizPuntos;

public final class Punto{ 
    private float x;    
    private float y;    

    public Punto(float x, float y){
        this.x=x;
        this.y=y;
    }

    public void establecerX(float x){
        this.x=x;
    }

    public void establecerY(float y){
        this.y=y;
    }
    
    public void copy(Punto p){
        x=p.obtenerX();
        y=p.obtenerY();
    }
    
    public float obtenerX(){
        return x; 
    }

    public float obtenerY(){ 
        return y; 
    }

    public String toString(){
        return "("+x+","+y+")";
    }
    
    public double distancia(Punto p) {
        float dx= x - p.obtenerX();
        float dy= y - p.obtenerY();
        return Math.sqrt(dx*dx+dy*dy);
    }
    
    public boolean equals(Punto p){
        return ((x==p.obtenerX())&&(y==p.obtenerY()));
    }
    
    public Punto clone(){
        return new Punto(x,y);        
    }
    
    public boolean esInverso(Punto p){
      /*Requiere p ligado.*/
      return (x == p.obtenerY() && y == p.obtenerX());
    }
}