package assignment3_10513826;
public class ArmstrongNumbers {
public static void main(String []args){
    for(int a=0;a <10;a++){
     for(int b=0;b <10;b++){
        for(int c=0;c <10;c++){
        String mynum = a + "" + b + "" + c ;
        //int num = in
        if((Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))== Integer.parseInt(mynum)){
            System.out.println( a+","+b+"and"+c+" form the Armstrong number "+Integer.parseInt(mynum));
        }
    }
    }   
    }
}    
}
