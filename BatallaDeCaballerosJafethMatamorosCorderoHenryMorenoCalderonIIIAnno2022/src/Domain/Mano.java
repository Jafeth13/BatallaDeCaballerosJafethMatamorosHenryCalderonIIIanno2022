package Domain;

import ADT.SimpleList;

public class Mano {

	private SimpleList listaMano;

	public Mano(SimpleList listaMano) {
		
		this.listaMano = listaMano;
	}

	public SimpleList getListaMano() {
		return listaMano;
	}

	public void setListaMano(SimpleList listaMano) {
		this.listaMano = listaMano;
	}
	
	
}
