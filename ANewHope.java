package assignment3_10513826;
public class ANewHope {
    public static void main(String[]args){
for(int a=0;a <10;a++){
     for(int b=0;b <10;b++){
        for(int c=0;c <10;c++){
            for(int d=0;d <10;d++){
        String mynum = a + "" + b + "" + c  + "" + d;
        //int num = in
        int first=a+2,second =b-2,third=c*2,fourth=d/2;
        if((first==second&& second==third && third == fourth)&&a+b+c+d==45){
            System.out.println( mynum);
        }
    }
    }   
    }    
}
}
}