package TP6.Ej_13;

public class DispositivoFull extends Dispositivo {
    
    // Atributos de instancia

    private double p3;
    private double p4;

    // Constructor

    public DispositivoFull(double pU, double pD, double pT, double pC){
        super(pU,pD);
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

    public boolean equals(Dispositivo d){
        boolean iguales = false;

        if(this == d){
            iguales = true;
        }
        else if (d != null && getClass() == d.getClass()){
            DispositivoFull df = (DispositivoFull) d;
            iguales = super.equals(d) && p3 == df.obtenerP3() && p4 == df.obtenerP4();
        }

        return iguales;
    }
}
