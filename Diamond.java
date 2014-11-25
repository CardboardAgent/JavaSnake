package snake;

import java.awt.Graphics;

public class Diamond extends GameElement {
	private int value;
	
	public Diamond(int x, int y, int value) {
		super(x, y);
		this.value = value;
	}
	
	public void draw(Graphics g) {
		g.drawOval(this.xPosition, this.yPosition, super.FIELDSIZE, super.FIELDSIZE);
		g.fillOval(this.xPosition, this.yPosition, super.FIELDSIZE, super.FIELDSIZE);
	}
	
	public void move(String direction) {}
	
	
	
}
