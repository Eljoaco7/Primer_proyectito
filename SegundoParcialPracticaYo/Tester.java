package SegundoParcialPracticaYo;

public class Tester {

    static int ok = 0;
    static int fallos = 0;

    static void chequear(String desc, boolean cond){
        if(cond){
            ok++;
        }
        else{
            fallos++;
            System.out.println("FALLO: " + desc);
        }
    }

    public static void main(String[] args){

        // ---------- Personaje / Planta ----------
        Planta pl = new Planta(10, 5, 7);
        chequear("Planta salud inicial", pl.obtenerSalud() == 10);
        chequear("Planta energia", pl.obtenerEnergia() == 7);

        pl.recibirAtaque(4);
        chequear("Planta recibe 4 -> salud 6", pl.obtenerSalud() == 6);
        pl.recibirAtaque(15);
        chequear("Planta recibe 15 -> salud 0 (no negativa)", pl.obtenerSalud() == 0);

        // ---------- Zombie: equals ----------
        Zombie z1 = new Zombie(10, 5, 3, true);
        Zombie z2 = new Zombie(10, 5, 3, true);
        Zombie z3 = new Zombie(10, 5, 4, true);
        Zombie z4 = new Zombie(10, 5, 3, false);
        Planta p1 = new Planta(10, 5, 7);
        Planta p2 = new Planta(10, 5, 7);
        Planta p3 = new Planta(10, 5, 8);

        chequear("zombie equals zombie igual", z1.equals(z2));
        chequear("zombie equals distinta velocidad", !z1.equals(z3));
        chequear("zombie equals distinto casco", !z1.equals(z4));
        chequear("zombie equals planta (sin ClassCastException)", !z1.equals(p1));
        chequear("zombie equals null", !z1.equals(null));
        chequear("planta equals planta igual", p1.equals(p2));
        chequear("planta equals distinta energia", !p1.equals(p3));
        chequear("planta equals zombie", !p1.equals(z1));

        // ---------- Zombie: recibirAtaque ----------
        Zombie zc = new Zombie(5, 5, 1, true);
        zc.recibirAtaque(8);
        chequear("con casco, salud 5, d=8 -> salud 1", zc.obtenerSalud() == 1);

        Zombie zs = new Zombie(5, 5, 1, false);
        zs.recibirAtaque(8);
        chequear("sin casco, salud 5, d=8 -> salud 0", zs.obtenerSalud() == 0);

        Zombie zc2 = new Zombie(10, 5, 1, true);
        zc2.recibirAtaque(1);
        chequear("con casco, d=1 -> daño 0, salud 10", zc2.obtenerSalud() == 10);

        Zombie zc3 = new Zombie(3, 5, 1, true);
        zc3.recibirAtaque(20);
        chequear("con casco, d=20 salud 3 -> salud 0", zc3.obtenerSalud() == 0);

        // ---------- Zombie: atacar ----------
        Zombie rapido = new Zombie(10, 5, 3, true);
        Planta victima1 = new Planta(20, 9, 1);
        rapido.atacar(victima1);
        chequear("casco y vel>2: daño doble (10) aunque la víctima sea más fuerte",
                 victima1.obtenerSalud() == 10);

        Zombie lento = new Zombie(10, 5, 2, true);
        Planta victima2 = new Planta(20, 3, 1);
        lento.atacar(victima2);
        chequear("casco pero vel=2: ataque normal (5) -> salud 15",
                 victima2.obtenerSalud() == 15);

        Zombie sinCasco = new Zombie(10, 5, 9, false);
        Planta victima3 = new Planta(20, 5, 1);
        sinCasco.atacar(victima3);
        chequear("fuerza víctima = fuerza atacante: no hay ataque",
                 victima3.obtenerSalud() == 20);

        // ---------- TablaPersonajes ----------
        TablaPersonajes tabla = new TablaPersonajes(3);
        Personaje a = new Zombie(5, 7, 1, false);
        Personaje b = new Planta(5, 3, 1);
        Personaje c = new Zombie(5, 3, 1, false);

        chequear("agregar null -> false", !tabla.agregarPersonaje(null));
        chequear("agregar a -> true", tabla.agregarPersonaje(a));
        chequear("agregar b -> true", tabla.agregarPersonaje(b));
        chequear("agregar c -> true", tabla.agregarPersonaje(c));
        chequear("pos 0 es a", tabla.obtenerPersonaje(0) == a);
        chequear("pos 2 es c", tabla.obtenerPersonaje(2) == c);
        chequear("pos -1 -> null", tabla.obtenerPersonaje(-1) == null);
        chequear("pos 3 -> null", tabla.obtenerPersonaje(3) == null);

        tabla.eliminarMasDebil(); // fuerzas [7, 3, 3]: borra el primero de fuerza 3
        chequear("elimina b (empate: el primero)", tabla.obtenerPersonaje(1) == null);
        chequear("a sigue", tabla.obtenerPersonaje(0) == a);
        chequear("c sigue", tabla.obtenerPersonaje(2) == c);

        Personaje d = new Planta(5, 9, 1);
        tabla.agregarPersonaje(d);
        chequear("el hueco se reutiliza", tabla.obtenerPersonaje(1) == d);

        TablaPersonajes vacia = new TablaPersonajes(2);
        vacia.eliminarMasDebil();
        chequear("eliminar en tabla vacía no explota", vacia.obtenerPersonaje(0) == null);

        // ---------- Jardin ----------
        Jardin j = new Jardin(4);

        Zombie z0 = new Zombie(3, 5, 3, true);
        Zombie zMuerto = new Zombie(5, 9, 1, false);
        zMuerto.recibirAtaque(10); // queda con salud 0

        j.establecerPersonaje(0, 0, z0);                       // fila 0: 3/5
        j.establecerPersonaje(0, 1, new Planta(2, 5, 1));      // fila 0: 2/5
        j.establecerPersonaje(1, 0, zMuerto);                  // fila 1: 0/9
        j.establecerPersonaje(1, 1, new Zombie(2, 3, 1, false)); // fila 1: 2/3
        j.establecerPersonaje(2, 1, new Planta(6, 7, 1));      // fila 2: 6/7
        j.establecerPersonaje(3, 0, new Zombie(4, 1, 1, false)); // fila 3: 4/1
        Zombie clon = new Zombie(3, 5, 3, true);
        j.establecerPersonaje(4, 3, clon);                     // fila 4: igual a z0

        // obtenerPersonaje
        chequear("obtener (0,0)", j.obtenerPersonaje(0, 0) == z0);
        chequear("obtener casilla vacía", j.obtenerPersonaje(2, 0) == null);
        chequear("obtener fila inválida", j.obtenerPersonaje(5, 0) == null);
        chequear("obtener fila negativa", j.obtenerPersonaje(-1, 0) == null);
        chequear("obtener col inválida", j.obtenerPersonaje(0, 4) == null);

        // establecer null
        j.establecerPersonaje(3, 3, new Planta(1, 1, 1));
        j.establecerPersonaje(3, 3, null);
        chequear("establecer null deja la casilla vacía", j.obtenerPersonaje(3, 3) == null);

        // primerFilaConNConFuerzaF
        chequear("2 con fuerza 5 -> fila 0", j.primerFilaConNConFuerzaF(2, 5) == 0);
        chequear("1 con fuerza 7 -> fila 2", j.primerFilaConNConFuerzaF(1, 7) == 2);
        chequear("1 con fuerza 9 -> fila 1 (aunque esté muerto)", j.primerFilaConNConFuerzaF(1, 9) == 1);
        chequear("1 con fuerza 3 -> fila 1", j.primerFilaConNConFuerzaF(1, 3) == 1);
        chequear("2 con fuerza 7 -> -1", j.primerFilaConNConFuerzaF(2, 7) == -1);
        chequear("1 con fuerza 8 -> -1", j.primerFilaConNConFuerzaF(1, 8) == -1);

        // personajesEquiv
        TablaPersonajes eq = j.personajesEquiv(z0);
        chequear("equiv no es null", eq != null);
        chequear("equiv pos 0 es z0", eq.obtenerPersonaje(0) == z0);
        chequear("equiv pos 1 es el clon", eq.obtenerPersonaje(1) == clon);
        chequear("equiv pos 2 vacía", eq.obtenerPersonaje(2) == null);
        chequear("equiv de null -> null", j.personajesEquiv(null) == null);

        // hayFilasConVivosFuertes (filas con vivo y fuerza > f)
        chequear("(3,4) -> true (filas 0, 2 y 4)", j.hayFilasConVivosFuertes(3, 4));
        chequear("(2,4) -> false (son 3)", !j.hayFilasConVivosFuertes(2, 4));
        chequear("(1,6) -> true (solo fila 2)", j.hayFilasConVivosFuertes(1, 6));
        chequear("(2,6) -> false (es 1)", !j.hayFilasConVivosFuertes(2, 6));
        chequear("(1,8) -> false (el único fuerte está muerto)", !j.hayFilasConVivosFuertes(1, 8));

        // ---------- Resumen ----------
        System.out.println("Chequeos OK: " + ok);
        System.out.println("Chequeos con fallo: " + fallos);
    }
}

