package assignment3_10513826;
import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;
public class Boxy2 extends Canvas
{
    
	public void paint( Graphics window )
	{
		window.setColor(Color.BLUE);
		window.fillRect(200,300,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(210,310,80,80);
		
		window.setColor(Color.green);
		window.fillRect(80,100,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(90,110,80,80);
                
                window.setColor(Color.red);
		window.fillRect(300,100,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(310,110,80,80);
                
                window.setColor(Color.yellow);
		window.fillRect(80,400,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(90,410,80,80);
                
                window.setColor(Color.pink);
		window.fillRect(150,250,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(160,260,80,80);
                
                window.setColor(Color.ORANGE);
		window.fillRect(300,300,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(310,310,80,80);
                
                window.setColor(Color.cyan);
		window.fillRect(240,400,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(250,410,80,80);
                
                window.setColor(Color.BLACK);
		window.fillRect(500,300,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(510,310,80,80);
                
                window.setColor(Color.magenta);
		window.fillRect(500,100,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(510,110,80,80);
                
                window.setColor(Color.LIGHT_GRAY);
		window.fillRect(400,100,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(410,110,80,80);
                
                window.setColor(Color.RED);
		window.fillRect(100,100,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(110,110,80,80);
	}

	public static void main( String[] args )
	{
		Canvas canvas = new Boxy2();
		JFrame win = new JFrame("Boxy1 - make them manually");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
