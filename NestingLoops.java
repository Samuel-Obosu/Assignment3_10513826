package assignment3_10513826;
public class NestingLoops {
public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        for ( int n=1; n <= 3; n++ )
        {
            for (char c='A'; c <= 'E'; c++  )
            {
                System.out.println( c + " " + n );
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
            System.out.println();
            // * You will add a line of code here.
        }

        System.out.println("\n");

    }    
}
/*
Q1. The variable contained in the inner loop changes faster.

Q2. The "c" loop repeats all its iterations anytime the n loop iterates once.

Q3.Each output is printed on a new line.

Q4. Three outputs are printed on each line.
*/
