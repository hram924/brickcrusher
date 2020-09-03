import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	public Paddle() {
		setWidth(Settings.PADDLE_WIDTH);					
		setHeight(Settings.PADDLE_HEIGHT);					
		resetPosition();									
		
	}
	
	public void resetPosition() {
		
		x = (Settings.INITIAL_PADDLE_X);					
		y = (Settings.INITIAL_PADDLE_Y);					
	}
	
	public void update() {
		x += xVelocity;
		
		if (x <=0) {
			x = 0;
		}
		if (x >= Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH) {
			x = Settings.WINDOW_WIDTH - Settings.PADDLE_WIDTH;
			
			
		}
		
		

	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	
	public void setXVelocity(int vel) {
		this.xVelocity = vel;							
		
	}
}
