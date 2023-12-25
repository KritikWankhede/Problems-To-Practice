package BitwiseOperator;
import java.util.Scanner;

public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str=sc.next();
       if(str.length()==32){
           System.out.println(reverseBits(Integer.parseInt(str,2)));
       }
       else{
           System.out.println("32 length is only allowed");
       }

    }
    static int reverseBits(int n) {
        StringBuilder str=new StringBuilder(Integer.toBinaryString(n));
        System.out.println(str.reverse());
        return Integer.parseInt(String.valueOf(str.reverse()));
    }
}
