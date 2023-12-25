package BitwiseOperator;

import java.util.Scanner;

public class HammingDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(hammingDistance(num1,num2));
    }
    static int hammingDistance(int x, int y) {
         int check=x^y;
         int count=0;
           while(check!=0){
               if((check&1)==1){
                   count++;
               }
               check=check>>1;
           }
           return count;
    }
}
