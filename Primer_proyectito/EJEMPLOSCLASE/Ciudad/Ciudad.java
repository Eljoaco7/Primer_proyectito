package EJEMPLOSCLASE.Ciudad;

public class Ciudad {

    // Atributos de instancia
    private int cp;
    private int poblacion;
    private double superficie;

    // Constructores
    public Ciudad(int cod) {
        this.cp = cod;
        this.poblacion = 0;
        this.superficie = 0;
    }

    public Ciudad(int cod, int p, double s) {
        this.cp = cod;
        this.poblacion = p;
        this.superficie = s;
    }

    // Comandos
    public void establecerPoblacion(int pob) {
        this.poblacion = pob;
    }

    public void establecerSuperficie(double sup) {
        this.superficie = sup;
    }

    public void actualizarPoblacion(int cre) {
        // cre es el crecimiento: se suma a la población actual
        this.poblacion = this.poblacion + cre;
    }

    // Consultas
    public int obtenerCP() {
        return this.cp;
    }

    public int obtenerPoblacion() {
        return this.poblacion;
    }

    public double obtenerSuperficie() {
        return this.superficie;
    }

    public double obtenerDensidad() {
        double dens = 0;
        if (this.superficie > 0) {
            dens = this.poblacion / this.superficie;
        }
        return dens;
    }

    public String toString() {
        return "Ciudad CP: " + this.cp
             + " - Población: " + this.poblacion
             + " - Superficie: " + this.superficie;
    }

    public boolean equals(Ciudad c) {
        // Dos ciudades son iguales si tienen el mismo código postal
        return this.cp == c.obtenerCP();
    }

    public boolean mayor(Ciudad c) {
        // Verdadero si el cp de quien recibe el mensaje es mayor que el del parámetro
        return this.cp > c.obtenerCP();
    }
}
