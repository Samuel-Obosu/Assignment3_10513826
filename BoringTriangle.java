package assignment3_10513826;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;
public class BoringTriangle  extends Canvas{
    public void paint( Graphics g )
	{
		Color mypurple = new Color(121,107,191);
                g.setColor(mypurple);
		Polygon tri = new Polygon();
		tri.addPoint(100, 100);
		tri.addPoint(100, 300);
		tri.addPoint(200, 300);
                g.fillPolygon(tri);
}
    public static void main(String[] args)
	{
		JFrame win = new JFrame("A Boring Triangle");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new BoringTriangle() );
		win.setVisible(true);
	}
}
