package snake;

import java.awt.Graphics;

public class Borders extends GameElement {
	private int xSize;
	private int ySize;
	
	/**
	 * 
	 * @param x int X-Position of Border
	 * @param y int Y-Position of Border
	 * @param w int width of Border
	 */
	public Borders(int x, int y, int xSize, int ySize) {
		super(x, y);
		this.xSize = xSize * super.FIELDSIZE;
		this.ySize = ySize * super.FIELDSIZE;
	}
	
	/**
	 * draws the Border
	 * @param g Graphics The Java Graphics-Object
	 */
	public void draw(Graphics g) {
		g.drawRect(this.xPosition, this.yPosition, this.xSize, this.ySize);
	}
	
	public void move(String direction) {}
	
}
