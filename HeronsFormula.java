package assignment3_10513826;
public class HeronsFormula
{
	public static void main( String[] args )
	{
		double a;
		
		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3,3,3 has an area of " + a );

		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3,4,5 has an area of " + a );
 
		a = triangleArea(7, 8, 9);
		System.out.println("A triangle with sides 7,8,9 has an area of " + a );
                
                a = triangleArea(9, 9, 9);
		System.out.println("A triangle with sides 9,9,9 has an area of " + a );
                // It is easier adding a test to Herons Formula with a function than the one without a function.

		System.out.println("A triangle with sides 5,12,13 has an area of " + triangleArea(5, 12, 13) );
		System.out.println("A triangle with sides 10,9,11 has an area of " + triangleArea(10, 9, 11) );
		System.out.println("A triangle with sides 8,15,17 has an area of " + triangleArea(8, 15, 17) );
	}
 
	public static double triangleArea( int a, int b, int c )
	{
		// the code in this function computes the area of a triangle whose sides have lengths a, b, and c
		double s, A;

		s = (a+b+c) / 2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );

		return A;
		// ^ after computing the area, "return" it
	}
}

/*
Q1. Both Herons Formula and Herons Formula with no function produce the same result.

Q2. Herons Formula has 31 lines whilst Herons Formula with no Function has 51 lines.

Q3. It was easier fixing Heuns Formula with a function than the one without a function.
*/