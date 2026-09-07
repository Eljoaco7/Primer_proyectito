package Ej_5;

public class Sensor {
    // Atributos de clase
    private static final double max = 0.01;

    // Atributos de instancia
    private double p1,p2;

    // Constructor
    public Sensor(double p1,double p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    // Comandos

    public void establecerP1(double p){
        this.p1 = p;
    }
    public void establecerP2(double p){
        this.p2 = p;

    }
    public void copy(Sensor s){
        if (s != null){
            this.p1 = s.p1;
            this.p2 = s.p2;
        }
            
    }
    public double obtenerP1(){
        return p1;
    }
    public double obtenerP2(){
        return p2;
    }
    public boolean riesgo(){
        if (p2 > p1)
            return true;
        else
            return false;
    
    }
    public boolean emergencia(){
        if (p1 < max)
            return true;
        else
            return false;
    }
    public boolean equals(Sensor s){
        if (s != null){
            return this.p1 == s.p1 && this.p2 == s.p2;
         } else {
                return false;
         
        }

    }
    public Sensor clone(){
        return new Sensor(p1, p2);
    }

}
