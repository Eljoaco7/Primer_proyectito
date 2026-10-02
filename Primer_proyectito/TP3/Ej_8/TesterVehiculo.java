package Primer_proyectito.TP3.Ej_8;

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