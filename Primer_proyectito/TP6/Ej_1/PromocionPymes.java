package Primer_proyectito.TP6.Ej_1;

public class PromocionPymes extends PlanBase {
    
    // Atributos de instancia

    protected boolean activa;

    // Constructor

    public PromocionPymes(int u, int b){
        super(u, b);
        activa = true;
    }

    // Comandos

    public void cambiarActiva(){
        if(activa){
            activa = false;
        }
        else
            activa = true;
    }

    public int costoPlan(){
        int toRet = 0;
        if(activa){
            toRet = base;
        }
        else
            toRet = base + usuarios*5;
        
     return toRet;
    }


    
}
