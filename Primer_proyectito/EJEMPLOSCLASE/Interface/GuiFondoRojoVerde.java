package EJEMPLOSCLASE.Interface;

// importo los paquetees que necesito
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class GuiFondoRojoVerde extends JFrame {
    
    // atributos de instancia graficos
     private JButton botonRojo, botonVerde;
      // ...

    public GuiFondoRojoVerde(){
        // Establecer los valores de los atributos del frame
        setLayout(new FlowLayout());
        setSize(1920, 1080);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Crear los botones
        botonRojo = new JButton("Rojo");
        botonVerde = new JButton("Verde");

        // Crear y registrar los oyentes para los botones
        OyenteBotonR ponerRojo = new OyenteBotonR();
        botonRojo.addActionListener(ponerRojo);
        OyenteBotonV ponerVerde = new OyenteBotonV();
        botonVerde.addActionListener(ponerVerde);

        // Insertar los botones en el panel de contenido
        getContentPane().add(botonRojo);
        getContentPane().add(botonVerde);

    }
    
    // Definir clases para establecer el comportamiento de los botones

    class OyenteBotonR implements ActionListener {
        public void actionPerformed (ActionEvent event){
            getContentPane().setBackground(Color.red);
        }
    }

    class OyenteBotonV implements ActionListener {
        public void actionPerformed (ActionEvent event){
            getContentPane().setBackground(Color.green);
        }
    }


}
