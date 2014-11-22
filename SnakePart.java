package snake;

import java.awt.Graphics;

public class SnakePart extends GameElement {

	public SnakePart(int posX, int posY) {
		super(posX, posY);
	}
	
	public int getPosX() {
		return this.xPosition;
	}
	
	public int getPosY() {
		return this.yPosition;
	}

	@Override
	public void draw(Graphics g) {}
}
