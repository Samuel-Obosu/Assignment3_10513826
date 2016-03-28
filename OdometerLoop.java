package assignment3_10513826;
import java.util.Scanner;
public class OdometerLoop {
public static void main( String[] args ) throws Exception
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Which base(2-10): ");
        int base = input.nextInt();
        for ( int thous=0; thous<base; thous++ )
        
            for ( int hund=0; hund<base; hund++ )
            
                for ( int tens=0; tens<base; tens++ )
                
                    for ( int ones=0; ones<base; ones++ )
                    {
                        System.out.print( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
                        Thread.sleep(500);
                    }
                
            
        

        System.out.println();
    }    
}
/*
Q1. The program still works when curly brasis are deleted
*/
