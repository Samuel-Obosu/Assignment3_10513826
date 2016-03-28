package assignment3_10513826;
import java.awt.*;
import javax.swing.JFrame;
public class ASmilingFace extends Canvas {
    public void paint(Graphics g){
        // labels
g.setColor(Color.yellow);
g.fillOval(200, 200, 270, 270);
g.setColor(Color.blue);
g.fillOval(235, 275, 50, 50);
g.fillOval(375, 275, 50, 50);
g.setColor(Color.red);
g.drawArc(275, 250, 100, 200,200, 130);


    }
    public static void main( String[] args )
	{
		JFrame win = new JFrame("A Smiling Face");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ASmilingFace canvas = new ASmilingFace();
		win.add(canvas);
		win.setVisible(true);
                
	}
}

