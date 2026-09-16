package Primer_proyectito.TP3.Ej_8;

public class Vehiculo {
    // Atributos de instancia

    private Hora ingreso,egreso;
    private int numero;
    private String patente;

    // Constructor

    public Vehiculo(Hora i, int n, String p){
        ingreso = i;
        numero = n;
        patente = p;
        egreso = null;
    }
    
    // Comandos

    public void egresaVehiculo(Hora c){
        egreso = c;
    }

    public void copy(Vehiculo v){
    ingreso.copy(v.obtenerIngreso());
    numero = v.obtenerNumero();
    patente = v.obtenerPatente();
    egreso.copy(v.obtenerEgreso());
    }


    // Consultas

    public Hora obtenerIngreso(){
        return ingreso;
    }

    public Hora obtenerEgreso(){
        return egreso;
    }

    public int obtenerNumero(){
        return numero;
    }

    public String obtenerPatente(){
        return patente;
    }

    public int obteneraCobrar(Tarifa t){
      int retorno = 0;
        if (egreso != null){
            int minutos = egreso.diferenciaMinutos(ingreso);
            if (minutos <= 15){
                retorno = t.obtenerT15();
            }
            else if (minutos <= 30){
                retorno = t.obtenerT30();
            }
            else if (minutos <= 60){
                retorno = t.obtenerT60();
            }
            else if (minutos > 60){
                retorno = t.obtenerTFija();
            }

        }

        return retorno;
    }

    public boolean anterior(Vehiculo v){
        boolean retorno = false;
        if (ingreso.anterior(v.obtenerIngreso())){
            retorno = true;
        }
        return retorno;

    }

    /* public boolean equalsSUPERFICIAL(Vehiculo c){
        boolean retorno;

        retorno = ingreso == c.obtenerIngreso()
        && egreso == c.obtenerEgreso()
        && numero == c.obtenerNumero()
        && patente == c.obtenerPatente();

        return retorno;

    } */

    public boolean equals(Vehiculo c){
        boolean retorno;

        retorno = ingreso.equals(c.obtenerIngreso())
        && egreso.equals(c.obtenerEgreso())
        && numero == c.obtenerNumero()
        && patente == c.obtenerPatente();

        return retorno;

}

}
