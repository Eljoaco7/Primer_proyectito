

import Primer_proyectito.EJEMPLOSCLASE.EjemploParcial.Sensor;

public class EstacionMeteorologica {
    // Atributos de instancia

    private int codigo;
    private boolean activa;
    private Sensor sensor;

    // Constructor

     // Requiere s ligado y cod > 0 entonces yo no lo reviso
    public EstacionMeteorologica(int cod, Sensor s){
        codigo = cod;
        sensor = s;
        activa = true;

    }

    // Comandos

    public void establecerCodigo(int cod){
        codigo = cod;
    }

    public void establecerSensor(Sensor s){
        sensor = s;
    }

    public void activar(){
        activa = true;
    }

    public void desactivar(){
        activa = false;
    }

    public void copy(EstacionMeteorologica e){
        if(e!=null){
            codigo = e.obtenerCodigo();
            activa = e.estaActiva();
            sensor.copy(e.obtenerSensor());
        }
    }

    // Consultas

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
        if(!activa){
            clon.desactivar();
        }
        return clon;
    }

    public boolean equals(EstacionMeteorologica e){
        boolean iguales = false;
        if(e!=null){
            iguales = codigo == e.obtenerCodigo()
            && activa == e.estaActiva()
            && sensor.equals(e.obtenerSensor());
        }

        return iguales;
    }
    
    
    
    public EstacionMeteorologica estacionMasCalida(EstacionMeteorologica e){
        EstacionMeteorologica retorno = this;

        if(e.obtenerSensor().obtenerTemperatura() > sensor.obtenerTemperatura()){
            retorno = e;
        }
        else if(e.obtenerSensor().obtenerTemperatura() == sensor.obtenerTemperatura()){
            if(e.obtenerSensor().obtenerHumedad() > sensor.obtenerHumedad()){
                retorno = e;
            }
            
                
        }
        return retorno;
    }


}