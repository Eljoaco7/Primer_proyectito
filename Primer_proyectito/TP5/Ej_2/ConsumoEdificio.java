package TP5.Ej_2;

public class ConsumoEdificio {
    // Atributos de instancia

    protected MedicionServicios [] consumoXPiso;

    // Constructor

    public ConsumoEdificio(int pisos){
        consumoXPiso = new MedicionServicios[pisos];
    }

    // Comandos

    public boolean registrarConsumo(MedicionServicios m, int p){
        boolean toRet = false;
        if(p >= 1 && p <= cantPosiciones()){
            consumoXPiso[p - 1] = m;
            toRet = true;
        }

        return toRet;
    }

    public boolean eliminarConsumo(int p){
        boolean toRet = false;
        if(p >= 1 && p <= cantPosiciones()){
            consumoXPiso[p - 1] = null;
            toRet = true;
        }
        return toRet;
    }

    public void eliminarCeros(){

        for(int i = 0; i < cantPosiciones(); i++){
            if(consumoXPiso[i] != null){
                int ceros = 0;
                if(consumoXPiso[i].obtenerAgua() == 0) 
                    ceros++;
                if(consumoXPiso[i].obtenerGas() == 0) 
                    ceros++;
                if(consumoXPiso[i].obtenerElectricidad() == 0) 
                    ceros++;
                if(ceros >= 2)
                    consumoXPiso[i] = null;
                
            }
        }
    }

    // Consultas

    public int cantPosiciones(){
        return consumoXPiso.length;
    }

    public int cantRegistrosConsumo(){
        int cont = 0;

        for(int i = 0; i < cantPosiciones(); i++){
            if(consumoXPiso[i] != null){
                cont++;
            }
        }
        return cont;
    }

    public MedicionServicios obtenerMedicionServicios(int p){
        return consumoXPiso[p - 1];
    }

    public boolean hayMayorConsumo(int c){
        boolean fueMayor = false;

        for(int i = 0; i < cantPosiciones() && !fueMayor; i++){
            if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c){
                fueMayor = true;
            }
        }
        return fueMayor;
    }

    public int cuantasMayores(int c){
        int contC = 0;

        for(int i = 0; i < cantPosiciones(); i++){
            if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c){
                contC++;
            }
        }
        return contC;
    }

    public int primerPisoMayor(int c){
        boolean encontrePrimerMayor = false;
        int primerMayor = -1;

        for(int i = 0; i < cantPosiciones() && !encontrePrimerMayor; i++){
            if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c){
                encontrePrimerMayor = true;
                primerMayor = i + 1;
            }
        }
        return primerMayor;
    }

    public int ultimoPisoMayor(int c){
        boolean encontre = false;
        int ultimoMayor = -1;

        for(int i = cantPosiciones() - 1; i >= 0 && !encontre; i--){
            if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c){
                encontre = true;
                ultimoMayor = i + 1;
            }
        }
        return ultimoMayor;
    }

    public boolean nMayores(int c, int n){
        boolean hay = false;
        int cont = 0;

        if(cantPosiciones() >= n){
            for(int i = 0; i < cantPosiciones() && !hay; i++){
                if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c){
                    cont++;
                }
                if(cont >= n){
                    hay = true;
                }
            }
        }
        return hay;
    }

    public boolean todosMayores(int c){
        boolean todoSonMayores = true;

        for(int i = 0; i < cantPosiciones() && todoSonMayores; i++){
            if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() <= c){
                todoSonMayores = false;
            }
        }

        return todoSonMayores;
    }
    
    /*public boolean todosMayores(int c){
        int cont = cuantasMayores(c);
        return cont == c;
    }*/

    public boolean todosMayores(MedicionServicios m){
        boolean todos = true;

        for(int i = 0; i < cantPosiciones() && todos; i++){
            if(consumoXPiso[i] != null){
                if(consumoXPiso[i].obtenerGas() <= m.obtenerGas())
                    todos = false;
                else if(consumoXPiso[i].obtenerAgua() <= m.obtenerAgua())
                    todos = false;
                else if(consumoXPiso[i].obtenerElectricidad() <= m.obtenerElectricidad())
                    todos = false;

            }
        }

        return todos;
    }


}
