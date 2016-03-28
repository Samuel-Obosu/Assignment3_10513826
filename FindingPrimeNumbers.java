package assignment3_10513826;
public class FindingPrimeNumbers {
public static boolean isPrime( int n ){
    int count =0;
    boolean result;
    for(int i=1; i<=n;i++){
        if( n%i==0){
            count+=1;
        }
    }
    if(count==2){
        result =true;
    }
    else{
        result =false;
    }
    return result;
}    
public static void main(String []args){
    for(int a=1; a<101; a++){
        if(isPrime(a)==true){
            System.out.println(a);
        }
    }
}
}
