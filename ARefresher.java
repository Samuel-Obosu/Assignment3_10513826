package assignment3_10513826;
import java.util.Scanner;
public class ARefresher {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = input.next();
        if(name.equals("Mitchel")){
            for(int i=1; i<=5;i++){
                System.out.println(name);
            }
        }
        else{
            for(int i=1; i<=10;i++){
                System.out.println(name);
            }
        }
    }
}
