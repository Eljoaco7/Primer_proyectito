package Ej_3;

public class SImulacionSurtidor {
    public static void main(String[] args) {
        Surtidor surtidor = new Surtidor();
        System.out.println("Estado inicial");
        System.out.println("Surtidor super: " + surtidor.obtenerLitrosSuper());
        System.out.println("Surtidor gasoil: " + surtidor.obtenerLitrosGasoil());
        System.out.println("Surtidor premium " + surtidor.obtenerLitrosPremium());
        System.out.println("Los depositos estan TODOS llenos: ");
        if (surtidor.depositosLlenos()){
            System.out.println("Si, estan los 3 llenos ");
        } else {
          System.out.println("No, no estan los 3 llenos ");
        }
        System.out.println("Saco 3000 de gasoil: ");
         surtidor.extraerGasoil(3000);
         System.out.println("Surtidor gasoil: " + surtidor.obtenerLitrosGasoil());
         System.out.println("¿Los depositos estan TODOS llenos? ");
        if (surtidor.depositosLlenos()){
            System.out.println("Si, estan los 3 llenos ");
        } else {
          System.out.println("No, no estan los 3 llenos ");
        }

         System.out.println("Lleno el surtidor de gasoil: ");
         surtidor.llenarDepositoGasoil();
         System.out.println("Surtidor gasoil: " + surtidor.obtenerLitrosGasoil());
         System.out.println("¿Los depositos estan TODOS llenos? ");
        if (surtidor.depositosLlenos()){
            System.out.println("Si, estan los 3 llenos ");
        } else {
          System.out.println("No, no estan los 3 llenos ");
        }




        
         
    }
    
}
