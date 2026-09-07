package Ej_4;

public class Refugio {
    // Atributos de clase
    private static final int capacidadAlacena = 20;
    private static final int cantidadCamas = 10;
    // Atributos de instancia
    private int alimentos,bebidas,camas;
    // Constructor
    public Refugio (int a, int b, int c){
        if(a + b > capacidadAlacena){
            alimentos = capacidadAlacena/2;
            bebidas = capacidadAlacena/2;
        } else {
            alimentos = a;
            bebidas = b;

        }
      
    if(c > cantidadCamas){
        camas = cantidadCamas;
        
        } else {
        camas = c;

    }
  }
// comandos
public void consumirAlimento(){
    alimentos--;
}
public void consumirBebida(){
    bebidas--;
}
public boolean reponerAlimentos(int n){
    if (n > 0 && alimentos + n <= capacidadAlacena){
        alimentos += n;
        return true;
        } else {
        return false;

    }
}
public boolean reponerBebidas(int n){
    if (n > 0 && bebidas + n <= capacidadAlacena){
        bebidas += n;
        return true;
        } else {
        return false;

    }
}
public boolean desocuparCama(){
    if (camas > 0){
        camas--;
    return true;
     } else {
        return false;
  }
}
public boolean ocuparCama(){
    if (camas < cantidadCamas){
        camas++;
        return true;
     } else {
        return false;
    }
}
// Consultas
public int obtenerAlimentos(){
 return alimentos;
}
public int obtenerBebidas(){
    return bebidas;
}
public int obtenerCamas(){
    return camas;
}
public int obtenerCapacidadAlacena(){
    return capacidadAlacena;
}
public boolean esHabitable(){
    if (alimentos > 0 || bebidas > 0 || disponibilidad() > 0){
      return true;
     } else {
        return false;
      }

}
public int disponibilidad(){
    return cantidadCamas - camas;
}
public int diasSupervivencia(){
    if (alimentos < bebidas)
        return alimentos;
    else
        return bebidas;
}
public boolean mayorAlimentos(Refugio r){
    return r != null && this.alimentos > r.alimentos;

}
public boolean equals(Refugio r){
    return r != null
         && this.alimentos == r.alimentos 
            && this.bebidas == r.bebidas 
            && this.camas == r.camas;
}
public Refugio clone(){
    Refugio copia = new Refugio(this.alimentos, this.bebidas, this.camas);
        return copia;

}
public String toString(){
    return "Refugio [alimentos=" + alimentos + ", bebidas=" + bebidas 
            + ", camas=" + camas + ", disponibilidad=" + disponibilidad() + "]";
}
}


