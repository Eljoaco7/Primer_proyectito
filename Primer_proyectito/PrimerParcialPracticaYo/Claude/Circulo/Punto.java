package Claude.Circulo;

public class Punto {
 private int x;
 private int y;
 public Punto(int x, int y){
 this.x = x;
 this.y = y;
 }
 public void establecerX(int x){ this.x = x; }
 public void establecerY(int y){ this.y = y; }
 public int obtenerX(){ return x; }
 public int obtenerY(){ return y; }
 public int distanciaCuadrada(Punto p){
 int dx = x - p.x;
 int dy = y - p.y;
 return dx*dx + dy*dy;
 }
 public Punto clone(){
 return new Punto(x, y);
 }
 public boolean equals(Punto o){
 return o != null && x == o.x && y == o.y;
 }
}
