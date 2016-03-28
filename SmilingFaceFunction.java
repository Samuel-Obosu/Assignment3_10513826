package assignment3_10513826;

import java.awt.*;
import javax.swing.JFrame;

public class SmilingFaceFunction extends Canvas
{
	public void paint( Graphics g )
	{
		drawSmilingFace(g,100,100);
		drawSmilingFace(g,400,350);
		// etc
	}

	public void drawSmilingFace( Graphics g, int x, int y )
	{
		// Draws a smiling face on the screen, where the point (x,y) is
		//  the upper-left corner of a box containing the face.

		// draw circle for the head

		// draw eyes

		// draw mouth
            g.setColor(Color.yellow);
            g.fillOval(x, y, 200, 200);
            g.setColor(Color.blue);
            g.fillOval(x+35, y+75, 30, 30);
            g.fillOval(x+150, y+75, 30, 30);
            g.setColor(Color.red);
            g.drawArc(x+75, y+50, 50, 100,200, 130);
            
	}

	public static void main(String[] args)
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Smiling Face Function");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new SmilingFaceFunction() );
		win.setVisible(true);
	}


}

