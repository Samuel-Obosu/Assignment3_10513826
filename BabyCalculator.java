package assignment3_10513826;
import java.util.Scanner;
public class BabyCalculator {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b, c=0;
		String op;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
			op = keyboard.next();
			b  = keyboard.nextDouble();

			if ( op.equals("+") )
				c = a + b;
                        else if(op.equals("-"))
			{
				c =a-b;
			}
                        else if(op.equals("*"))
			{
				c =a*b;
			}
                        else if(op.equals("/"))
			{
				c =a/b;
			}

			System.out.println(c);

		} while (a!=0 );
                System.out.println("Bye, now.");
	}
}
