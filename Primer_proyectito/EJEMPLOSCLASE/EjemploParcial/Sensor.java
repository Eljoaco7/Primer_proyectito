package Primer_proyectito.EJEMPLOSCLASE.EjemploParcial;


public class Sensor{
    // Atributos de instancia
    private int temperatura;
    private int humedad;
    private int viento;

    //Constructor
    public Sensor(int temp, int hum, int viento){
        temperatura = temp;
        humedad = hum;
        this.viento = viento;
    }

    //Comandos
    public void establecerTemperatura(int temp){
        temperatura = temp;
    }
    
    public void establecerHumedad(int hum){
        humedad = hum;
    }
    
    public void establecerViento(int v){
        viento = v;
    }
    
    public void copy(Sensor s){
        if(s!=null){
            temperatura = s.obtenerTemperatura();
            humedad = s.obtenerHumedad();
            viento = s.obtenerViento();
        }
    }
    
    //Consultas
    public int obtenerTemperatura(){
        return temperatura;
    }
    
    public int obtenerHumedad(){
        return humedad;
    }
    
    public int obtenerViento(){
        return viento;
    }
    
    public boolean equals(Sensor s){
        boolean iguales = false;
        if(s!=null){
            iguales = temperatura == s.obtenerTemperatura() &&
            humedad == s.obtenerHumedad() &&
            viento == s.obtenerViento();
        }
        return iguales;
    }
    
    public Sensor clone(){
        return new Sensor(temperatura, humedad, viento);
    }
    
}