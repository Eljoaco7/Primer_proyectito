package TP9.Ej_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiCafeyJugo extends JFrame {
 /*Atributos de instancia, objetos gráficos y de la aplicación*/
    
 private JButton botonJugo, botonCafe;
 private int cantJugo, cantCafe;
 private JLabel etiqueta, etiquetaJugo, etiquetaCafe;
 private ImageIcon imagenJugo, imagenCafe;

    public GuiCafeyJugo(){
        super("Cafe y jugo");
        cantJugo = 0;
        cantCafe = 0;
        setSize(450, 550);
        getContentPane().setBackground(Color.GRAY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        hacerGUI();
    }
    
    // Implementa las clases oyente
    
    public void hacerGUI(){
        botonJugo = new MiBoton("Jugo");
        OyenteBotonJ jugo = new OyenteBotonJ();
        botonJugo.addActionListener(jugo);

        botonCafe = new MiBoton("Cafe");
        OyenteBotonC cafe = new OyenteBotonC();
        botonCafe.addActionListener(cafe);
        System.out.println(System.getProperty("user.dir"));
        
        imagenJugo = new ImageIcon("imagenes/jugo.gif");
        imagenCafe = new ImageIcon("imagenes/cafe.gif");
         
        
        JPanel panelInferior = new JPanel();
        panelInferior.add(botonJugo);
        panelInferior.add(botonCafe);

        JPanel panelSuperior = new JPanel();
        etiqueta = new JLabel("Elegi una bebida");
        etiqueta.setHorizontalTextPosition(JLabel.CENTER);
        etiqueta.setVerticalTextPosition(JLabel.TOP);
        panelSuperior.add(etiqueta);

        JPanel panelCentral = new JPanel();
        panelCentral.setBackground(Color.WHITE);
        panelCentral.setLayout(new GridLayout(2, 1));
        etiquetaCafe = new JLabel();
        etiquetaJugo = new JLabel();
        panelCentral.add(etiquetaCafe);
        panelCentral.add(etiquetaJugo);



        getContentPane().add(panelSuperior, BorderLayout.NORTH);
        getContentPane().add(panelCentral, BorderLayout.CENTER);
        getContentPane().add(panelInferior, BorderLayout.SOUTH);

        etiquetaCafe.setHorizontalAlignment(JLabel.CENTER);
        etiquetaJugo.setHorizontalAlignment(JLabel.CENTER);
        

    }

    private class OyenteBotonJ implements ActionListener{
        public void actionPerformed(ActionEvent e){
            cantJugo++;
            etiqueta.setIcon(imagenJugo);
            etiqueta.setText("Jugo");
            etiquetaJugo.setText("Jugos vendidos = " + cantJugo);
            actualizarBotones();

        }
    }

    private class OyenteBotonC implements ActionListener{
        public void actionPerformed(ActionEvent e){
            cantCafe++;
            etiqueta.setIcon(imagenCafe);
            etiqueta.setText("Cafe");
            etiquetaCafe.setText("Cafes Vendidos = " + cantCafe);
            actualizarBotones();
        }
    }

    private void actualizarBotones(){
        botonCafe.setEnabled(cantCafe < 10);
        botonJugo.setEnabled(cantJugo < 10);
    }


    
}
