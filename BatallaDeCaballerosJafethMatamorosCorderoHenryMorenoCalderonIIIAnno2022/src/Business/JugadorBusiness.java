package Business;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import Data.JugadorData;
import Domain.Jugador;

public class JugadorBusiness {

private JugadorData jugadorData;
	
	public JugadorBusiness() {
		this.jugadorData = new JugadorData();
	}//constructor
	
	public boolean registrarJugador(Jugador player) throws IOException {
		
	    File fileAddress = new File("usuarios.txt");
	    FileReader fr = new FileReader (fileAddress);
	    BufferedReader br = new BufferedReader(fr);
	    
	    //Valida que no haya algun usuario con el mismo nombre
	    String registerFile = br.readLine();   
	    
	    while(registerFile!=null){      
	    	
	    	StringTokenizer sT = new StringTokenizer(registerFile, "*");
	    	
	    	if(player.getUsername().equals(sT.nextToken()))
	    		return false;
	    	
	    	registerFile = br.readLine();
	    }  
		br.close();
		
	    return this.jugadorData.registrarJugador(player);
	}
	
}
