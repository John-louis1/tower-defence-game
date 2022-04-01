package engine;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GameScreen extends JPanel{
	// attributes 
	private BufferedImage img;
	private ArrayList<BufferedImage> sprites = new ArrayList<>();
	
	// constructors
	public GameScreen(BufferedImage img) {
		this.img = img;
		loadSprites();
		System.out.println(sprites.size());

	}
	
	// methods	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				g.drawImage(sprites.get((int)(Math.random()*100)), i*32, j*32, null);
				
			}
		}
	}
	
	private void loadSprites() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				sprites.add(img.getSubimage(i*32, j*32, 32, 32));
			}
		}
	}
}


