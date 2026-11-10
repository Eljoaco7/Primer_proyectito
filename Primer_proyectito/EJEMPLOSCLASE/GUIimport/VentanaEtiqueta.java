package EJEMPLOSCLASE.GUIimport;
import javax.swing.*;

public class VentanaEtiqueta extends JFrame {
    // Atributos de instancia graficos
    
    private JLabel etiqueta;
    
    // Constructor

    public VentanaEtiqueta(){
        setSize(100, 120);
        etiqueta = new JLabel("Hola");
        getContentPane().add(etiqueta);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
