package Primer_proyectito.TP4.Ej_3;

public class Oracion {
    // Atributos de instancia

    private char[] s;

    // Constructores

    public Oracion(String str) {
    s = new char[str.length()];              // arreglo del mismo tamaño que el String
    for (int i = 0; i < str.length(); i++) {
        s[i] = str.charAt(i);                // copio el carácter de la posición i
    }
 }
 
   // Comandos

   private boolean sobraBlanco(int i, int ultima) {
    return i < ultima && s[i] == ' ' && s[i - 1] == ' ';
}

  public void reducirBlancos() {
    // 1) posición de la última letra, leyendo de izq a der (exhaustivo)
    int ultima = 0;
    for (int i = 0; i < s.length; i++) {
        if (s[i] != ' ') {
            ultima = i;          // cada letra que veo pisa a la anterior
        }
    }

    // 2) cuento cuántos caracteres quedan (exhaustivo)
    int cant = 0;
    for (int i = 0; i < s.length; i++) {
        if (!sobraBlanco(i, ultima)) {
            cant++;
        }
    }

    // 3) copio los que quedan a un arreglo nuevo (exhaustivo)
    char[] nuevo = new char[cant];
    int j = 0;
    for (int i = 0; i < s.length; i++) {
        if (!sobraBlanco(i, ultima)) {
            nuevo[j] = s[i];
            j++;
        }
    }
    s = nuevo;
}


  
    
}
