
import java.util.Scanner;


public class TesterPoliza {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int np = 0;
        double i = 0, r = 0;
                
        while (np<=0 || i<=0 || r<=0){
            System.out.println("Ingrese 3 numeros enteros");
            np=sc.nextInt();
            i=sc.nextDouble();
            r=sc.nextDouble();
        }
            
        Poliza p = new Poliza(np, i, r);
        p.actualizarPorcentaje(20);
        p.desactivar();
        p.actualizarPorcentaje(10);
        p.activar();
        System.out.println("El numero de poliza es: " + np);
        System.out.println("El costo de la poliza es: " + p.obtenerCostoPoliza());
        System.out.println("El estado de la poliza es: " + p.estaActiva());
    
        
        Poliza p2 = new Poliza(111);
        p2.establecerRobo(1000);
        p2.establecerIncendio(1200);
        p2.actualizarPorcentaje(15);
        System.out.println("El numero de poliza 2 es " + p2.obtenerNroPoliza());
        System.out.println("El costo de la poliza 2 es " + p2.obtenerCostoPoliza());
        sc.close();
        
    }




       
      
    }

    

