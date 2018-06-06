package wondersDuelCalc;

import javax.swing.JPanel;
import java.awt.Graphics;

public class Renderer extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		WondersDuelCalc.wDuelCalc.repaint(g);
	}
}
