/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombre;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
/**
 *
 * @author kmeng
 */
public class Nombre extends JFrame{
    
    	JButton regresar;
	JPanel panelJuegonuevo;
        JPanel panelMostrar;
	JLabel jlabel3;
        JLabel mostrarTexto;
	JTextField textfield1;
	JFrame jframe;
	JButton jugar1;
	final JFrame panelBienvenida;
        
        public Nombre(JFrame panelB){
		panelBienvenida = panelB;
		panelBienvenida.setVisible(false);
		jlabel3 = new JLabel();
		Font f = new Font( "Microsoft PhagsPa",Font.ITALIC,20 );
		jlabel3.setText("Datos del estudiante:");
		jlabel3.setFont(f);
		jlabel3.setBounds(10,30,220,40);

		textfield1=new JTextField();
                textfield1.setBounds(75,100,250,50);



 	    jugar1 = new JButton();
		jugar1.setText("Enviar");	
		jugar1.setBounds(150,250,100,40);
		jugar1.setBackground(Color.white);

		jugar1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                
                mostrarTexto = new JLabel();
                mostrarTexto.setText("el estudiante ");  
		mostrarTexto.setBounds(100,300,2200,40);}

                    
        });

        regresar = new JButton();
		regresar.setText("Regresar");
		regresar.setBounds(150,300,100,40);
		regresar.setBackground(Color.white);

		regresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	panelJuegonuevo.setVisible(false);
            	panelBienvenida.setVisible(true);
            	
            	

            	   }
        });


                panelJuegonuevo= new JPanel();
		panelJuegonuevo.setLayout(null);
		panelJuegonuevo.add(jlabel3);
		panelJuegonuevo.add(textfield1);
		panelJuegonuevo.add(jugar1);
		panelJuegonuevo.add(regresar);
		panelJuegonuevo.setBackground(new Color(125,18,231));
		add(panelJuegonuevo);
		setSize(400,500);
		setVisible(true);
		setTitle("Juego Nuevo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
        
}
