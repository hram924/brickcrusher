import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	 

	public Breakout() {
		
		

		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);	
		setTitle(Settings.WINDOW_NAME);							
		getContentPane().setBackground(Color.WHITE);			
		setResizable(false);									
		setVisible(true);																				
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new BreakoutPanel(this);
        add(panel);
	}





	public static void main(String[] args) {
		new Breakout();	
		
	}

}
