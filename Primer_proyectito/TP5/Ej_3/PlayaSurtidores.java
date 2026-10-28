package TP5.Ej_3;

import TP2.Ej_3.Surtidor;

public class PlayaSurtidores {
    // Atributos de instancia

    private Surtidor[] Tabla;

    // Constructores

    public PlayaSurtidores(int n){
        Tabla = new Surtidor[n];
        for(int i = 0; i < cantPosiciones(); i++){
            Tabla[i] = null;
        }
    }

    public PlayaSurtidores(){
        Tabla = new Surtidor[10];
        for(int i = 0; i < cantPosiciones(); i++){
            Tabla[i] = new Surtidor();
            Tabla[i].llenarDepositoGasoil();
            Tabla[i].llenarDepositoSuper();
            Tabla[i].llenarDepositoPremium();
        }
    }

    // Comandos

    public void establecerSurtidor(Surtidor s, int p){
        Tabla[p] = s;
    }

    public void establecerSurtidor(Surtidor s){
        boolean encontre = false;
        for(int i = 0; i < cantPosiciones() && !encontre; i++){
            if(Tabla[i] == null){
                Tabla[i] = s;
                encontre = true;
            }
        }
    }

    public void llenaDepositos(){
        for(int i = 0; i < cantPosiciones(); i++){
            Tabla[i].llenarDepositoGasoil();
            Tabla[i].llenarDepositoSuper();
            Tabla[i].llenarDepositoPremium();
        }
    }

    private void arrastrarIzquierda(int p){
        for(int i = p; i < cantPosiciones() - 1; i++){
            Tabla[i] = Tabla[i + 1];
        }
        Tabla[cantPosiciones() - 1] = null;
    }
    
    public void agrupaSurtidores(){
        for(int i = cantPosiciones() - 1; i >= 0; i--){
            if(Tabla[i] == null){
                arrastrarIzquierda(i);
            }
        }
    }

    // Consultas

    public int cantPosiciones(){
        return Tabla.length;
    }

    public int cantSurtidores(){
        int cont = 0;

        for(int i = 0; i < cantPosiciones(); i++){
            if(Tabla[i] != null){
                cont++;
            }
        }

        return cont;
    }

    public Surtidor obtenerSurtidor(int p){
        return Tabla[p];
    }

    public int cantMaximaCarga(){
        int cont = 0;

        for(int i = 0; i < cantPosiciones(); i++){
            if(Tabla[i] != null)
                if(Tabla[i].obtenerLitrosGasoil() == Tabla[i].obtenerMaximaCarga()
                    && Tabla[i].obtenerLitrosSuper() == Tabla[i].obtenerMaximaCarga()
                    && Tabla[i].obtenerLitrosPremium() == Tabla[i].obtenerMaximaCarga())
                        cont++;
                    
        }

        return cont;
    }

    public boolean mismosNulos(PlayaSurtidores ps){
        boolean retorno = true;
        
        for(int i = 0; i < cantPosiciones() && retorno; i++){
            if((Tabla[i] == null) != (ps.obtenerSurtidor(i) == null)){
                retorno = false;
            }
        }

        return retorno;
    }

    public PlayaSurtidores clone(){
        PlayaSurtidores copia = new PlayaSurtidores(cantPosiciones());
        for(int i = 0; i < cantPosiciones(); i++){
            copia.Tabla[i] = Tabla[i];
        }
        return copia;
    }

    public PlayaSurtidores nLigados(int n){
        PlayaSurtidores resultado = null;
        int cont = 0;
        int inicio = 0;
        boolean encontrada = false;
        if(cantPosiciones() <= n){
            for(int i = 0; i < cantPosiciones() && !encontrada; i++){
                if(Tabla[i] != null){
                    if(cont == 0){
                     inicio = i;
                    }
                    cont++;
                }
                if(cont == n){
                    encontrada = true;
                }
                else {
                    cont = 0;
                }

                if(encontrada){
                    resultado = new PlayaSurtidores(n);
                    for(int k = 0; k < n; k++){
                        resultado.establecerSurtidor(Tabla[inicio + k], k);

                    }
                }
            }
        }

        return resultado;
    }
}

    
