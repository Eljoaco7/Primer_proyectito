package TP9.Ej_7;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;



public class MiBoton extends JButton {



    public MiBoton(String texto){
        super(texto);
        setPreferredSize(new Dimension(150, 50));
        setSize(150, 50);  // Esta esta medio al pedo en realidad
        setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.GREEN, 3, false),null));
        setBackground(Color.BLUE);
        setOpaque(true);
    }

    
}
