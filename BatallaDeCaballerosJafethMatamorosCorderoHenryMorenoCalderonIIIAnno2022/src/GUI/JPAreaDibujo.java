package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Timer;

import Util.Utility;




public class JPAreaDibujo extends JPanel implements ActionListener{
	
	private JPasswordField  textfield1;private JTextField textfield2;
	private Timer timer;private JComboBox<String> combo1;
	JLabel j=new JLabel();JLabel j2=new JLabel();JLabel j3=new JLabel();
	private void init () {
		JLabel eti = new JLabel();
	    eti.setText("Usuario: ");
	    eti.setBounds(25, 75, 500, 40);
	    eti.setForeground(Color.black);
	    eti.setFont(new Font("Tahoma", Font.BOLD, 20));
	    
	    JLabel eti2 = new JLabel();
	    eti2.setText("Contraseña: ");
	    eti2.setBounds(25, 125, 300, 40);
	    eti2.setForeground(Color.black);
	    eti2.setFont(new Font("Tahoma", Font.BOLD, 20));
	    
	    JLabel eti3 = new JLabel();
	    eti3.setText("Clase: ");
	    eti3.setBounds(25, 25, 300, 40);
	    eti3.setFont(new Font("Tahoma", Font.BOLD, 20));
	    eti3.setForeground(Color.black);
	    
	    
	    textfield1=new JPasswordField ();
        textfield1.setBounds(150, 125, 150, 25);
        
        textfield2=new JTextField();
        textfield2.setBounds(150, 75, 150, 25);
        
         j.setBounds(150, 150, 300, 300);j2.setBounds(300, 150, 300, 300);
         j3.setBounds(150, 300, 500, 300);
        JButton bi = new JButton("Ingresar");
        bi.setBounds(150, 175, 150, 40);
        bi.setFont(new Font("Tahoma", Font.PLAIN, 18));
        bi.addActionListener(new ActionListener() {
       
			@Override
			public void actionPerformed(ActionEvent e) {
			tiroDados();				
			}
		});
        
        JButton btnRegistrar = new JButton("Registrarse");
        btnRegistrar.setBounds(600, 500, 150, 40);
        btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnRegistrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				VentanaRegistro vR= new VentanaRegistro();
				vR.setVisible(true);
			}
		});
       
        
    	combo1 = new JComboBox<String>();
		combo1.addItem("Caballero");
		combo1.addItem("Mago");
		combo1.addItem("Rey");
		combo1.addItem("Principe");
		combo1.setBounds(150, 25, 150, 20);
		
		 JLabel eti4 = new JLabel();
		    eti4.setText("Fight Of Champions ");
		    eti4.setBounds(25, 400, 500, 300);
		    eti4.setFont(new Font("Tahoma", Font.BOLD, 30));
		    eti4.setForeground(Color.red);
		
        this.add(combo1);
        this.add(bi);
	    this.add(eti);
	    this.add(eti2);
	    this.add(eti3);
	    this.add(textfield1);
	    this.add(textfield2);
	    this.add(j);
	    this.add(j2);
	    this.add(j3);
	    this.add(btnRegistrar);
	    this.add(eti4);

	}
	private Image fondo;

	public JPAreaDibujo() {
	
//		this.timer=new Timer(150, this);
//		this.timer.start();
	    
		this.setPreferredSize(new Dimension(800, 600));
		this.setLayout(null);
		init();
	} // fin clase
	
	public void paintComponent(Graphics g) {
	  ImageIcon imagem=new ImageIcon(getClass().getResource("/assets/a.jpg"));
	  g.drawImage(imagem.getImage(), 0, 0, getWidth(), getHeight(),this);
     setOpaque(false);
      super.paintComponent(g);
		g.setColor(Color.white);
		
		//g.fillRect(0, 0, 800, 600);	
		init();
	} // paintComponent

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	} // actionPerformed
	

	public void tiroDados() {
		int dado1 = (int)(Math.random()*6)+1;
		int dado2 = (int)(Math.random()*6)+1;
		if(dado1==1) {
			j.setIcon(new ImageIcon(getClass().getResource("/assets/1.png")));
		}
		else if(dado1==2) {
			j.setIcon(new ImageIcon(getClass().getResource("/assets/2.png")));
		}else if(dado1==3) {
			j.setIcon(new ImageIcon(getClass().getResource("/assets/3.png")));
		}else if(dado1==4) {
			j.setIcon(new ImageIcon(getClass().getResource("/assets/4.png")));
		}
		else if(dado1==5) {
			j.setIcon(new ImageIcon(getClass().getResource("/assets/5.png")));
		}
		else if(dado1==6) {
			j.setIcon(new ImageIcon(getClass().getResource("/assets/6.png")));
		}
		
		if(dado2==1) {
			j2.setIcon(new ImageIcon(getClass().getResource("/assets/1.png")));
		}
		else if(dado2==2) {
			j2.setIcon(new ImageIcon(getClass().getResource("/assets/2.png")));
		}else if(dado2==3) {
			j2.setIcon(new ImageIcon(getClass().getResource("/assets/3.png")));
		}else if(dado2==4) {
			j2.setIcon(new ImageIcon(getClass().getResource("/assets/4.png")));
		}
		else if(dado2==5) {
			j2.setIcon(new ImageIcon(getClass().getResource("/assets/5.png")));
		}
		else if(dado2==6) {
			j2.setIcon(new ImageIcon(getClass().getResource("/assets/6.png")));
		}
		
		if(dado1<dado2) {
			j3.setText("comienza el jugador 2");
		}else if (dado1>dado2) {
			j3.setText("comienza el jugador 1");
		}else {
			j3.setText("Salio igual van de nuevo");
		}
		j3.setFont(new Font("Tahoma", Font.BOLD, 15));
	    j3.setForeground(Color.red);
		
	}
	
} // fin clase
