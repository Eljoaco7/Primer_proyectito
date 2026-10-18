package Primer_proyectito.TP5.Ej_4;



import Ej_4.Refugio;

public class Territorio {
    
 // Atributos de instancia

 private Refugio[][] tablero;

 // Constructor

 public Territorio(int nf, int nc){
    tablero = new Refugio[nf][nc];
 }

 // Comandos

 public boolean establecerRefugio(Refugio r, int f, int c){
    boolean retorno = false;
    tablero[f][c] = r;
    if(0 <= f && f < cantFilas() && 0 <= c && c < cantColumnas())
        retorno = true;
    
    return retorno;
}

    // Consultas
    
    public int cantFilas(){
        return tablero.length;
    }

    public int cantColumnas(){
        return tablero[0].length;
    }

    public int cantRefugios(){
        int cont = 0;
        for(int i = 0; i < cantFilas(); i++){
            for(int j = 0; j < cantColumnas(); j++){
                if(tablero[i][j] != null){
                    cont++;
                }
            }
        }
        return cont;
    }

    public int filaMasPoblada(){
        int filaMax = 0;
        int maxRefugios = 0;

        for(int i = 0; i < cantFilas(); i++){
            int cont = 0;
            for(int j = 0; j < cantColumnas(); j++){
                if(tablero[i][j] != null){
                    cont++;
                }

                if(cont > maxRefugios){
                    maxRefugios = cont;
                    filaMax = i;
                }
            }
        }

        return filaMax;
    }

    public boolean maximoNRefugiosHabitables(int f, int n){
        boolean retorno = true;
        int cont = 0;
        for(int j = 0; j < cantColumnas() && retorno; j++){
            if(tablero[f][j] != null && tablero[f][j].esHabitable()){
                cont++;
            }
            if(cont > n){
                retorno = false;
            }
        }
        return retorno;
    }

    public int cantConDisponibilidadMayor(int m){
        int cont = 0;

        for(int j = 0; j < cantColumnas(); j++){
            boolean encontrado = false;

            for(int i = 0; i < cantFilas() && !encontrado; i++){
                if(tablero[i][j] != null && tablero[i][j].disponibilidad() > m){
                    encontrado = true;
                }
            }
            if(encontrado)
             cont++;
                
        }

        return cont;
    }


}
