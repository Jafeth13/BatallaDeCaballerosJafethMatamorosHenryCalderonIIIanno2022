	package Domain;
	
	public class JugadorPartida {
	
	private Jugador jugador;
	private int vida;
	private Mazo mazo;
	
	public JugadorPartida(Jugador jugador, int vida, Mazo mazo) {
		this.jugador = jugador;
		this.vida = vida;
		this.mazo = mazo;
	}
	
	public String getJugador() {
		return jugador.getUsername();
	}
	
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	public Mazo getMazo() {
		return mazo;
	}
	public void setMazo(Mazo mazo) {
		this.mazo = mazo;
	}
	@Override
	public String toString() {
		return "jugadorPartida [jugador=" + jugador.getUsername() + ", vida=" + vida + ", mazo=" + mazo + "]";
	}




}
