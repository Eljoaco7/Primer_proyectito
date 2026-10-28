package TP5.Ej_2;

public class ConsumoEdificio {
    // Atributos de instancia

    private MedicionServicios[] consumoXPiso;

    // Constructor

    public ConsumoEdificio(int pisos){
        consumoXPiso = new MedicionServicios [pisos];
    }

    // Comandos

    private boolean pisoValido(int p){
        boolean retorno = false;
        if(p >= 1 && p <= consumoXPiso.length){
            retorno = true;
        }
        return retorno;
    }
    
    public boolean registrarConsumo(MedicionServicios m, int p){
        boolean retorno = false;
        if(pisoValido(p)){
            consumoXPiso[p - 1] = m;
            retorno = true;
        }
        return  retorno;
    }

    public boolean eliminarConsumo(int p){
        boolean retorno = false;
        if(pisoValido(p)){
            consumoXPiso[p - 1] = null;
            retorno = true;
        }
        return retorno;
    }

    public void eliminarCeros(){
        for(int i = 0; i < consumoXPiso.length; i++){
            if(consumoXPiso[i] != null){
                int ceros = 0;
                if(consumoXPiso[i].obtenerGas() == 0) ceros ++;
                if(consumoXPiso[i].obtenerAgua() == 0) ceros ++;
                if(consumoXPiso[i].obtenerElectricidad() == 0) ceros ++;
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
        boolean retorno = false;
        for(int i = 0; i < cantPosiciones() && !retorno; i++){
            if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c){
                retorno = true;
            }
        }

        return retorno;
    }

    public int cuantasMayores(int c){
        int cont = 0;
        for(int i = 0; i < cantPosiciones(); i++){
            if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c){
                cont++;
            }
        }
        return cont;
    }

    public int primerPisoMayor(int c){
        int mayor = -1;
        boolean encontre = false;

        for(int i = 0; i < cantPosiciones() && !encontre; i++){
            if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c){
                mayor = i + 1;
                encontre = true;
            }
        }

        return mayor;
    }

    public int ultimoPisoMayor(int c){
        int mayor = -1;
        boolean encontre = false;

        for(int i = cantPosiciones() - 1; i >= 0 && !encontre; i--){
            if(consumoXPiso[i] != null && consumoXPiso[i].costoServicios() > c){
                mayor = i + 1;
                encontre = true;
            }
        }

        return mayor;
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

    // OTRA VERSION DE LO MISMO DE ARRIBA
    /*public boolean todosMayores(MedicionServicios m) {
        boolean todos = true;
        for (int i = 0; i < consumoXPiso.length && todos; i++) {
            MedicionServicios actual = consumoXPiso[i];
            if (actual != null) {
                todos = actual.obtenerGas() > m.obtenerGas()
                     && actual.obtenerAgua() > m.obtenerAgua()
                     && actual.obtenerElectricidad() > m.obtenerElectricidad();
            }
        }
        return todos;
    }
} */


}
