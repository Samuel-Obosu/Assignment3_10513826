package assignment3_10513826;
public class NumberPuzzles1 {
public static void main(String[] args){
    for(int a=0; a<=60;a++){
        for(int b=0; b<=60; b++){
        if((a+b)==60){
            if((a-b)==14 || (b-a)==14){
                System.out.println("("+a +","+b+")");
            }
        }
    }
    }
}    
}
