package Primer_proyectito.EJEMPLOSCLASE.EjemploParcial;

public class EstacionMeteorologica{
    //Atriutos de instancia
    private int codigo;
    private boolean activa;
    private Sensor sensor;

    public EstacionMeteorologica(int cod, Sensor s){
        codigo = cod;
        activa = true;
        sensor = s;
    }

    public void establecerCodigo(int cod){
        codigo = cod;
    }
    
    public void establecerSensor(Sensor s){
        sensor = s;
    }
    
    public void copy(EstacionMeteorologica e){
        if(e!=null){
            codigo = e.obtenerCodigo();
            activa = e.estaActiva();
            sensor.copy(e.obtenerSensor());
        }
    }
    
    public void activar(){
        activa = true;
    }
    
    public void desactivar(){
        activa = false;
    }
    
    //Consultas
    public int obtenerCodigo(){
        return codigo;
    }
    
    public Sensor obtenerSensor(){
        return sensor;
    }
    
    public boolean estaActiva(){
        return activa;
    }
    
    public EstacionMeteorologica clone(){
        EstacionMeteorologica clon = new EstacionMeteorologica(codigo, sensor);
        if(!activa)
            clon.desactivar();
        return clon;
    }
    
    public boolean equals(EstacionMeteorologica e){
        boolean iguales = false;
        if(e!=null){
            iguales = codigo == e.obtenerCodigo() &&
            sensor.equals(e.obtenerSensor()) &&
            activa==e.estaActiva();
        }
        return iguales;
    }
    
    public EstacionMeteorologica estacionMasCalida(EstacionMeteorologica e){
        EstacionMeteorologica rta = this;
        if(e.obtenerSensor().obtenerTemperatura()>sensor.obtenerTemperatura()){
            rta = e;
        }
        else{
            if(e.obtenerSensor().obtenerTemperatura()==sensor.obtenerTemperatura()){
                if(e.obtenerSensor().obtenerHumedad()>sensor.obtenerHumedad()){
                    rta = e;
                }
            } 
        }
        return rta; 
    }
}