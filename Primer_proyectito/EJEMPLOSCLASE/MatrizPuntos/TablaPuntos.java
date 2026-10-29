package EJEMPLOSCLASE.MatrizPuntos;



public class TablaPuntos{
    private Punto[] tab;

    public TablaPuntos(int max){
      tab = new Punto[max];
    }
    //Comandos
    public void insertar(int i, Punto p){
    /*Asigna el punto p a la posición i. Requiere que p esté ligado e i sea una posición válida*/
        tab[i] = p;
    }
    
    public Punto obtenerPunto(int p){
      return tab[p];
    }

}