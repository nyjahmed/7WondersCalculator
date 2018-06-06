package wondersDuelCalc;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class WondersDuelCalc {

	public static WondersDuelCalc wDuelCalc;
	
	public final int HEIGHT = 800;
    public final int WIDTH = 800;
    
	public Renderer renderer;
	
	public WondersDuelCalc()
	{
		JFrame jF = new JFrame();
		
		renderer = new Renderer();
		jF.add(renderer);
		
		jF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminates program when user x out
		jF.setSize(WIDTH, HEIGHT); 
		jF.setResizable(false); //user can't change size of window
		jF.setVisible(true); 
	}
	
	public void repaint(Graphics g)
	{
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, WIDTH, HEIGHT);
	}
	
	public static void main(String[] args)
	{
		wDuelCalc = new WondersDuelCalc();
	}
}
