import java.awt.Graphics;

public class Ball extends Sprite {

	private int xVelocity = 1, yVelocity = -1;
	
	public Ball() {
		setWidth (Settings.BALL_WIDTH);
		setHeight (Settings.BALL_HEIGHT);
		resetPosition();
		
	}
	
	/**
	 * Resets the ball to the initial position
	 * Uses Settings.INITIAL_BALL_X/Y to set the position of the ball
	 */

	public void resetPosition() {
		x = (Settings.INITIAL_BALL_X);
		
		y = (Settings.INITIAL_BALL_Y);
		
	}
	
	public void update() {
		x += xVelocity;
		y += yVelocity;
		
		// Bounce off left side of screen
		if(x <= 0) {
			x=0;
			setXVelocity(1);
		}
		
		if(x >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH) {
			setXVelocity(-1);

		}
		

		if(y <= 0) {
			y=0;
			setYVelocity(1);
			
		}
		
	}
	
	public void setXVelocity(int x) {
		xVelocity=x;
	}
	public void setYVelocity(int y) {
		yVelocity=y;

	}
	
	public int getXVelocity() {
		return x;	
	}
	public int getYVelocity() {
		return y;
	}
	
	public void paint(Graphics g) {
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
