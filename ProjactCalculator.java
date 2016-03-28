package assignment3_10513826;
import java.util.Scanner;
public class ProjactCalculator {
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
			

			if ( op.equals("+") ){
                            b  = keyboard.nextDouble();
                            c = a + b;
                        }				
                        else if(op.equals("-"))
			{
                            b  = keyboard.nextDouble();
				c =a-b;
			}
                        else if(op.equals("*"))
			{
                            b  = keyboard.nextDouble();
				c =a*b;
			}
                        else if(op.equals("/"))
			{
                            b  = keyboard.nextDouble();
				c =a/b;
			}
                        else if(op.equals("^"))
			{
                            b  = keyboard.nextDouble();
				c =Math.pow(a,b);
			}
                        else if(op.equals("%"))
			{
                            b  = keyboard.nextDouble();
				c =a%b;
			}
                        else if(op.equals("!"))
			{
				c =fact(a);
			} 
                        else{
                            System.out.println("Wrong Input please try again.");
                        }

			System.out.println(c);

		} while (a!=0 );
                System.out.println("Bye, now.");
	}
    public static double fact(double n){
        double factorial =1;
        if(n==1){
        factorial=1;
    }
        else{
            factorial= n*fact(n-1);
        }
        return factorial;
    }
}
