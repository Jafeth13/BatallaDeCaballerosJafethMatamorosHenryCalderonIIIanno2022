package Domain;

import ADT.ArrayStack;

public class Mazo {
	
	private ArrayStack pilaMazo;

	public Mazo(ArrayStack pilaMazo) {
		
		this.pilaMazo = pilaMazo;
	}

	public ArrayStack getPilaMazo() {
		return pilaMazo;
	}

	public void setPilaMazo(ArrayStack pilaMazo) {
		this.pilaMazo = pilaMazo;
	}
	
}
