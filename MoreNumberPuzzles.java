package assignment3_10513826;
import java.util.Scanner;
public class MoreNumberPuzzles {
    public static void func1(){
        int div,rem;
        for(int i=11;i<56;i++){
        div = i/10;
        rem =i %10;
        if((div+rem)>10){
                System.out.println(i);
        }
    }
}
    public static void func2(){
        int div,rem;
        for(int i=11;i<100;i++){
        div = i/10;
        rem =i %10;
        if(i-reverse(i)==(div+rem)){
                System.out.println(i);
        }
    }
}
    public static int reverse(int n) {
   int result = 0;
   int rem;
   while (n > 0) {
       rem = n % 10;
       n = n / 10;
       result = result * 10 + rem;
   }
   return result;
}
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int response;
        do {System.out.println("1) Find two digit numbers <= 56 with sums of digits > 10\n" +
"2) Find two digit number minus number reversed which equals sum of digits\n" +
"3) Quit\n" +
"\n" );
        System.out.print("> ");
        response = input.nextInt();
        if (response ==1){
            func1();
        }
        else if(response==2){
            func2();
        }
        
    }while(response!=3);
    }
}
    

