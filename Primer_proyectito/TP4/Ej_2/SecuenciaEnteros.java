package Primer_proyectito.TP4.Ej_2;

public class SecuenciaEnteros {

    // Atributos de instancia

    private int[] sec;

    // Constructor

    public SecuenciaEnteros(int cant){
        sec = new int[cant];

    }

    // Comandos

    public void establecerEntero(int p, int n){
        sec[p] = n;
    }

    public void reemplazar(int n1, int n2){
        for(int i = 0; i < sec.length; i++){
            if(sec[i] == n1){
                sec[i] = n2;
            }
        }
    }

    public void reemplazar(int n) {
    boolean encontrada = false;
    int primera = 0;
    int ultima = 0;
    for (int i = 0; i < sec.length; i++) {
        if (sec[i] == n) {
            if (!encontrada) {
                primera = i;         // solo la primera vez que aparece
                encontrada = true;
            }
            ultima = i;              // se pisa en cada aparición
        }

        if(encontrada){
            sec[primera] = 0;
            sec[ultima] = 0;
        }
    
    }
 }
  public boolean intercambiar(int p1, int p2){
    boolean retorno = false;
     if (0 <= p1 && p1 < sec.length && 0 <= p2 && p2 < sec.length){
        int p1aux= sec[p1];
        sec[p1] = sec[p2];
        sec[p2] = p1aux;
        retorno = true;
     }
     return retorno;
  }

  public boolean copy(SecuenciaEnteros a){
    boolean retorno = false;
    if(a != null && a.cantElementos() == sec.length){
        retorno = true;
        for(int i = 0; i < sec.length; i++){
            sec[i] = a.sec[i];
        }
    }
    return  retorno;

  }

  // Consultas

  public int obtenerEntero(int p){
    return sec[p];
  }

  public int cantElementos(){
    return sec.length;
  }

  public int total(){
    int suma = 0;

    for(int i = 0; i < sec.length; i++){
        suma = suma + sec[i];

    }
    return suma;
  }

  public boolean estaNum(int n){
    
    boolean encontre = false;
    for(int i = 0; i < sec.length && !encontre; i++){
        if(sec[i] == n){
            encontre = true;
        }
    }
    return encontre;
  }

  public int cantidadMayores(int n){
    int mayores = 0;
    for(int i = 0; i < sec.length; i++){
        if(sec[i] > n){
            mayores++;
        }

  }
  return mayores;

}

public boolean mitadMayores(int n){

    return cantidadMayores(n) >= sec.length / 2.0;

}

public boolean equals(SecuenciaEnteros a){
    boolean retorno = a != null && a.cantElementos() == sec.length;
    for(int i = 0; i < sec.length && retorno; i++){ 
        retorno = sec[i] == a.sec[i];
    }


return retorno;

}

public String m(int i) {
    
    throw new UnsupportedOperationException("Unimplemented method 'm'");
}
}