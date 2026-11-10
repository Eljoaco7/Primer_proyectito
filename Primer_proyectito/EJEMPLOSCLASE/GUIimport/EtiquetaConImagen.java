package EJEMPLOSCLASE.GUIimport;
import javax.swing.*;

public class EtiquetaConImagen extends JFrame {

    private JLabel etiquetaBanda;

    public EtiquetaConImagen(String tit){
        super(tit);
        setSize(1920, 1080);
        etiquetaBanda = new JLabel("Los piojos");
        etiquetaBanda.setIcon(new ImageIcon("C:/Users/cRONOS/Desktop/fotos celu/IMG_20231015_112351818.jpg"));
        getContentPane().add(etiquetaBanda);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
}
