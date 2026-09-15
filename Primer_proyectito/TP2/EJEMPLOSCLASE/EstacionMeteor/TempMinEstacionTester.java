package EJEMPLOSCLASE.EstacionMeteor;

public class TempMinEstacionTester {
    public static void main(String[] args) {
        TempMinEstacion t = new TempMinEstacion(7);           // t es una variable de tipo TempMinEStacion, no un arreglo
        t.establecerTempMin(1, 15);

        float x = t.obtenerTempMin(5);
    }
    
}

