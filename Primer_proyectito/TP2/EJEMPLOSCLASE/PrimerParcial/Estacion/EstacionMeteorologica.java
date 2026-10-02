package EJEMPLOSCLASE.PrimerParcial.Estacion;

import Ej_5.Sensor;

public class EstacionMeteorologica {
    private int codigo;
    private boolean activa;
    private Sensor sensor;

    // Constructor

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

    public void copy(EstacionMeteorologica){
        if(e != null){
            codigo = c.obtenerCodigo();
            activa = c.estaActiva();
            Sensor.copy(e.obtenerSensor);
        }

    }

    public void activar(){
        activa = true;
    }

    public void desactivar(){
        activa = false;
    }

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
        if(e != null){
            iguales = codigo == e.obtenerCodigo()
            && sensor == e.obtenerSensor()
            && activa == e.estaActiva();
        }
        return iguales;
    }

    public EstacionMeteorologica estacionMasCalida(EstacionMeteorologica e){
        EstacionMeteorologica rta = this;
        if(e.obtenerSensor().obtenerTemperatura() > sensor.obtenerTemperatura()){
            rta = e;
        } else{
            if(e.obtenerSensor().obtenerTemperatura == sensor.obtenerTemperatura()){
                if(e.obtenerSensor().obtenerHumedad() > sensor.obtenerHumedad()){
                    rta = e;
                }
            }
        }

        return rta;
    }

    
}
