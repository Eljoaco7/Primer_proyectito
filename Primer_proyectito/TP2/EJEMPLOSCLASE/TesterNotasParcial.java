package EJEMPLOSCLASE;

public class TesterNotasParcial {
    public static void main(String[] args) {
        NotasParcial np = new NotasParcial(10);
        np.establecerNota(80, 4);
        int x = np.obtenerNota(0);
        int cant = np.cantNotas();
        
    }
    
    
}
