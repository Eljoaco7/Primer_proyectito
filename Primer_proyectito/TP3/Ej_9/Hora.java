package Primer_proyectito.TP3.Ej_9;

public class Hora {
    // Atributos de instancia

    private int hor,min;

    // Constructor

    public Hora(int h, int m){
        hor = h;
        min = m;
    }

    // Comandos

    public void establecerHora(int c){
        hor = c;
    }

    public void establecerMinutos(int c){
        min = c;
    }

    public void copy(Hora h){
        hor = h.hor;
        min = h.min;
    }

    // Consultas

    public int obtenerHora(){
        return hor;
    }

    public int obtenerMinutos(){
        return min;
    }

    public boolean equals(Hora c){
        return hor == c.obtenerHora()
        && min == c.obtenerMinutos();
    }

    public int diferenciaMinutos(Hora c){
        int retorno = 0;
        int minutosPropios = hor * 60 + min;
        int minutosC = c.obtenerHora() * 60 + c.obtenerMinutos();

        retorno = minutosPropios - minutosC;

        return retorno;
    }

    public boolean anterior(Hora c){
        boolean retorno = false;
        if (hor < c.obtenerHora() || (hor == c.obtenerHora() && min < c.obtenerMinutos())){

            retorno = true;
        }

        return retorno;
    }

    






    
}
