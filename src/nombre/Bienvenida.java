
package nombre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.Image;


/**
 *
 * @author 201413473
 */
public class Bienvenida extends JFrame{
JPanel panelBienvenida;
JLabel nombreLabel;
JButton boton;
JButton score;

    public Bienvenida(){
    ImageIcon fondo = new ImageIcon(getClass().getResource("/imagenes/photo.jpg"));
            nombreLabel = new JLabel(fondo);
            nombreLabel.setBounds(0,60,1000,500);

            
            boton = new JButton();
            boton.setText("Soy un boton,presioname");
            boton.setBounds(350, 400, 400,40);
            boton.setBackground(Color.gray);
            
            
            boton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                setVisible(false);
                new Nombre(Bienvenida.this).setVisible(true);}
            }); 
            
        panelBienvenida = new JPanel();
        panelBienvenida.setLayout(null);
        panelBienvenida.add(nombreLabel);
        panelBienvenida.add(boton);
        panelBienvenida.setBackground(Color.gray);
        this.add(panelBienvenida);
        this.setSize(1000,800);
        this.setVisible(true);
        this.setTitle("201413473");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

        
        
        
        
    
}
