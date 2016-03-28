package assignment3_10513826;
import java.util.Random;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;
public class RandomRightTriangles extends Canvas {
    Random rand = new Random();
     public void paint( Graphics g )
	{ 
            for(int i=0; i<=500;i++){
            Color myColor = new Color(rand.nextInt(200), rand.nextInt(200), rand.nextInt(200));
                g.setColor(myColor);
		Polygon tri = new Polygon();
                int x = 1+rand.nextInt(700);
                int y = 1+rand.nextInt(700);
                int a = x+50;
                int b = y+50;
		tri.addPoint(x, y);
		tri.addPoint(x, b);
		tri.addPoint(a, b);
                g.fillPolygon(tri);
        
}
        }
     public static void main(String[] args)
	{
		JFrame win = new JFrame("A Boring Triangle");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
                win.add( new RandomRightTriangles() );
		win.setVisible(true);
	}
}

