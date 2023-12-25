package BitwiseOperator;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean ans=false;
        if(num!=0){
            ans=(num & num-1)==0;
        }
        if(ans){
            System.out.println("It is power of 2");
        }
        else
            System.out.println("It is not power of 2");
    }
}
