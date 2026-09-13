package Primer_proyectito.TP3.Ej_3;

import Ej_8.Fecha;

public class Prestamo {
    // atributos de instancia

    private Libro libro;
    private String socio;
    private Fecha fechaPrestamo;
    private Fecha fechaDevolucion;
    private boolean devuelto;

    // Constructor

    public Prestamo(Libro l, Fecha fp, Fecha fd, String s){
        devuelto = false;
        libro = l;
        socio = s;
        fechaPrestamo = fp;
        fechaDevolucion = fd;
    }

    // Consultas

    public Libro obtenerLibro(){
        return libro;
    }

    public Fecha obtenerFechaPrestamo(){
        return fechaPrestamo;
    }
    
    public Fecha obtenerFechaDevolucion(){
        return fechaDevolucion;
    }

    public boolean estaDevuelto(){
        return devuelto;
    }

    public String obtenerSocio(){
        return socio;
    }

    public boolean estaAtrasado(Fecha hoy){
      boolean seAtraso;
      seAtraso = false;
        if (devuelto == false && fechaDevolucion.esAnterior(hoy)){
            seAtraso = true;
        }

        
    
    return seAtraso;
    }
    public Prestamo masAntiguo(Prestamo p){
        Prestamo retorno;
        if (fechaPrestamo.esAnterior(p.obtenerFechaPrestamo())){
            retorno = this;
          }  else {
                retorno = p;
        }
        return retorno;

    }
    
    public boolean equals(Prestamo p){
        boolean retorno = false;
        if(socio == p.obtenerSocio() 
            && libro.obtenerNombre().equals(p.obtenerLibro().obtenerNombre())
            && libro.obtenerAutor().equals(p.obtenerLibro().obtenerAutor())
            && this.libro.obtenerCategoria() == p.obtenerLibro().obtenerCategoria()
            && libro.obtenerEditorial().equals(p.obtenerLibro().obtenerEditorial())
            & this.fechaPrestamo.equals(p.obtenerFechaPrestamo())
            && this.fechaDevolucion.equals(p.obtenerFechaDevolucion())) {
        retorno = true;
    }
    return retorno;



    }

    public String toString(){
        String retorno;
         retorno = "Prestamo { " + "libro = " + libro + ", socio = " + socio +
        ", fechaPrestamo = " + fechaPrestamo + ", fechaDevolucion = " + fechaDevolucion +
        ", devuelto = " + devuelto + "}";
    return retorno;
}
    }

