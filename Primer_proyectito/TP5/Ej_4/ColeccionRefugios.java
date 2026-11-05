package TP5.Ej_4;

import TP2.Ej_4.Refugio;

public class ColeccionRefugios {
    
  // Atributos de instancia

  private Refugio [] col;
  private int cant;

  // Constructor

  public ColeccionRefugios(int n){
    col = new Refugio[n];
    cant = 0;
  }

  // Comandos

  public void insertarRefugio(Refugio r){
    if(!estallena()){
      col[cant] = r;
      cant++;
    }
    
  }

  public void eliminarEscasaSupervivencia() {
    for (int i = cant - 1; i >= 0; i--) {
        if (col[i].diasSupervivencia() <= 1) {
            // arrastro hacia la izquierda todo lo que está después de i
            for (int k = i; k < cant - 1; k++) {
                col[k] = col[k + 1];
            }
            col[cant - 1] = null;
            cant--;
        }
    }
}

  // Consultas

  public int tamanoColeccion(){
    return col.length;
  }

  public int cantRefugios(){
    int cont = 0;
    for(int i = 0; i < tamanoColeccion(); i++){
      if(col[i] != null){
        cont++;
      }
    }
    return cont;
  }

  public boolean estallena(){
    return cant == tamanoColeccion();
  }

  public Refugio obtenerRefugio(int pos){
    Refugio toRet = null;
    if(0 <= pos && pos < cantRefugios()){
      toRet = col[pos];
    }

    return toRet;
  }

  public boolean hayNSeguidosHabitables(int n){
    boolean hay = false;
    int cont = 0;

   if(n <= cantRefugios()) 
    for(int i = 0; i < cantRefugios() && !hay; i++){
      if(col[i].esHabitable()){
        cont++;
      }
      else {
        cont = 0;
      }
      if(cont >= n){
        hay = true;
      }
    }

    return hay;
  }

  public boolean equals(ColeccionRefugios c){
    boolean iguales = tamanoColeccion() == c.tamanoColeccion()
    && cant == c.cantRefugios();

    for(int i = 0; i < cantRefugios() && iguales; i++){
      iguales = cantRefugios() == c.cantRefugios()
      && col[i].equals(c.obtenerRefugio(i));
    }
    return iguales;
  }

}
