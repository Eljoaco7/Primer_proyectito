package Primer_proyectito.EJEMPLOSCLASE.Ciudad;

public class ColeccionCiudadesOrd {

    // Atributos de instancia

    private Ciudad [] ciudades;
    private int cant;

    // Constructor

    public ColeccionCiudadesOrd(int max){
        ciudades = new Ciudad[max];
        cant = 0;
    }

    // Comandos

    public void insertar(Ciudad c){
        int pos = posInsert(c);
        arrastrar(pos);
        ciudades[pos] = c;
        cant++;
    }

    // Servicio util para la implementacion de arriba:
    /*private int posInsert(Ciudad c){                  // Ahora si esta completo pero con boolean
    int pos = cant;
    boolean encontre = false;

    for(int i = 0; i < cant && !encontre; i++){
        if(ciudades[i].mayor(c)){
            encontre = true;
            pos = i;
        }
    }
    return pos;
   }*/


    private int posInsert(Ciudad c){            
        int pos = cant;
        

        for(int i = 0; i < cantCiudades() && pos == cant; i++){
            if(ciudades[i].mayor(c)){
                
                pos = i;
            }
        }
        return pos;
    }

    private void arrastrar(int p){
        for(int i = cant; i > p; i--){
            ciudades[i] = ciudades[i - 1];
        }
    }
    

    public void eliminar(Ciudad c){
        int pos = buscarCiudad(c);
        if(pos != -1){
            arrastrarAnt(pos);
            cant--;
        }
    }

    private int buscarCiudad(Ciudad c){
        int pos = -1;
        boolean salir = false;
        for(int i = 0; i < cantCiudades() && !salir; i++){
            if(ciudades[i].equals(c)){
                pos = i;
                salir = true;
            }
            else if(ciudades[i].mayor(c)){
                salir = true;
            }
        }
        return pos;
    }

    private void arrastrarAnt(int p){
        for(int i = p; i < cant - 1; i++){
            ciudades[i] = ciudades[i + 1];
        }
    }

    public void eliminarPorCantPob(int c){}

    // ................

    // Consultas

    public int cantCiudades(){
        return cant;
    }

    // ................
    
}
