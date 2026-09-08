package Ej_10;

public class Jugador {
    // Atributos de instancia
    private String nombre;
    private int nroCamiseta,posicion,golesConvertidos,partidosJugados;

    // Constructor

    public Jugador(String nom){
        nombre = nom;
    }

    // Comandos

    public void establecerNroCamiseta(int n){
        nroCamiseta = n;
    }
    public void establecerPosicion(int n){
        posicion = n;
    }
    public void estableceGolesConvertidos(int n){
        golesConvertidos = n;
    }
    public void establecerPartidosJugados(int n){
        partidosJugados = n;
    }
    public void aumentarGoles(int n){
        golesConvertidos = golesConvertidos + n;
    }
    public void aumentarUnPartido(){
        partidosJugados = partidosJugados + 1;
    }

    // Consultas

    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerNroCamiseta(){
        return nroCamiseta;
    }
    public int obtenerPosicion(){
        return posicion;
    }
    public int obtenerGolesConvertidos(){
        return golesConvertidos;
    }
    public int obtenerPartidosJugados(){
        return partidosJugados;
    }
    public float promedioGolesXpart(){
       if(partidosJugados == 0){
        return 0;
       }else { 
        return (float) golesConvertidos/partidosJugados;
    }
    }
    public boolean masGoles(Jugador j){
        return golesConvertidos > j.golesConvertidos;
    }
    public Jugador jugConMasGoles(Jugador j){
        if (masGoles(j)){
            return this;
         } else {
                return j;


        }
    }
    public String toString(){
        return nroCamiseta + "/" + posicion + "/" + golesConvertidos + "/"
        + partidosJugados;
    }
    public Jugador clone(){
        Jugador copia = new Jugador(nombre);
        copia.nroCamiseta = nroCamiseta;
        copia.posicion = posicion;
        copia.golesConvertidos = golesConvertidos;
        copia.partidosJugados = partidosJugados;
        return copia;
    }
    public boolean equals(Jugador j){
       
        return nombre.equals(j.nombre)
                && nroCamiseta == j.nroCamiseta
                && posicion == j.posicion
                && golesConvertidos == j.golesConvertidos
                && partidosJugados == j.partidosJugados;
    }

}
