package TP5.Ej_2;

public class TesterConsumoEdificio {

    private static void verificar(String nombre, Object obtenido, Object esperado) {
        boolean ok = (obtenido == null) ? esperado == null : obtenido.equals(esperado);
        System.out.println((ok ? "OK    " : "ERROR ") + nombre
                + " -> obtenido: " + obtenido + " | esperado: " + esperado);
    }

    public static void main(String[] args) {
        ConsumoEdificio e = new ConsumoEdificio(4);

        // --- registrar / válidos ---
        verificar("registrar piso 1", e.registrarConsumo(new MedicionServicios(10, 20, 5), 1), true);
        verificar("registrar piso 3", e.registrarConsumo(new MedicionServicios(40, 40, 20), 3), true);
        verificar("registrar piso 4", e.registrarConsumo(new MedicionServicios(0, 0, 30), 4), true);
        verificar("registrar piso 0 (inválido)", e.registrarConsumo(new MedicionServicios(1, 1, 1), 0), false);
        verificar("registrar piso 5 (inválido)", e.registrarConsumo(new MedicionServicios(1, 1, 1), 5), false);
        verificar("eliminar piso 7 (inválido)", e.eliminarConsumo(7), false);

        // --- consultas básicas ---
        verificar("cantPosiciones", e.cantPosiciones(), 4);
        verificar("cantRegistrosConsumo", e.cantRegistrosConsumo(), 3);
        verificar("costo piso 3", e.obtenerMedicionServicios(3).costoServicios(), 120.0);
        verificar("piso 2 es null", e.obtenerMedicionServicios(2), null);

        // --- hayMayorConsumo (estricto: 120 no es > 120) ---
        verificar("hayMayorConsumo(100)", e.hayMayorConsumo(100), true);
        verificar("hayMayorConsumo(120)", e.hayMayorConsumo(120), false);

        // --- cuantasMayores (costos 35, 120, 60) ---
        verificar("cuantasMayores(50)", e.cuantasMayores(50), 2);
        verificar("cuantasMayores(35)", e.cuantasMayores(35), 2);   // el 35 no cuenta
        verificar("cuantasMayores(200)", e.cuantasMayores(200), 0);

        // --- primerPisoMayor / ultimoPisoMayor ---
        verificar("primerPisoMayor(30)", e.primerPisoMayor(30), 1);
        verificar("primerPisoMayor(50)", e.primerPisoMayor(50), 3);
        verificar("ultimoPisoMayor(50)", e.ultimoPisoMayor(50), 4);
        verificar("primerPisoMayor(200)", e.primerPisoMayor(200), -1);
        verificar("ultimoPisoMayor(200)", e.ultimoPisoMayor(200), -1);

        // --- nMayores ---
        verificar("nMayores(50, 2)", e.nMayores(50, 2), true);
        verificar("nMayores(50, 3)", e.nMayores(50, 3), false);
        verificar("nMayores(50, 0)", e.nMayores(50, 0), true);

        // --- todosMayores(int): ignora el null ---
        verificar("todosMayores(30)", e.todosMayores(30), true);
        verificar("todosMayores(35)", e.todosMayores(35), false);   // 35 no es > 35

        // --- todosMayores(MedicionServicios) ---
        verificar("todosMayores((-1,-1,-1))", e.todosMayores(new MedicionServicios(-1, -1, -1)), true);
        verificar("todosMayores((0,0,0))", e.todosMayores(new MedicionServicios(0, 0, 0)), false);   // piso 4 tiene 0 y 0
        verificar("todosMayores((10,0,0))", e.todosMayores(new MedicionServicios(10, 0, 0)), false); // piso 1 empata en gas

        // --- eliminarCeros ---
        e.registrarConsumo(new MedicionServicios(0, 5, 5), 2);      // un solo cero: NO se borra
        verificar("registros antes de eliminarCeros", e.cantRegistrosConsumo(), 4);
        e.eliminarCeros();
        verificar("registros después de eliminarCeros", e.cantRegistrosConsumo(), 3);
        verificar("piso 4 eliminado", e.obtenerMedicionServicios(4), null);
        verificar("piso 2 sigue (un solo cero)", e.obtenerMedicionServicios(2) != null, true);

        // --- eliminarConsumo ---
        verificar("eliminar piso 1", e.eliminarConsumo(1), true);
        verificar("registros final", e.cantRegistrosConsumo(), 2);
    }
}
