package assignment3_10513826;
public class GettingIndividualDigits {
public static void main(String[]args){
    int div,rem;
    for(int i=11;i<100;i++){
        div = i/10;
        rem =i %10;
        System.out.println(i+","+div +"+"+rem +" = "+(div+rem));
    }
}    
}
