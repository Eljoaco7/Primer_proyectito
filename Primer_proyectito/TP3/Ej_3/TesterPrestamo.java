package Primer_proyectito.TP3.Ej_3;

import Ej_8.Fecha;

public class TesterPrestamo {
    public static void main(String[] args) {
        
    
    
    Fecha f1 = new Fecha(25, 3, 2000); // Fecha donde se hizo el prestamo
    
    Fecha f2 = new Fecha(15, 7, 2001); // Fecha de devolucion

    Fecha hoy = new Fecha(18, 5, 2003); // Fecha de hoy
    
    Libro l1 = new Libro(" elgatonegro ", "Edgar alan poe ", "Fulana ", 'T');
    
    Libro l2 = new Libro("El Aleph", "Borges", "Emece", 'N');
    
    Prestamo p1 = new Prestamo(l1, f1, f2, "Joaco");
   System.out.println("<<MUESTRO EL PRESTAMO>>");
    System.out.println(p1.toString());
    System.out.println("<<¿ESTA DEVUELTO?>>");
    System.out.println(p1.estaDevuelto());
    System.out.println("<<¿ESTA ATRASADO?>>");
    System.out.println(p1.estaAtrasado(hoy));
    System.out.println("<<¿QUIEN ES EL SOCIO?>>");
    System.out.println(p1.obtenerSocio());
    System.out.println("<<HAGO OTRO PRESTAMO>>");

    Fecha f3 = new Fecha(8, 3, 1999); // Fecha donde se hizo el prestamo
    
    Fecha f4 = new Fecha(15, 7, 2006); // Fecha de devolucion

    Prestamo p2 = new Prestamo(l2, f3, f4, "Ramiro");


    System.out.println("<<¿EL PRIMER PRESTAMO ES EQUIVALENTE AL SEGUNDO?>>");
    System.out.println(p1.equals(p2)); // False
    System.out.println("<<P1 ES MAS ANTIGUO QUE P2?>>");
    System.out.println(p1.masAntiguo(p2));
    System.out.println("<<>>");
    
}


}