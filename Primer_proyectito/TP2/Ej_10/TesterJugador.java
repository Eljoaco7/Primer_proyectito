package Ej_10;

public class TesterJugador {
    public static void main(String[] args) {
        Jugador messi = new Jugador("Messi");
        messi.establecerNroCamiseta(10);
        messi.estableceGolesConvertidos(920);
        messi.establecerPosicion(9);
        messi.establecerPartidosJugados(1000);

        Jugador julianalvarez = new Jugador("Julian Alvarez");
        julianalvarez.establecerNroCamiseta(9);
        julianalvarez.establecerPosicion(9);
        julianalvarez.estableceGolesConvertidos(154);
        julianalvarez.establecerPartidosJugados(330);
        
        System.out.println(" <<MESSI>> ");
        System.out.println("Nombre: " + messi.obtenerNombre());
        System.out.println("Numero de camiseta: " + messi.obtenerNroCamiseta());
        System.out.println("Goles convertidos: " + messi.obtenerGolesConvertidos());
        System.out.println("Posicion en la que juega: " + messi.obtenerPosicion());
        System.out.println("Partidos jugados: " + messi.obtenerPartidosJugados());
        System.out.println("Promedio de goles: " + messi.promedioGolesXpart());
        System.out.println("Mas goles que Julian ? " + messi.masGoles(julianalvarez)); // true

        System.out.println(" <<JULIAN ALVAREZ>> ");
        System.out.println("Nombre: " + julianalvarez.obtenerNombre());
        System.out.println("Numero de camiseta: " + julianalvarez.obtenerNroCamiseta());
        System.out.println("Goles convertidos: " + julianalvarez.obtenerGolesConvertidos());
        System.out.println("Posicion en la que juega: " + julianalvarez.obtenerPosicion());
        System.out.println("Partidos jugados: " + julianalvarez.obtenerPartidosJugados());
        System.out.println("Promedio de goles: " + julianalvarez.promedioGolesXpart());
        System.out.println("Mas goles que Messi ? " + julianalvarez.masGoles(messi)); // false

        System.out.println("Jugador con mas goles ? " + messi.jugConMasGoles(julianalvarez));
        messi.aumentarGoles(20);
        System.out.println("Sumo 20 goles a messi. " + messi.obtenerGolesConvertidos());
        System.out.println("Messi es quivalente a julian ? " + messi.equals(julianalvarez)); // false
        
        System.out.println("Clono a julian:  ");
        Jugador julianClon = julianalvarez.clone();
        System.out.println("Julian es equivalente al clon de julian ? " + julianalvarez.equals(julianClon)); // true


    }
    
}
