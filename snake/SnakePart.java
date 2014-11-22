package snake;

public class SnakePart {
	private int posX;
	private int posY;
	public SnakePart(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
}
