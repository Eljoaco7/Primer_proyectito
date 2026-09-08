package Ej_9;

public class ColorTester {
    public static void main(String[] args) {
        Color rojo = new Color(255,0,0);
        Color azul = new Color(0,0,255);
        Color verde = new Color(0,255,0);

        

        System.out.println("Color rojo: " + rojo.obtenerRojo());
        System.out.println("Color azul: " + azul.obtenerAzul());
        System.out.println("Color verde: " + verde.obtenerVerde());
        Color c1 = new Color(200,100,50);
        c1.variar(67);
        System.out.println("Variamos los colores: " + c1);
        c1.variarAzul(10);
        System.out.println("Variamos en 10 el azul: " + c1);
        System.out.println("Es rojo puro? " + c1.esRojo());
        System.out.println("Es negro puro? " + c1.esNegro());
        Color c2 = new Color(100, 200, 50);
        System.out.println("Complemento: " + c2.complemento());
        System.out.println("C1 es equivalente a C2? " + c1.equals(c2)); // false
        Color c6 = new Color(1, 2, 3);
        Color c7 = new Color(100, 150, 200);
        c6.copy(c7);
        System.out.println("c6 después de copy(c7): " + c6); // debe quedar igual que c7
        System.out.println("c6.equals(c7): " + c6.equals(c7)); // true
        System.out.println("c6 == c7: " + (c6 == c7)); // false (objetos distintos)
    }

        


    }

    

