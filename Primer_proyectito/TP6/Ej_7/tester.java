package TP6.Ej_7;

public class tester {
    public static void main(String[] args) {
        Habitacion h = new Habitacion(1, 4, 2);
        Departamento d = new Departamento(2, 6, 3, true);

        System.out.println(h);
        System.out.println("Camas: " + h.obtenerCamas());
        System.out.println("Costo diario hab (p=100): " + h.costoDiario(100));

        System.out.println(d);
        System.out.println("Tiene balcón: " + d.tieneBalcon());
        System.out.println("Costo diario depto (p=100): " + d.costoDiario(100));
    }
}
