package engine;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GameScreen extends JPanel{
	// attributes 
	
	// constructors
	public GameScreen() {
		
	}
	
	// methods	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				g.setColor(getRandomColor());
				g.fillRect(i*32, j*32, 32, 32);
			}
		}	
	}
	
	private Color getRandomColor() {
		int r = (int) (Math.random() * 256);
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		return new Color(r,g,b);
	}
}


