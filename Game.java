package snake;

import java.util.Vector;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Game extends KeyAdapter {
	private Vector<GameElement> gameElements;
	private GUI gui;
	private String pressedKey = "right";
	
	Game(Vector<GameElement> gameElements) {
		this.gui = new GUI(this);
		this.gameElements = gameElements;
		this.gameElements.add(new Borders(0, 0, this.gui.getWidth(), this.gui.getHeight()));
	}
	
	public void addElement(GameElement gameElement) {
		this.gameElements.add(gameElement);
	}
	
	public void draw(Graphics g) {
		for(GameElement e : this.gameElements) {
			e.draw(g);
		}
	}
	
	public void keyPressed(KeyEvent e) {
		  if(e.getKeyChar() == 'w') {
			  this.pressedKey = "up";
		  } else if(e.getKeyChar() == 'a') {
			  this.pressedKey = "left";
		  } else if (e.getKeyChar() == 's') {
			  this.pressedKey = "down";
		  } else if (e.getKeyChar() == 'd') {
			  this.pressedKey = "right";
		  }
	  }
	  
	  private String getPressedKey() {
		  return this.pressedKey;
	  }
	
	public static void main(String[] args) {
		Vector<GameElement> gameElements = new Vector();
		
		Diamond dia = new Diamond(8, 9, Zufallsgenerator.zufallszahl(1, 10));
		Snake snake = new Snake(1, 1, 1, 1, 3, 50 , "right", true, new SnakePart(1,1));
		
		gameElements.add(dia);
		gameElements.add(snake);
		
		Game game = new Game(gameElements);
		
		while (snake.getAlive()) {
			try {
				Thread.sleep(snake.getSpeed());
				snake.move(game.getPressedKey());
				game.gui.repaint();
			} catch(InterruptedException e) {}
		}
	}
}


