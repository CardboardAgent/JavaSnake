package snake;

public class SnakeException extends Exception {
	public SnakeException(String message) {
		super(message);
	}
	public SnakeException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
