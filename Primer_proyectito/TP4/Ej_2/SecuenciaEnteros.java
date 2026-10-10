package Primer_proyectito.TP4.Ej_2;

public class SecuenciaEnteros {

    // Atributos de instancia

    private int [] sec;

    // Constructor

    public SecuenciaEnteros(int cant){
        sec = new int[cant];
    }

    // Comandos

    public void establecerEntero(int p, int n){
        sec[p] = n;
    }

    public void reemplazar(int n1, int n2){
        for(int i = 0; i < cantElementos(); i++){
            if(sec[i] == n1){
                sec[i] = n2;
            }
        }
    }

    public void reemplazar(int n){
        boolean encontre = false;
        int PrimeraN = 0;
        int UltimaN = 0;
        for(int i = 0; i < cantElementos() && !encontre; i++){
            if(sec[i] == n){
                if(!encontre){
                    PrimeraN = i;
                    encontre = true;
                }

                UltimaN = i;

        }
    }
    if(encontre){
        sec[PrimeraN] = 0;
        sec[UltimaN] = 0;
    }

}
    public boolean copy(SecuenciaEnteros a){
       boolean retorno = false;
        if(a!=null && a.cantElementos() == cantElementos())
          retorno = true;
        for(int i = 0; i < cantElementos() && retorno; i++){
            sec[i] =  a.sec[i];
        }
        return retorno;
    }

    public boolean intercambiar(int p1, int p2){
        int p1aux = 0;
        boolean retorno = false;
        if(0 <= p1 && p1 < cantElementos() && 0 <= p2 && p2 < cantElementos()){
            p1aux = sec[p1];
            sec[p1] = sec[p2];
            sec[p2] = p1aux;
            retorno = true;
        }
        return retorno;
    }
  

    public int obtenerEntero(int p){
        return sec[p];
    }

   
    public int cantElementos(){
        return sec.length;
    }

    public int total(){
        int suma = 0;
        for(int i = 0; i < cantElementos(); i++){
            suma = suma + sec[i];
        }
        return suma;
    }

    public boolean estaNum(int n){
        boolean esta = false;
        for(int i = 0; i < cantElementos() && !esta; i++){
            if(sec[i] == n){
                esta = true;
            }
        }
        return esta;
    }

    public int cantidadMayores(int n){
        int cont = 0;

        for(int i = 0; i < cantElementos(); i++){
            if(sec[i] == n){
                cont++;
            }
        }
        return cont;
    }

    public boolean mitadMayores(int n){
        return cantidadMayores(n) >= cantElementos()/2.0;
    }

    public boolean equals(SecuenciaEnteros a){
        boolean retorno = (cantElementos() ==  a.cantElementos());

        for(int i = 0; i < cantElementos() && retorno; i++){
            if(sec[i] != a.sec[i]){
                retorno = false;
            }
        }
        return retorno;
    }

    public SecuenciaEnteros clone(){
        SecuenciaEnteros clon = new SecuenciaEnteros(cantElementos());

        for (int i = 0; i < cantElementos(); i++){
            clon.sec[i] = sec[i];
        }
        return clon;
    }
        

    
}



