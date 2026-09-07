package Ej_8;

public class FechaTester {
    public static void main(String[] args) {
        Fecha f1 = new Fecha(15,7,2000);
        Fecha f2 = new Fecha(1,3,2020);
        Fecha f3 = new Fecha(12,7,1920);
        System.out.println("F1:" + f1.toString());
        System.out.println("F2:" + f2.toString());
        System.out.println("F1 es bisiesto? " + f1.esBisiesto());
        System.out.println("F1 es anterior a F2? " + f1.esAnterior(f2));
        System.out.println("F1 es anteriro a F3? " + f1.esAnterior(f3));
        System.out.println("F2 es mismo anio que F3? " + f2.mismoAnio(f3));
        System.out.println("F3 es equivalente a F1? " + f3.equals(f1));
        System.out.println("El que hizo este codigo es un capo? " + f1.mismoAnio(f1));
    }
    
}
