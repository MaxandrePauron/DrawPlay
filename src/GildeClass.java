import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class GildeClass {
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.black);
		g2.drawString("C'est moi Gildéric Deruette",10,10);	
	}
}
