package EJEMPLOSCLASE.EstacionMeteor;

public class TempMinEstacion {
    private float[] tmin;
    public TempMinEstacion(int cant) {
        tmin = new float [cant];
    }

    public void establecerTempMin(int dia, float t){
        tmin[dia-1] = t;

    }

    public float obtenerTempMin(int dia){
        return tmin[dia-1];
    }

    public int cantDias(){
        return tmin.length;
    }
    public int cantHeladas(){
        int cant = 0;
        for (int i = 0; i < cantDias(); i++){
            if(tmin[i] <= 0)
                cant++;

        }
        return cant;
    }
    public boolean huboHeladas(){
        boolean retorno = false;
        for (int i = 0; i < cantDias() && !retorno; i++)
            if(tmin[i] <= 0)
                retorno = true;

     
     return retorno;
    }

    public float primerMayor(Float t){
        boolean encontre = false;
        float pri = t;
        for(int i = tmin.length - 1; i < cantDias() && !encontre; i++){
            if(tmin[i] > t){
                encontre = true;
                pri = tmin[i];

            }
        }
     return pri;
    }
    public float ultimoMayor(Float t){
        boolean encontre = false;
        float ult = t;
        for(int i = tmin.length - 1; i >= 0 && !encontre; i++){
            if(tmin[i] > t){
                encontre = true;
                ult = tmin[i];

            }
        }
     return ult;
    }

    public int diaMayor(float t){
        boolean encontre = false;
        int dia = 0;
        for(int i = 0; i < cantDias() && !encontre; i++)
            if(tmin[i] > t){
                encontre = true;
                dia = i+1;
            }
      return dia;
    }
    
    public boolean equals(TempMinEstacion e){
        boolean iguales = e!=null && cantDias() == e.cantDias();
        
        for(int i = 0; i < cantDias() && iguales; i++){
            iguales = tmin[i] == e.obtenerTempMin(i+1);    // e[i] no va, solo se puede acceder mediante servicios
          }
        return iguales;

    
    }


    
}

