package apresentacao;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel {
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		// Sol
		g.setColor(Color.YELLOW);
		g.fillOval(630, 50, 100, 100);
		
		//Parede Frente
		g.setColor(Color.BLACK);
		g.drawLine(100, 300, 100, 500);
		g.drawLine(100, 500, 250, 500);
		g.drawLine(250, 300, 250, 500);

		//Telhado Frente
		g.drawLine(100, 300, 175, 200);
		g.drawLine(175, 200, 250, 300);
		
		//Parede Lado
		g.drawLine(250, 500, 550, 400);
		g.drawLine(550, 400, 550, 200);
		g.drawLine(250, 300, 550, 200);

	
		//Telhado Lado
		g.drawLine(175, 200, 450, 125);
		g.drawLine(450, 125, 550, 200);
		
		//Cabeça
		g.fillOval(650, 350, 30, 30);
		
		//Corpo
		g.drawLine(665, 350, 665, 430);
		
		//Perna Esquerda
		g.drawLine(665, 430, 685, 460);
		
		//Perna Direita
		g.drawLine(665, 430, 645, 460);
		
		//Braços
		g.drawLine(655, 375, 675, 375);






		
		
		
	}
}
