package Primer_proyectito.TP4.Ej_2;

public class EjemploTester {
    
    //Un tester minimalista de ejemplo. 
    //Los comentarios no son necesarios y sólo capturan parte de las ideas explicadas en clase.
    public static void main(String[] args) {

        //Declaro y creo el objeto a testear
        SecuenciaEnteros s = new SecuenciaEnteros(5);
        
        //Configuro/inicializo el objeto a testear
        s.establecerEntero(0, 1);
        s.establecerEntero(1, 5);
        s.establecerEntero(2, 8);
        s.establecerEntero(3, 3);
        s.establecerEntero(4, 4);

        //Muestro el objeto a testear para comprobar que quedó correctamente inicializado, es decir que el
        //comando establecer y la consulta obtener funcionan correctamente.
        //Cada vez que cambio el estado del objeto a testear, debería mostrarlo para asegurarme que
        //quedó en el estado deseado.
        System.out.println("[ 1 5 8 3 4 ] <- Secuencia esperada");
        mostrarSec(s);
        System.out.println(" <- Secuencia inicializada ");
        //Si en este punto de la ejecución, el objeto a testear se muestra correctamente, puedo estar seguro 
        //que los comandos y consultas usados funcionan correctamente, y que a partir de acá todos los problemas
        //estarán causados por el método a testear.
        

        //Casos de prueba:
        //Para cada caso mostrar por pantalla: 1: qué testeo (descripción del caso, de la intención de testeo)
        //2: Resultado esperado - 3: Resultado obtenido

        //Puedo generar casos significativos testeando distintas situaciones y resultados a partir de la
        //especificación del método a testear, o también a partir de mirar el código implementado armando
        //casos que evalúen las distintas condiciones y/o tomen los distintos caminos de ejecución del mismo.


        System.out.println("\nTesteando número 5 perteneciente a la secuencia:");
        System.out.println("Esperado: true - Obtenido: "+s.m(5));

        System.out.println("\nTesteando número 9 NO perteneciente a la secuencia:");
        System.out.println("Esperado: false - Obtenido: "+s.m(9));

        System.out.println("\nTesteando número 4 perteneciente a la secuencia encontrado en la última posición:");
        System.out.println("Esperado: true - Obtenido: "+s.m(4));

    }

    //Un método a parte para mostrar el estado del objeto a testear permite modularizar mejor y reusar código 
    //si tengo que mostrar muchas veces el objeto a testear porque lo cambio. Resulta útil si no cuento con una 
    //implementación adecuada (a los fines de mostrar el estado del objeto completo) del método toString en el
    //objeto a testear.
    private static void mostrarSec(SecuenciaEnteros s) {
        System.out.print("[ ");
        for (int i=0; i<s.cantElementos(); i++) {
            System.out.print(s.obtenerEntero(i)+" ");
        }
        System.out.print("]");
    }
}