package EJEMPLOSCLASE.ColeccionGenerica;

import EJEMPLOSCLASE.ColeccionGenerica.Inventario.*;


public class Mensaje extends Elemento {

    public boolean equals(Elemento e){
        Articulo aux;
        boolean iguales = false;
        if(this == e){
            iguales = true;
        }
        else if (getClass() == e.getClass()){
            aux = (Articulo) e;
            iguales = codigo == aux.obtenerCodigo();
        }

        return iguales;
    }
    
}
