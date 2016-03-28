package assignment3_10513826;
public class EvennessFunction {
    public static boolean isEven( int n ){
        boolean status;
        if(n%2==0){
            status = true;
        }
        else{
            status= false;
        }
        return status;
    }
    public static boolean isDivisibleBy3( int n ){
        boolean status;
        if(n%3==0){
            status = true;
        }
        else{
            status= false;
        }
        return status;
    }
    public static void main(String[]args){
        for(int i=1; i<=20;i++){
            System.out.print(i);
            if(isEven(i)==true){
                System.out.print("<");
            }
            if(isDivisibleBy3(i)==true){
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
