package assignment3_10513826;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MotivationalPoster extends Canvas
{
	Image motivational;
	
	public MotivationalPoster() throws Exception
	{
		motivational = ImageIO.read( new File("MQ1.jpg") );
		
	}
	
	public void paint( Graphics g )
	{
		
		g.drawImage(motivational,300,100,this);
                g.setColor(Color.red);
                g.setFont(new Font("Century Gothic", Font.PLAIN, 100));
                g.drawString("M", 120, 540);
                g.setFont(new Font("Century Gothic", Font.PLAIN, 40));
                g.drawString("INIONS MOTIVATION MESSAG", 200, 500);
                g.drawLine(200, 500, 760, 500);
                g.setFont(new Font("Century Gothic", Font.PLAIN, 100));
                g.drawString("E", 760, 540);
		
	}

	public static void main(String[] args) throws Exception
	{
		JFrame win = new JFrame("Motivational Poster");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new MotivationalPoster() );
		win.setVisible(true);
	}


}

