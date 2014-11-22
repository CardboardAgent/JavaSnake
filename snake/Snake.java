package snake;

import java.awt.Graphics;
import java.util.Vector;

public class Snake extends GameElement {
	private int size;
	private int speed;
	private int xEndposition;
	private int yEndposition;
	private String heading;
	private boolean isAlive;
	private Vector<SnakePart> body = new Vector<SnakePart>();
	
	/**
	 * Sets the own and super variables
	 * @param x int X-Coordinate
	 * @param y int Y-Coordinate
	 * @param xEnd int X-Endcoordinate
	 * @param yEnd int Y-Endcoordinate
	 * @param size int size of the snake
	 * @param speed int speed of the snake
	 * @param heading String to where snake is headed
	 * @param alive boolean if snake is alive or not
	 */
	public Snake(int x, int y, int xEnd, int yEnd, int size, int speed, String heading, boolean alive, SnakePart head) {
		super(x, y);
		this.size = size * super.FIELDSIZE;
		this.speed = speed * super.FIELDSIZE;
		this.xEndposition = xEnd * super.FIELDSIZE;
		this.yEndposition = yEnd * super.FIELDSIZE;
		this.heading = heading;
		this.isAlive = alive;
		this.body.add(head);
		
		for (int i = 0; i < size; i++) {
			this.body.add(new SnakePart(this.xPosition + i * super.FIELDSIZE, this.yPosition + i * super.FIELDSIZE));
		}
	}
	
	/**
	 * Draws the Snake as a simple line
	 * @param g Graphics-Object
	 */
	public void draw(Graphics g) {
		for (int i = this.body.indexOf(this.body.firstElement()); i < this.body.lastIndexOf(this.body.lastElement()); i++) {
			g.drawRect(this.body.get(i).getPosX(), this.body.get(i).getPosY(), super.FIELDSIZE, super.FIELDSIZE);
		}		
	}
	
	/**
	 * move the snake to the given direction
	 * @param String direction the direction the snake is moving
	 */
	public void move(String direction) {
		if (direction == "down" && this.heading != "up" ) {
			this.body.add(new SnakePart(this.xEndposition, this.yEndposition + 1 * super.FIELDSIZE));
			this.body.remove(this.body.firstElement());
		} else if (direction == "right" && this.heading != "left" ) {
			this.body.add(new SnakePart(this.xEndposition + 1 * super.FIELDSIZE, this.yEndposition));
			this.body.remove(this.body.firstElement());
		} else if (direction == "left" && this.heading != "right") {
			this.body.add(new SnakePart(this.xPosition - 1 * super.FIELDSIZE, this.yEndposition));
			this.body.remove(this.body.firstElement());
		} else if (direction == "up" && this.heading != "up") {
			this.body.add(new SnakePart(this.xEndposition, this.yEndposition - 1 * super.FIELDSIZE));
		} else {
			System.out.println("Should not be possible, Collision!");
		}
	}
	
	/**
	 * Sets the size to the new given size
	 * @param int size new size
	 */
	public void setSize(int size) {
		this.size = size / super.FIELDSIZE;
	}
	
	/**
	 * Sets the private Variable speed to the given speed
	 * @param int speed new Speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed / super.FIELDSIZE;
	}
	
	/**
	 * Returns the value of the private size Variable
	 * @return int value of private size Variable
	 */
	public int getSize() {
		return this.size;
	}
	
	/**
	 * Returns the value of the private speed Variable
	 * @return int value of private speed Variable
	 */
	public int getSpeed() {
		return this.speed;
	}
	
	/**
	 * Returns the boolean value of the private isAlive Variable
	 * @return boolean value of the private isAlive Variable 
	 */
	public boolean getAlive() {
		return this.isAlive;
	}
}
