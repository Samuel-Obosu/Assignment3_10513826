package assignment3_10513826;
import java.util.Scanner;
public class DisplayingSomeMultiples {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a number: ");
        int num = input.nextInt();
        for(int i=1; i<=12;i++)
            System.out.println(num + "x"+i +" ="+(num*i));
    }
}
