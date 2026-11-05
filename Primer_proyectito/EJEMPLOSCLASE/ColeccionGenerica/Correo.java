package EJEMPLOSCLASE.ColeccionGenerica;

public class Correo extends Coleccion {

    public Correo(int max){
        super(max);
    }
    
    public Correo FiltroAsuntos(String a){
        Correo cor = new Correo(cantElementos());
        for(int i = 0; i < cantElementos(); i++){
            Mensaje sms = (Mensaje) t[i];
            if(sms.obtenerAsunto().equals(a)){
                cor.insertar(t[i]);
            }
        }
    }
    return cor;
}
