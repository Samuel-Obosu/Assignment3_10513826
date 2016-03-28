package assignment3_10513826;
import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo1 extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.green);
		g.drawRect(50,20,100,200);  // draw a rectangle
		g.fillOval(160,20,100,200); // draw a filled-in oval
		g.setColor(Color.blue);
		g.fillRect(200,400,200,20); // a filled-in rectangle
		g.drawOval(200,430,200,100);
                g.setColor(Color.red);
                g.fillRect(650, 450, 100, 100);
                
                
                
                
		
		g.setColor(Color.black);
		g.drawString("Graphics are pretty neat.", 500, 100);
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
	}

	public static void main( String[] args )
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("GraphicsDemo1");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GraphicsDemo1 canvas = new GraphicsDemo1();
		win.add( canvas );
		win.setVisible(true);
                
	}
}

/*
Q1. The window is 800pixels wide and 600 pixels tall.

Q2. The first number represents the x-coordinate of the rectangle.
    The second number represents the y-coordinate of the rectangle
    The third number represents the width of the rectangle
    The fourth number represents the height of the rectangle

Q3. The first number represents the x-coordinate of the upper left corner of the oval.
    The second number represents the x-coordinate of the upper right corner of the oval.
    The third number represents the width of the oval to be filled.
    The fourth number represents the width of the oval to be filled

Q4. The first and second numbers represents the x and y coordinates respectively.

Q5. The object which was drawn last will be on top.
*/