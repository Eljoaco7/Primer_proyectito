package Primer_proyectito.TP3.Ej_9;

public class TesterVehiculo {
    public static void main(String[] args) {
        Hora h1 = new Hora(10, 50);
        Hora h2 = new Hora(15, 30);


        System.out.println("==METODOS PARA LA HORA==");
        System.out.println("==ESTADO ACTUAL==");
        System.out.println("HORA : " + h1.obtenerHora());
        System.out.println("MINUTOS : " + h1.obtenerMinutos());

        System.out.println("==PRUEBO LOS ESTABLECER==");
        System.out.println("ESTABLEZCO UNA HORA : 8 ");
        h1.establecerHora(8);
        System.out.println("HORA : " + h1.obtenerHora());
        System.out.println("ESTABLEZCO UN MINUTO : 22 ");
        h1.establecerMinutos(22);
        System.out.println("MINUTOS : " + h1.obtenerMinutos());

        System.out.println("==PRUEBO CONSULTAS==");
        System.out.println("==PRUEBO EL COPY");
        System.out.println("QUIERO QUE H2 COPIE O DE H1");
        System.out.println("== ESTADO ACTUAL DE H2 ESPERADO HORA = 15 y MINUTOS = 30 ==");
        System.out.println("HORA : " + h2.obtenerHora());
        System.out.println("MINUTOS : " + h2.obtenerMinutos());
        h2.copy(h1);
        System.out.println("RESULTADO ESPERADO DE H2 COPIANDO A H1");
        System.out.println("HORA = 8   MINUTOS = 22 ");
        System.out.println("==H2 LUEGO DE COPIAR A H1==");
        System.out.println("HORA : " + h2.obtenerHora());
        System.out.println("MINUTOS : " + h2.obtenerMinutos());

        System.out.println("==PRUEBO EL EQUALS==");
        System.out.println("¿H1 ES EQUIVALENTE A H2? DEBERIA DAR TRUE");
        System.out.println("RESULTADO = " + h2.equals(h1));

        System.out.println("==PRUEBO DIFERENCIAMINUTOS EN 2 CASOS==");
        System.out.println("==H1 y H2 SON LO MISMO==");
        System.out.println("RESULTADO ESPERADO : 0 ");  // pues no hay diferencia en nada son iguales
        System.out.println("RESULTADO = " + h1.diferenciaMinutos(h2));
        System.out.println("==CASO 2==");
        System.out.println("==H1 y H2 NO SON LO MISMO==");
        System.out.println("PARA ESO MODIFICO H2 PONIENDOLE UNA HORA Y MINUTOS DIFERENTES");
        h2.establecerHora(4);
        h2.establecerMinutos(35);
        System.out.println("== ESTADO ACTUAL DE H2 ESPERADO HORA = 4 y MINUTOS = 35 ==");
        System.out.println("HORA : " + h2.obtenerHora());
        System.out.println("MINUTOS : " + h2.obtenerMinutos());
        System.out.println("RESULTADO ESPERADO DE HACER DIFERENCIAMINUTOS AHORA : 227 ");
        System.out.println("RESULTADO = " + h1.diferenciaMinutos(h2));
        System.out.println("H2 ES ANTERIOR A H1?");
        System.out.println("RESULTADO ESPERADO : TRUE ");
        System.out.println("RESULTADO = " + h2.anterior(h1));

        // ---- Pruebas de Tarifa ----
        Tarifa t = new Tarifa(100, 200, 300, 500);
        System.out.println("\n--- Tarifa ---");
        System.out.println("obtenerT15 (esperado 100): " + t.obtenerT15());
        System.out.println("obtenerT30 (esperado 200): " + t.obtenerT30());
        System.out.println("obtenerT60 (esperado 300): " + t.obtenerT60());
        System.out.println("obtenerTFija (esperado 500): " + t.obtenerTFija());

                // ---- Pruebas de Vehiculo ----
        System.out.println("\n--- Vehiculo ---");

        Vehiculo v1 = new Vehiculo(new Hora(9, 0), 5, "ABC123");
        System.out.println("aCobrar sin egresar (esperado 0): " + v1.obteneraCobrar());

        v1.egresaVehiculo(new Hora(9, 10), t);
        System.out.println("aCobrar con 10 min, <=15 (esperado 100): " + v1.obteneraCobrar());

        Vehiculo v2 = new Vehiculo(new Hora(9, 0), 6, "DEF456");
        v2.egresaVehiculo(new Hora(9, 25), t);
        System.out.println("aCobrar con 25 min, <=30 (esperado 200): " + v2.obteneraCobrar());

        Vehiculo v3 = new Vehiculo(new Hora(9, 0), 7, "GHI789");
        v3.egresaVehiculo(new Hora(9, 50), t);
        System.out.println("aCobrar con 50 min, <=60 (esperado 300): " + v3.obteneraCobrar());

        Vehiculo v4 = new Vehiculo(new Hora(9, 0), 8, "JKL012");
        v4.egresaVehiculo(new Hora(10, 30), t);
        System.out.println("aCobrar con 90 min, >60 (esperado 500): " + v4.obteneraCobrar());

        // equals
        Vehiculo v5 = new Vehiculo(new Hora(9, 0), 5, "ZZZ999");
        v5.egresaVehiculo(new Hora(9, 10), t);
        System.out.println("v1 equals v5, mismos ingreso/aCobrar/numero, distinta patente (esperado true si patente es ==): "
                + v1.equals(v5));

        Vehiculo v6 = new Vehiculo(new Hora(9, 0), 99, "ABC123");
        v6.egresaVehiculo(new Hora(9, 10), t);
        System.out.println("v1 equals v6, distinto numero (esperado false): " + v1.equals(v6));

        // anterior
        System.out.println("v1 (ingreso 9:00) anterior a v2 (ingreso 9:00) (esperado false, son iguales): "
                + v1.anterior(v2));

        Vehiculo v7 = new Vehiculo(new Hora(8, 0), 10, "MNO345");
        System.out.println("v7 (ingreso 8:00) anterior a v1 (ingreso 9:00) (esperado true): " + v7.anterior(v1));

        // copy
        Vehiculo v8 = new Vehiculo(new Hora(0, 0), 0, "");
        v8.egresaVehiculo(new Hora(0, 0), t);
        v8.copy(v4);
        System.out.println("v8 tras copy de v4 -> ingreso hor (esperado 9): " + v8.obtenerIngreso().obtenerHora());
        System.out.println("v8 tras copy de v4 -> aCobrar (esperado 500): " + v8.obteneraCobrar());
        System.out.println("v8 tras copy de v4 -> numero (esperado 8): " + v8.obtenerNumero());
        System.out.println("v8 tras copy de v4 -> patente (esperado JKL012): " + v8.obtenerPatente());
    }
}

    
    
    
    

