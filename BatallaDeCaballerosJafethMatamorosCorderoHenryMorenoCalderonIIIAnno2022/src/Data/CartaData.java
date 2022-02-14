package Data;

import Domain.Carta;
import Domain.JugadorPartida;

public class CartaData {

	public int ataca(Carta a,JugadorPartida b){
        int vida;
        vida=b.getVida()-a.getAtacar();
        if(vida<0){
            vida=0;
        }
        return vida;
    }
    
        public int RecargarVida(Carta a,JugadorPartida b){
        int vida;
        if(b.getVida()==100) {
        	return 100;
        }else if(b.getVida()==0){
        	return 0;
        }
        vida=b.getVida()+a.getDefender();
     
        return vida;
        }
        
        public int Escudo(Carta a,Carta b){
            int ataque;
            ataque=b.getAtacar()-a.getDefender();
            if(ataque<0){
            	ataque=0;
            }
            return ataque;
            }
        
        
        public int recargarEnergia(Carta a){
        int atac;
        atac=(a.getAtacar()*25/100)+a.getAtacar();        
        return atac;
    }
}
