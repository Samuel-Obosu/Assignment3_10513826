package assignment3_10513826;
import java.util.Scanner;
public class AreaCalculator {
    public static double area_circle( int radius ){
     double result;
     result= Math.PI*Math.pow(radius, 2);
        // returns the area of a circle
     return result;
    }    
public static int area_rectangle( int length, int width ){
    int result;
    result = length *width;
        // returns the area of a rectangle
    return result;
    }    
public static int area_square( int side ){
        int result = side*side;
// returns the area of a square
        return result;
    }
    public static double area_triangle( int base, int height ){
        double result = 0.5*(base*height);
        return result;
    } 
    public static void main(String []args){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" +
"\n" +
"1) Triangle\n" +
"2) Rectangle\n" +
"3) Square\n" +
"4) Circle\n" +
"5) Quit\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Which shape: ");
        int user = input.nextInt();
        System.out.println();
        double area;
        while (user!=5){
            switch (user){
                case 1:
                    System.out.print("Base: ");
                    int mybase = input.nextInt();
                    System.out.print("Height: ");
                    int myheight = input.nextInt();
                    area = area_triangle(mybase,myheight);
                    System.out.println("The area is " +area);
                break;
                 
                case 2:
                    System.out.print("Length: ");
                    int mylength = input.nextInt();
                    System.out.print("Height: ");
                    int mywidth = input.nextInt();
                    area = area_rectangle(mylength,mywidth);
                    System.out.println("The area is " +area);
                break;
                    
                case 3:
                    System.out.print("Side: ");
                    int myside = input.nextInt();
                    area = area_square(myside);
                    System.out.println("The area is " +area);
                break;    
                    
                case 4:
                    System.out.print("Radius: ");
                    int myrad = input.nextInt();
                    area = area_circle(myrad);
                    System.out.println("The area is " +area);
                break;
                    
            }
           System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n" +
"\n" +
"1) Triangle\n" +
"2) Rectangle\n" +
"3) Square\n" +
"4) Circle\n" +
"5) Quit\n");
        System.out.print("Which shape: ");
         user = input.nextInt();
        System.out.println(); 
        }
        System.out.println("Goodbye");
}
}

