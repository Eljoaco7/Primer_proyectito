package TP6.Ej_11;

import TP2.Ej_5.Sensor;

public class SensorAlfa extends Sensor {

    // Atributos de instancia

    private double p3;
    private double p4;

    // Constructor

    public SensorAlfa(double pU, double pD, double pT, double pC){
        super(pU, pD);
        p3 = pT;
        p4 = pC;
    }

    // Comandos

    public void establecerP3(double p){
        p3 = p;
    }

    public void establecerP4(double p){
        p4 = p;
    }

    // Consultas

    public double obtenerP3(){
        return p3;
    }

    public double obtenerP4(){
        return p4;
    }
    
    public boolean riesgo(){
        return super.riesgo() || p4 > p3;
    }

    public boolean emergencia(){
        return p4 < max;
    }

    public SensorAlfa clone(){
        SensorAlfa sa = new SensorAlfa(p1, p2, p3, p4);
        return sa;
    }

    public boolean equals(Sensor e){
        boolean ig;
        if (this == e)
         ig = true;
        else if (e == null)
         ig = false;
        else if(getClass()!= e.getClass())
         ig = false;
        else {
         SensorAlfa r = (SensorAlfa) e;
         ig = super.equals(e) && p3 == r.obtenerP3();
        }
        return ig;
    }

    
}
