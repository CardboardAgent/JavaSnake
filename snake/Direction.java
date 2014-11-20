package snake;
/**
 * thought I could use enum to check if the snake is trying to eat it self but
 * it seems like I can't figure out how to set that up right...
 * @author vmadmin
 *
 */
public enum Direction {
	LEFT,
	RIGHT,
	UP,
	DOWN;
	
	private static Direction opposite;
	
	static {
		LEFT.opposite = RIGHT;
		RIGHT.opposite = LEFT;
		UP.opposite = DOWN;
		DOWN.opposite = UP;
	}
	
	public static Direction getOpposite() {
		System.out.println(opposite);
		return opposite;
	}

	public static void setOpposite(Direction opposite) {
		Direction.opposite = opposite;
	}
}
