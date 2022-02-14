package Data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Domain.Jugador;


public class JugadorData {

	public JugadorData() {
	}
	
	public boolean registrarJugador(Jugador player) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("usuarios.txt",true));
		File f = new File("usuarios.txt");
		if(f.length()!=0)
			bw.newLine();
		bw.write(player.getUsername()+"*"+player.getPassword());
		//vacia el buffer
		bw.flush();
		bw.close();
		
		return true;
	}
	
}
