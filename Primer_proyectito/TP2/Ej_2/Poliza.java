public class Poliza {
    // atributos de instancia
    private int nroPoliza;
    private double incendio,robo;
    private boolean activa;

    // constructor

    public Poliza(int np) {
    nroPoliza = np;
    incendio = 0;
    robo = 0;
    activa = true;
}
    public Poliza(int np, double i, double r){
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

    public void establecerIncendio(double m){
        incendio = m;
    }
    public void establecerRobo(double m){
        robo = m;
    }
    public void actualizarPorcentaje(double p){
        if (activa == true){
            incendio = incendio + (incendio * p / 100);
            robo = robo + (robo * p / 100);

        }
    }
    // consultas

    public int obtenerNroPoliza(){
        return nroPoliza;
    }
    public double obtenerIncendio(){
        return incendio;
    }
    public double obtenerRobo(){
        return robo;
    }
    public double obtenerCostoPoliza(){
        return incendio + robo;
    }
    public boolean estaActiva(){
        return activa;
    }






 

    
}
