package assignment3_10513826;
import java.util.Scanner;
public class KeyChainsForSale {
    
    public static int add_keychains(int num){
        Scanner input = new Scanner(System.in);
        System.out.print("You have "+ num+" keychains. How many to add? ");
        int response = input.nextInt();
        num+=response;
        return +num;
    }
    public static int remove_keychains(int remnum){
    Scanner input = new Scanner(System.in);
        System.out.print("You have "+ remnum+" keychains. How many to remove? ");
        int response = input.nextInt();
        remnum-=response;
        return remnum;
    }
     public static void view_order(int number, int price){
        System.out.println("You have "+ number +" keychains");
        System.out.println("Keychains cost $"+ price +" each.");
        System.out.println("The total cost is $"+(number*price));
    }
      public static void checkout(int number, int price){
        System.out.println("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("You have "+ number +" keychains");
        System.out.println("Keychains cost $"+ price +" each.");
        System.out.println("The total cost is $"+(number*price));
        System.out.println("Thanks for your order "+ name+"!");
    }
      
      public static void main(String []args){
          Scanner input = new Scanner(System.in);
          int keynumber=0, keyprice=10;
          System.out.println("Ye Olde Keychain Shoppe\n" +
"\n" +
"1. Add Keychains to Order\n" +
"2. Remove Keychains from Order\n" +
"3. View Current Order\n" +
"4. Checkout");
          System.out.print("Please enter choice: ");
          int response = input.nextInt();
          int answer;
          while(response !=4){
              switch(response){
                  case 1:
                     answer = add_keychains(keynumber);
                      System.out.println("You now have "+ answer +" keychains. ");
                      keynumber+=answer;
                      break;
                  case 2:
                      answer = remove_keychains(keynumber);
                      System.out.println("You now have "+ answer +" keychains. ");
                      keynumber=answer;
                      break;
                  case 3:
                      view_order(keynumber,keyprice);
                      break;    
              }
              System.out.println();
              System.out.println("1. Add Keychains to Order\n" +
"2. Remove Keychains from Order\n" +
"3. View Current Order\n" +
"4. Checkout");
              System.out.print("Please enter choice: ");
              response = input.nextInt();
          }
          checkout(keynumber,keyprice);
      }
}
