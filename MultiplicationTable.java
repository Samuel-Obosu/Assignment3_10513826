package assignment3_10513826;
public class MultiplicationTable {
public static void main(String[] args){
    System.out.println("x | 1   2       3       4       5       6       7       8       9 \n" +
"==+==================================================================");
    for(int row=1;row<=12; row++){
        System.out.print(row+" | ");
        for(int column=1; column<=9; column++){
            System.out.print(row*column+ "\t");
        }
        System.out.println();
    }
}    
}
