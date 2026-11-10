package EJEMPLOSCLASE.GUIimport;
import java.awt.Color;

import javax.swing.*;

public class miVentana extends JFrame {

    public miVentana(){
        super("TitulazoDOS");
        setSize(1920, 1080);
        getContentPane().setBackground(Color.RED);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
}
