package Domain;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Dado {
	private BufferedImage imagenActual;
	private BufferedImage imagenes[];
	private int posX;
	private int posY;
	private int i;

	
	public Dado(int posX, int posY) {
		this.posX=posX;
		this.posY=posY;
		this.i=0;
	
		this.imagenes=new BufferedImage[6];
		try {
			int dado1 = (int)(Math.random()*6)+1;
			
			if(dado1==1) {
		this.imagenes[0]=ImageIO.read(getClass().getResourceAsStream("/assets/1.png"));
			}
			else if(dado1==2) {
				this.imagenes[1]=ImageIO.read(getClass().getResourceAsStream("/assets/2.png"));
			}else if(dado1==3) {
				this.imagenes[1]=ImageIO.read(getClass().getResourceAsStream("/assets/3.png"));
			}else if(dado1==4) {
				this.imagenes[1]=ImageIO.read(getClass().getResourceAsStream("/assets/4.png"));
			}
			else if(dado1==5) {
				this.imagenes[1]=ImageIO.read(getClass().getResourceAsStream("/assets/5.png"));
			}
			else if(dado1==6) {
				this.imagenes[1]=ImageIO.read(getClass().getResourceAsStream("/assets/6.png"));
			}
			;
			this.imagenes[1]=ImageIO.read(getClass().getResourceAsStream("/assets/2.png"));
			this.imagenes[2]=ImageIO.read(getClass().getResourceAsStream("/assets/3.png"));
			this.imagenes[3]=ImageIO.read(getClass().getResourceAsStream("/assets/4.png"));
			this.imagenes[4]=ImageIO.read(getClass().getResourceAsStream("/assets/5.png"));
			this.imagenes[5]=ImageIO.read(getClass().getResourceAsStream("/assets/6.png"));
			this.imagenActual=this.imagenes[0];
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // constructor
	
	public void dibujar(Graphics g) {
		//g.drawImage(this.imagenActual, this.posX, this.posY, null);
		g.drawImage(this.imagenActual, this.posX, this.posY, 
				this.imagenActual.getWidth(), this.imagenActual.getHeight(), null);
	}//dibujar
	
	public void actualizar() {
		int dado1 = (int)(Math.random()*6)+1;
		//int dado2 = (int)(Math.random()*6)+1;
		if(dado1==1) {
			imagenActual=imagenes[0];
		}
		else if(dado1==2) {
			imagenActual=imagenes[1];
		}else if(dado1==3) {
			imagenActual=imagenes[2];
		}else if(dado1==4) {
			imagenActual=imagenes[3];
		}
		else if(dado1==5) {
			imagenActual=imagenes[4];
		}
		else if(dado1==6) {
			imagenActual=imagenes[5];
		}
	}
}
