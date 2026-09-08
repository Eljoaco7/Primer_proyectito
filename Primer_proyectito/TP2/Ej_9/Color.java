package Ej_9;

public class Color {
    /*de los tres se obtiene el blanco (255, 255, 255)
    La ausencia de los tres produce el negro (0, 0, 0)
    La terna (50, 50, 50) representa un gris oscuro 
    En cambio, (150, 150, 150) es un gris más claro.*/
    
    // Atributos de instancia
    private int rojo,verde,azul;

    // Constructores
    public Color(){
        rojo = 255;
        verde = 255;
        azul = 255;

    }

    public Color(int r, int v, int a){
        if (r < 0 || r > 255 || v < 0 || v > 255 || a < 0 || a > 255){
            r = 255;
            v = 255;
            a = 255;
        
     } else {
        rojo = r;
        verde = v;
        azul = a;


     }
    }
    
    // Comandos
    public void variar(int val){
        rojo = rojo + val;
        if (rojo > 255)
            rojo = 255;
        if(rojo < 0)
            rojo = 0;
        
        azul = azul + val;
        if (azul > 255)
            azul = 255;
        if(azul < 0)
            azul = 0;
        
        verde = verde + val;
        if (verde > 255)
            verde = 255;
        if(verde < 0)
            verde = 0;

        }
        public void variarRojo(int val){
            rojo = rojo + val;
            if (rojo > 255)
            rojo = 255;
         if(rojo < 0)
            rojo = 0;
        }
        public void variarAzul(int val){
           azul = azul + val;
            if (azul > 255)
            azul = 255;
        if(azul < 0)
            azul = 0;

        }
        public void variarVerde(int val){
          verde = verde + val;
            if (verde > 255)
            verde = 255;
        if(verde < 0)
            verde = 0;

        }

        public void establecerRojo(int val){
            rojo = val;
        }
        public void establecerAzul(int val){
            azul = val;
        }
        public void establecerVerde(int val){
            verde = val;
        }
        public void copy(Color c){
            if (c != null){
                rojo = c.rojo;
                azul = c.azul;
                verde = c.verde;

            }
        }
        // Consultas
        public int obtenerRojo(){
            return rojo;
        }
        public int obtenerAzul(){
            return azul;
        }
        public int obtenerVerde(){
            return verde;
        }
        public boolean esRojo(){
            return rojo == 255 && azul == 0 && verde == 0;
        }
        public boolean esGris(){
            return rojo == verde && verde == azul;
        }
        public boolean esNegro(){
            return rojo == 0 && azul == 0 && verde == 0;
        }
        public Color complemento(){
            return new Color(255 - rojo, 255 - verde, 255 - azul);
        }
        public boolean equals(Color c){
            if (c != null){
                return rojo == c.rojo && azul == c.azul && verde == c.verde;
             } else {
                    return false;

            }

        }
        public Color clone(){
            return new Color(rojo,azul,verde);
        }
        public String toString(){
            return rojo + "/" + verde + "/" + azul;
        }


    }


