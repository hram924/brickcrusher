import java.awt.Graphics;

public class Brick extends Sprite {
	
	private boolean broken = false;
	
	public Brick(int x, int y) {
		this.x = x;										
		this.y = y;										
		
		setWidth(Settings.BRICK_WIDTH);					
		setHeight(Settings.BRICK_HEIGHT);		
		
	}
	
	public boolean isBroken() {
		return broken;									
	}
	public void setBroken(boolean b) {
		
		broken = b;										
	}
	
	public void paint(Graphics g) {
		if(!broken) {
			g.fillRect(x, y, Settings.BRICK_WIDTH, Settings.BRICK_HEIGHT);
		}
	}
}
