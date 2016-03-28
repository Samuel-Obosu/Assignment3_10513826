package assignment3_10513826;
import java.awt.*;
import javax.swing.JFrame;
public class ClockFace extends Canvas {
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawOval(250, 100, 270, 270);
        g.setColor(Color.GRAY);
        g.fillOval(380, 230, 10, 10);
        g.setColor(Color.black);
        g.drawLine(265, 235, 382, 235);
        g.drawLine(285, 260, 382, 235);
        g.setFont(new Font("Consolas", Font.PLAIN, 36));
        g.drawString("12", 370, 150);
        g.drawString("6", 370, 350);
        g.drawString("9", 260, 245);
        g.drawString("3", 480, 245);
    }
    public static void main(String []args){
        JFrame win = new JFrame("A Clock Face");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockFace canvas = new ClockFace();
        win.add( canvas );
	win.setVisible(true);
    }
}
