package GUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Business.JugadorBusiness;
import Domain.Jugador;

public class VentanaRegistro extends JFrame implements ActionListener{

	private JLabel jlblTitle;
	private JLabel jlblUser;
	private JLabel jlblPassword;
	private JLabel jlblCorrect;
	private JLabel jlblFail;
	
	private JTextField jtfUser;
	private JTextField jtfPassword;
	
	private JButton jbtRegister;
	private JButton jbtBack;
	
	public VentanaRegistro() {
		this.setLayout(null);
		this.setSize(500, 450);
		this.setTitle("Registro de Jugadores");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		init();
	}//constructor
	
	private void init() {
		this.jlblTitle = new JLabel("Registro de Jugadores");
		this.jlblTitle.setBounds(140,20,300,40);
		this.jlblTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		this.add(jlblTitle);
		
		this.jlblUser = new JLabel("Ingrese un nombre de usuario: ");
		this.jlblUser.setBounds(20,60,300,40);
		this.jlblUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.add(jlblUser);
		
		this.jtfUser = new JTextField();
		this.jtfUser.setBounds(20, 110, 300, 35);
		this.jtfUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.add(jtfUser);
		
		this.jlblPassword = new JLabel("Ingrese una contraseña: ");
		this.jlblPassword.setBounds(20,150,300,40);
		this.jlblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.add(jlblPassword);
		
		this.jtfPassword = new JTextField();
		this.jtfPassword.setBounds(20, 200, 300, 35);
		this.jtfPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.add(jtfPassword);
		
		this.jbtRegister = new JButton("Registrar");
		this.jbtRegister.setBounds(350, 350, 115, 30);
		this.jbtRegister.addActionListener(this);
		this.jbtRegister.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.add(jbtRegister);
		
		this.jbtBack = new JButton("Atrás");
		this.jbtBack.setBounds(20, 350, 115, 30);
		this.jbtBack.addActionListener(this);
		this.jbtBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.add(jbtBack);
		
		this.jlblCorrect= new JLabel("¡Registro Completado!");
		this.jlblCorrect.setBounds(140,270,300,40);
		this.jlblCorrect.setFont(new Font("Tahoma", Font.BOLD, 20));
		this.jlblCorrect.setVisible(false);
		this.add(jlblCorrect);
		
		this.jlblFail= new JLabel("¡Nombre de Usuario Utilizado!");
		this.jlblFail.setBounds(100,270,350,40);
		this.jlblFail.setFont(new Font("Tahoma", Font.BOLD, 20));
		this.jlblFail.setVisible(false);
		this.add(jlblFail);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.jbtRegister) {
			JugadorBusiness jB = new JugadorBusiness();
			
			try {
				boolean bandera = jB.registrarJugador(new Jugador(jtfUser.getText(), jtfPassword.getText()));
				if(bandera == false) {
					this.jlblFail.setVisible(true);
					this.jlblCorrect.setVisible(false);
				}else {
					this.jlblCorrect.setVisible(true);
					this.jlblFail.setVisible(false);
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}else if(e.getSource()==this.jbtBack){
			this.setVisible(false);
		}
	}

}
