package TP6.Ej_2;

public class Poliza {
    // atributos de instancia
    private  int nroPoliza;
    private float incendio,robo;
    private boolean activa;

    // constructor

    public Poliza(int np) {
    nroPoliza = np;
    incendio = 0;
    robo = 0;
    activa = true;
}
    public Poliza(int np, float i, float r){
    nroPoliza = np;
    incendio = i;
    robo = r;
    activa = true;}

    

    //comandos

    public void activar(){
        activa = true;

    }
    public void desactivar(){
        activa = false;
    }

    public void establecerIncendio(float m){
        incendio = m;
    }
    public void establecerRobo(float m){
        robo = m;
    }
    public void actualizarPorcentaje(float p){
        if (activa == true){
            incendio = incendio + (incendio * p / 100);
            robo = robo + (robo * p / 100);

        }
    }
    // consultas

    public int obtenerNroPoliza(){
        return nroPoliza;
    }
    public float obtenerIncendio(){
        return incendio;
    }
    public float obtenerRobo(){
        return robo;
    }
    public double obtenerCostoPoliza(){
        return incendio + robo;
    }
    public boolean estaActiva(){
        return activa;
    }
}

