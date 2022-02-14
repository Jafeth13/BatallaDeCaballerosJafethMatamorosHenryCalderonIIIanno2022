package Main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import ADT.ArrayQueue;
import ADT.ArrayStack;
import ADT.EmptyQueueException;
import ADT.EmptyStackException;
import ADT.FullQueueException;
import ADT.FullStackException;
import Domain.Carta;
import Domain.Jugador;
import Domain.JugadorPartida;
import GUI.JPAreaDibujo;
import GUI.VentanaRegistro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jframe=new JFrame();
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(new JPAreaDibujo());
		jframe.pack();
		jframe.setVisible(true);
		Carta c=new Carta(15, 0);
		Carta d=new Carta(0, 8);
		Carta d1=new Carta(0, 10);
//		JugadorPartida j=new JugadorPartida(new Jugador("d", null), 100, null);
//		System.out.println(f.ataca(c, j));
//		System.out.println(f.Escudo(d, c));
//		System.out.println(f.RecargarVida(d1, j));
//		
//		Carta j2=new Carta(f.recargarEnergia(c), 0);
//		System.out.println(f.ataca(j2, j));
		
		System.out.println("Prueba");
		
	}

}
