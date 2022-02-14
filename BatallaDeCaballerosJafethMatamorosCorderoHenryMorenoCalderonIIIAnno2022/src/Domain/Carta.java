package Domain;

public class Carta {
	
	private int atacar;
	private int defender;

	public Carta(int atacar, int defender) {

		this.atacar = atacar;
		this.defender = defender;
	
	}

	public int getAtacar() {
		return atacar;
	}

	public void setAtacar(int atacar) {
		this.atacar = atacar;
	}

	public int getDefender() {
		return defender;
	}

	public void setDefender(int defender) {
		this.defender = defender;
	}



	@Override
	public String toString() {
		return "carta [atacar=" + atacar + ", defender=" + defender;
	}

	
	
}
