package wondersDuelCalc;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class WondersDuelCalc {

	public static WondersDuelCalc wDuelCalc;
	
	public final int HEIGHT = 1000;
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
		//background color of calculator is white
		g.setColor(new Color(220, 220, 220));
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		//lines for names
		g.setColor(Color.BLACK);
		g.drawLine(200, 75, 400, 75);
		g.drawLine(500, 75, 700, 75);
		
		//black outline for colored boxes
		g.setColor(Color.BLACK);
		g.fillRect(475, 100, 250, 725);
		g.fillRect(175, 100, 250, 725);
		
		//blue colored box for civilian building victory points
		g.setColor(new Color(125, 240, 250));
		g.fillRect(200, 125, 200, 50);
		g.fillRect(500, 125, 200, 50);
		
		//light green colored box for science victory points
		g.setColor(new Color(155, 255, 180));
		g.fillRect(200, 200, 200, 50);
		g.fillRect(500, 200, 200, 50);
		
		//mustard colored box for commercial building victory points
		g.setColor(new Color(250, 210, 85));
		g.fillRect(200, 275, 200, 50);
		g.fillRect(500, 275, 200, 50);
		
		//purple colored box for guild victory points
		g.setColor(new Color(200, 80, 240));
		g.fillRect(200, 350, 200, 50);
		g.fillRect(500, 350, 200, 50);
		
		//lavender colored box for wonder victory points
		g.setColor(new Color(225, 210, 235));
		g.fillRect(200, 425, 200, 50);
		g.fillRect(500, 425, 200, 50);
		
		//green colored box for progression victory points
		g.setColor(new Color(75, 225, 50));
		g.fillRect(200, 500, 200, 50);
		g.fillRect(500, 500, 200, 50);
		
		//yellow colored box for money victory points
		g.setColor(new Color(250, 250, 40));
		g.fillRect(200, 575, 200, 50);
		g.fillRect(500, 575, 200, 50);
		
		//red colored box for military victory points
		g.setColor(new Color(230, 80, 80));
		g.fillRect(200, 650, 200, 50);
		g.fillRect(500, 650, 200, 50);
		
		//white box for total score
		g.setColor(Color.WHITE);
		g.fillRect(200, 750, 200, 50);
		g.fillRect(500, 750, 200, 50);
		
		//--------------------------------------------------------------
		
		//blue card symbol for civilian buildings victory points
		g.setColor(new Color(125, 240, 250));
		g.fillRect(75, 125, 75, 50);
		g.setColor(Color.BLACK);
		g.drawRect(75, 125, 75, 50);
		g.drawRect(100, 135, 25, 30);
		
		//light green card symbol for science cards victory points
		g.setColor(new Color(155, 255, 180));
		g.fillRect(75, 200, 75, 50);
		g.setColor(Color.BLACK);
		g.drawRect(75, 200, 75, 50);
		g.drawRect(100, 210, 25, 30);
		
		//mustard colored card symbol for commercial building victory points
		g.setColor(new Color(250, 210, 85));
		g.fillRect(75, 275, 75, 50);
		g.setColor(Color.BLACK);
		g.drawRect(75, 275, 75, 50);
		g.drawRect(100, 285, 25, 30);
		
		//purple colored card symbol for science victory points
		g.setColor(new Color(200, 80, 240));
		g.fillRect(75, 350, 75, 50);
		g.setColor(Color.BLACK);
		g.drawRect(75, 350, 75, 50);
		g.drawRect(100, 360, 25, 30);
		
		//monument symbol for wonder victory points
		g.setColor(new Color(225, 210, 235));
		g.fillRect(75, 425, 75, 50);
		g.setColor(Color.BLACK);
		g.drawRect(75, 425, 75, 50);
		g.drawPolygon(new int[] {112, 87, 137}, new int[] {435, 442, 442}, 3);
		g.drawRect(92, 442, 40, 20);
		g.drawRect(102, 442, 20, 20);
		g.drawLine(87, 462, 137, 462);
		
		//green circle symbol for progression victory points
		g.setColor(new Color(75, 225, 50));
		g.fillRect(75, 500, 75, 50);
		g.setColor(Color.BLACK);
		g.drawRect(75, 500, 75, 50);
		g.drawOval(98, 510, 30, 30);
		
		//yellow money symbol for money victory points
		g.setColor(new Color(250, 250, 40));
		g.fillRect(75, 575, 75, 50);
		g.setColor(Color.BLACK);
		g.drawRect(75, 575, 75, 50);
		g.setFont(new Font("TimesRoman", Font.PLAIN, 35));
		g.drawString("$", 106, 612);
		
		//red x and circle symbol for military victory points
		g.setColor(new Color(230, 80, 80));
		g.fillRect(75, 650, 75, 50);
		g.setColor(Color.BLACK);
		g.drawRect(75, 650, 75, 50);
		g.drawOval(98, 660, 30, 30);
		g.drawLine(101, 665, 125, 685);
		g.drawLine(101, 685, 125, 665);
		
		//TOTAL
		g.setColor(Color.WHITE);
		g.fillRect(75, 750, 75, 50);
		g.setColor(Color.BLACK);
		g.drawRect(75, 750, 75, 50);
		g.setFont(new Font("TimeRoman", Font.PLAIN, 20));
		g.drawString("TOTAL", 82, 782);
	}
	
	public static void main(String[] args)
	{
		wDuelCalc = new WondersDuelCalc();
	}
}
