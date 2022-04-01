package engine;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Game extends JFrame{
	// attributes
	private GameScreen screen;
	private BufferedImage img;
	
	// constructors
	public Game() {
		importImg();
		
		setSize(640,640);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		screen = new GameScreen(img);
		add(screen);
		setVisible(true);

		
	}

	// methods
	public static void main (String [] args) throws Exception{
		Game game = new Game();
	}
	
	private void importImg() { // imports the image containing sprites 
		InputStream is = getClass().getResourceAsStream("/spriteatlas.png");
		try {
			img = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

