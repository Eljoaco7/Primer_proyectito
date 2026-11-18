package TP9.Ej_3;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

class Dos_Botones_Grilla extends JFrame {
/*Objetos Gráficos*/
  private MiEtiqueta etiqueta;
  private MiBoton botonPerro,botonGato;
  private JPanel panelControl,panelImagen;
  
  public Dos_Botones_Grilla() {
//Establece los valores de los atributos del frame
     setLayout(new GridLayout(1,2));
     setSize(1920, 1080);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
//Arma los paneles
     armaPanelBotones();
     armaPanelImagen();
//Inserta los paneles en el panel del frame	    
     getContentPane().add(panelControl);
     getContentPane().add(panelImagen);	 
}

private void armaPanelBotones(){

  panelControl = new JPanel();
  panelControl.setBackground(Color.BLUE);
  
  botonPerro = new MiBoton("Perro");
  botonGato = new MiBoton("Gato"); 
  
  
  OyenteBotonP oyentePerro = new OyenteBotonP();
  botonPerro.addActionListener(oyentePerro);
  
  
  
  OyenteBotonG oyenteGato = new OyenteBotonG();
  botonGato.addActionListener(oyenteGato);
  
//Insertar los botones en el panel de control
  panelControl.add(botonPerro);
  panelControl.add(botonGato);

 }
 
private void armaPanelImagen(){
  panelImagen = new JPanel();
  etiqueta = new MiEtiqueta();
  panelImagen.add(etiqueta);
  etiqueta.setIcon(new ImageIcon("TP9/Ej_3/imagenes/perro.gif"));
  etiqueta.setText("Jack");
  panelImagen.add(etiqueta);

}
 
private class OyenteBotonP implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    etiqueta.setIcon(new ImageIcon("TP9/Ej_3/imagenes/perro.gif"));
    etiqueta.setText("Jack");
    
   }  
}
 private class OyenteBotonG implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    etiqueta.setIcon(new ImageIcon("TP9/Ej_3/imagenes/gato.gif"));
    etiqueta.setText("Tom");
    
   }  
 }
}