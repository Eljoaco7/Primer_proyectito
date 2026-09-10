package EJEMPLOSCLASE;

public class NotasParcial {
    private int[] notas;
    public NotasParcial(int cant){
        notas = new int [cant];
    }
    public void establecerNota(int n, int i){
        if (n >= 0 && n <= 100)
            notas[i] = n;

    }
    public int obtenernota(int i){
        return notas[i];
    }
    public int cantNotas(){
        return notas.length;
    }
    public int cantidadAprobados(){
        int cant= 0;
        for(int i = 0; i < notas.length; i++)
            if(notas[i]>=60)
                cant++;
        
     return cant;
    }

    public float promedioGeneral(){
        int suma = 0;
        for(int i = 0; i < notas.length; i++)
            suma = suma + notas[i];
     return suma/cantNotas();
    }
    public float promedioAprobados(){
        int suma = 0;
        int cont = 0;
        float prom = 0;
        for(int i = 0; i < notas.length; i++){
            if(notas[i]>=60){
                suma = suma + notas[i];
                cont++;
            }
            
    }
    if(cont > 0)
        prom = suma/cont;
    else
        prom = -1;
    return prom;

}

public boolean alMenos100(){
  boolean hay = false;
    for(int i = 0; i < notas.length && !hay; i++)
        if(notas[i] == 100)
            hay = true;

 return hay;
}


    
}
