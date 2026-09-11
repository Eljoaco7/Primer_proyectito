package Primer_proyectito.TP3.Ej_1;

import Ej_4.Refugio;

public class TesterCriatura {
    public static void main(String[] args) {
        Refugio r1 = new Refugio(5, 5, 0);
        Criatura c1 = new Criatura(r1);

        
        

        // Pruebo las consultas

        System.out.println("<<PRUEBO LAS CONSULTAS>>");
        System.out.println("Energia de la Criatura 1 : " + c1.obtenerEnergia());  // deberia dar 100
        System.out.println("Caminatas de la Criatura 1 : " + c1.obtenerCaminatas()); // deberia dar 0
        System.out.println("Estado de la Criatura 1 despierto/dormido: " + c1.estaDormido()); // deberia dar false pues no esta dormido
        System.out.println("El humor de Criatura 1 : " + c1.obtenerHumor()); // deberia dar 3 pues esta al mango de energia y hay refugio
        System.out.println("El refugio de la Criatura : " + c1.obtenerRefugio());
        System.out.println("Metodo ToString : " + c1.toString());

        // Pruebo los Comandos
        System.out.println("<<PRUEBO LOS COMANDOS>>");

        c1.caminar();
        System.out.println("<<PRIMERA CAMINATA>>");
        System.out.println("Caminatas de la Criatura 1 : " + c1.obtenerCaminatas()); // deberia dar 1
        System.out.println("Energia de la Criatura 1 : " + c1.obtenerEnergia());  // deberia dar 90
        System.out.println("Estado de la Criatura 1 despierto/dormido: " + c1.estaDormido()); // deberia dar false pues todavia no se va a dormir
        c1.caminar();
        c1.caminar();
        System.out.println("<<TERCERA CAMINATA>>");
        System.out.println("Caminatas de la Criatura 1 : " + c1.obtenerCaminatas()); // deberia dar 3
        System.out.println("Energia de la Criatura 1 : " + c1.obtenerEnergia());  // deberia dar 70
        System.out.println("Estado de la Criatura 1 despierto/dormido: " + c1.estaDormido()); // deberia dar false pues todavia no se va a dormir
        System.out.println("<<CUARTA CAMINATA>>");
        c1.caminar();
        System.out.println("Caminatas de la Criatura 1 : " + c1.obtenerCaminatas()); // deberia dar 3
        System.out.println("Energia de la Criatura 1 : " + c1.obtenerEnergia());  // deberia dar 70 no gasta energia cuando se va a dormir
        System.out.println("Estado de la Criatura 1 despierto/dormido: " + c1.estaDormido()); // deberia dar true pues va a dormir

        System.out.println("<<DESPIERTO A LA CRIATURA>>");
        c1.despertar();
        System.out.println("La criatura esta dormida? " + c1.estaDormido()); // false
        System.out.println("<<LA HAGO COMER Y LUEGO BEBER>>");
        c1.comer();
        System.out.println("Energia de la Criatura 1 : " + c1.obtenerEnergia()); // deberia dar 71
        c1.beber();
        System.out.println("Energia de la Criatura 1 : " + c1.obtenerEnergia()); // deberia dar 72

        
        System.out.println("<<OCUPO TODAS LAS CAMAS DEL REFUGIO>>");
         boolean ocupada = true;
         while (ocupada) {
         ocupada = r1.ocuparCama();
            }
        System.out.println("El refugio de la Criatura : " + c1.obtenerRefugio());
        System.out.println("<<HAGO QUE LA CRIATURA TRATE DE DORMIR>>");
        System.out.println("Puede dormir la criatura ? " + c1.dormir()); // retorna false
        System.out.println("Veo Caminatas de la Criatura 1 : " + c1.obtenerCaminatas()); // deberia dar 0
        System.out.println("<<LA HAGO CAMINAR>>");
        int camin = 0;
         while (camin < 3){
          c1.caminar();
            camin = c1.obtenerCaminatas();
                 System.out.println("Veo Caminatas de la Criatura 1 : " + c1.obtenerCaminatas()); // deberia dar 1,2,3

         }
         System.out.println("<<VA A TRATAR DE DORMIR>>");
         c1.caminar();
        System.out.println("Caminatas de la Criatura 1 : " + c1.obtenerCaminatas()); // deberia dar 3
        System.out.println("Energia de la Criatura 1 : " + c1.obtenerEnergia());  // deberia dar 0
        System.out.println("Estado de la Criatura 1 despierto/dormido: " + c1.estaDormido()); // deberia dar false
        System.out.println("[PROBE QUE PASARIA SI LA CRIATURA TRATA DE DORMIR LUEGO DE CAMINAR Y NO HAY CAMAS]");

        System.out.println("<<VOY A PROBAR DARLE DE COMER Y BEBER MIENTRAS DUERME>>");

        System.out.println("<<DESOCUPO CAMA>>");
        r1.desocuparCama();
        System.out.println("El refugio de la Criatura : " + c1.obtenerRefugio());  
        System.out.println("<<LA DUERMO>>");
        c1.dormir();
        System.out.println("Estado de la Criatura 1 despierto/dormido: " + c1.estaDormido());  // System.out.println("<<>>");
        System.out.println("El refugio de la Criatura : " + c1.obtenerRefugio());
        System.out.println("<<LE DOY DE COMER>>");
        System.out.println("Puede COMER la criatura ? " + c1.comer()); // false
        System.out.println("<<LE DOY DE BEBER>>");
        System.out.println("Puede BEBER la criatura ? " + c1.beber()); // false

        System.out.println("<<VOY A PROBAR DORMIRLA DORMIDA>>");
        
        System.out.println("Puede dormir la criatura ? " + c1.dormir());
        System.out.println("El refugio de la Criatura : " + c1.obtenerRefugio());
        System.out.println("Estado de la Criatura 1 despierto/dormido: " + c1.estaDormido());

        System.out.println("<<INTENTO CAMINAR ESTANDO DORMIDA>>");
        System.out.println("Puede caminar la criatura ? " + c1.caminar()); // deberia dar false
        System.out.println("Caminatas de la Criatura 1 : " + c1.obtenerCaminatas()); // no deberia cambiar
        }
    
}
