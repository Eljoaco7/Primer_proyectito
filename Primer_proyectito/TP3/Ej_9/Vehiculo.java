package Primer_proyectito.TP3.Ej_9;

public class Vehiculo {
    // Atributos de instancia

    private Hora ingreso,egreso;
    private int numero,aCobrar;
    private String patente;

    // Constructor

    public Vehiculo(Hora i, int n, String p){
       
        ingreso = i;
        numero = n;
        patente = p;
        aCobrar = 0;
    }
    
    // Comandos

    public void egresaVehiculo(Hora c, Tarifa t){
        int minutos = c.diferenciaMinutos(ingreso);
            if (minutos <= 15){
                aCobrar = t.obtenerT15();
            }
            else if (minutos <= 30){
                aCobrar = t.obtenerT30();
            }
            else if (minutos <= 60){
                aCobrar = t.obtenerT60();
            }
            else if (minutos > 60){
                aCobrar = t.obtenerTFija();
            }
        
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

    public int obteneraCobrar() {
     return aCobrar;
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
