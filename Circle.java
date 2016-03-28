package assignment3_10513826;

import javax.swing.JFrame;
import java.awt.*;
public class Circle extends Canvas{
    public void paint( Graphics g )
	{
            g.setColor(Color.green); 
            g.fillOval(150,200,200,100);
        }
    public static void main( String[] args )
	{
		JFrame win = new JFrame("Circle");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Circle canvas = new Circle();
		win.add( canvas );
		win.setVisible(true);
                
	}
}
