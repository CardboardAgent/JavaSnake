package snake;

import java.awt.Graphics;

public abstract class GameElement {
	final int FIELDSIZE = 25;
	protected int xPosition;
	protected int yPosition;
	
	/**
	 * Creates a GameElement-Object
	 * @param x int X-Position of the GameElement
	 * @param y int Y-Position of the GameElement
	 */
	public GameElement(int x, int y) {
		this.xPosition = x * this.FIELDSIZE;
		this.yPosition = y * this.FIELDSIZE;
	}
	
	/**
	 * To draw the GameElement
	 * @param g Graphics Java Graphics-Object
	 */
	public abstract void draw(Graphics g);
}
