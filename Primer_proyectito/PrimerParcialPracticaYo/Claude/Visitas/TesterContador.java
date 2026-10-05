package Claude.Visitas;

public class TesterContador {
    public static void main(String[]args){
        ContadorVisitas c = new ContadorVisitas(7);
        c.establecerVisitas(0, 50);
        c.establecerVisitas(1, 150);
        c.establecerVisitas(2, 250);
        c.establecerVisitas(3, 60);
        c.establecerVisitas(4, 500);
        c.establecerVisitas(5, 530);
        c.establecerVisitas(6, 30);

        System.out.println("==ESTADO ACTUAL==");
        System.out.println("Dia: 0 CantidadV: " + c.obtenerVisitas(0));
        System.out.println("Dia: 1 CantidadV: " + c.obtenerVisitas(1));
        System.out.println("Dia: 2 CantidadV: " + c.obtenerVisitas(2));
        System.out.println("Dia: 3 CantidadV: " + c.obtenerVisitas(3));
        System.out.println("Dia: 4 CantidadV: " + c.obtenerVisitas(4));
        System.out.println("Dia: 5 CantidadV: " + c.obtenerVisitas(5));
        System.out.println("Dia: 6 CantidadV: " + c.obtenerVisitas(6));

        System.out.println("==VOY A PROBAR EL SERVICIO alMenosNDiasMeta==");
        System.out.println("Hay al menos 3 dias meta ? RESULTADO ESPERADO = TRUE : " + c.alMenosNDiasMeta(3));
        System.out.println("Hay al menos 10 dias meta ? RESULTADO ESPERADO = FALSE : " + c.alMenosNDiasMeta(10));
        System.out.println("Hay al menos 7 dias meta ? RESULTADO ESPERADO = FALSE : " + c.alMenosNDiasMeta(7));
        System.out.println("Hay al menos 5 dias meta ? RESULTADO ESPERADO = FALSE : " + c.alMenosNDiasMeta(5));

        System.out.println("==VOY A PROBAR EL SERVICIO hayRachaMeta==");
        System.out.println("Hay racha de 2 dias ? RESULTADO ESPERADO = TRUE : " + c.hayRachaMeta(2));
        System.out.println("Hay racha de 10 dias ? RESULTADO ESPERADO = FALSE : " + c.hayRachaMeta(10)); 
        System.out.println("Hay racha de 4 dias ? RESULTADO ESPERADO = FALSE : " + c.hayRachaMeta(4));  // Hay 4 dias que cumplen ser mayores que minVisitas pero no consecutivos

        System.out.println("==VOY A PROBAR EL SERVICIO equals==");
        System.out.println("CREO 2 NUEVOS ContadorVisitas");

        ContadorVisitas c2 = new ContadorVisitas(3);
        c2.establecerVisitas(0, 50);
        c2.establecerVisitas(1, 150);
        c2.establecerVisitas(2, 250);
     
        
        ContadorVisitas c3 = new ContadorVisitas(7);
        c3.establecerVisitas(0, 50);
        c3.establecerVisitas(1, 150);
        c3.establecerVisitas(2, 250);
        c3.establecerVisitas(3, 60);
        c3.establecerVisitas(4, 500);
        c3.establecerVisitas(5, 530);
        c3.establecerVisitas(6, 30);
        
        System.out.println("==C2==");
        System.out.println("Dia: 0 CantidadV: " + c2.obtenerVisitas(0));
        System.out.println("Dia: 1 CantidadV: " + c2.obtenerVisitas(1));
        System.out.println("Dia: 2 CantidadV: " + c2.obtenerVisitas(2));

        System.out.println("==C3==");
        System.out.println("Dia: 0 CantidadV: " + c3.obtenerVisitas(0));
        System.out.println("Dia: 1 CantidadV: " + c3.obtenerVisitas(1));
        System.out.println("Dia: 2 CantidadV: " + c3.obtenerVisitas(2));
        System.out.println("Dia: 3 CantidadV: " + c3.obtenerVisitas(3));
        System.out.println("Dia: 4 CantidadV: " + c3.obtenerVisitas(4));
        System.out.println("Dia: 5 CantidadV: " + c3.obtenerVisitas(5));
        System.out.println("Dia: 6 CantidadV: " + c3.obtenerVisitas(6));

        System.out.println("C Es equivalente a C2 ? : RESULTADO ESPERADO = FALSE : " + c.equals(c2));
        System.out.println("C Es equivalente a C3 ? : RESULTADO ESPERADO = TRUE : " + c.equals(c3));
        System.out.println("C2 Es equivalente a C3 ? : RESULTADO ESPERADO = FALSE : " + c2.equals(c3));

        //e) clone y copy independientes
        ContadorVisitas clon = c.clone();
        clon.establecerVisitas(1, 500);
        System.out.println(c.obtenerVisitas(1)); // 90 (el original no cambio)
        ContadorVisitas cop = new ContadorVisitas(2);
        cop.copy(c);
        cop.establecerVisitas(2, 0);
        System.out.println(c.obtenerVisitas(2)); // 150 (el original no cambio)
        System.out.println(cop.obtenerCantDias()); // 7 (copy tambien copio el tamanio)

        
    }


    
}
