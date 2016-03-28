package assignment3_10513826;
import java.util.Scanner;
public class KeychainsForSaleRealUltimatePower {
    
    public static int add_keychains(int num){
        Scanner input = new Scanner(System.in);
        System.out.print("You have "+ num+" keychains. How many to add? ");
        int response = input.nextInt();
        num+=response;
        while(num<0){
            System.out.println("Keychains cannot be less than 0");
            add_keychains(num);
        }
        return +num;
    }
    public static int remove_keychains(int remnum){
    Scanner input = new Scanner(System.in);
        System.out.print("You have "+ remnum+" keychains. How many to remove? ");
        int response = input.nextInt();
        remnum-=response;
        while(remnum<0){
            System.out.println("Keychains cannot be less than 0");
            remove_keychains(remnum);
        }
        return remnum;
    }
     public static void view_order(int number, int price ,double tax, int base_shipping, int per_keychain_shipping){
        System.out.println("You have "+ number +" keychains");
        System.out.println("Keychains cost $"+ price +" each.");
        System.out.println("The total cost before tax is $"+(number*price));
        System.out.println("Shipping charges on order is $"+( number* base_shipping));
        System.out.println("The tax on the order is $"+(tax*number));
        System.out.println("The final cost of the order is $"+((number*price)+( number* base_shipping)+(tax*number)));
        
                
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
          double salestax =(8.25/100);
          int shippingCostPerOrder =5, perKeychainShipping =1;
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
                      view_order(keynumber,keyprice, salestax, shippingCostPerOrder, perKeychainShipping);
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
