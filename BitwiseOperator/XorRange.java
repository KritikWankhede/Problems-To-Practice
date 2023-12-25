package BitwiseOperator;

import java.util.Scanner;

public class XorRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans=xor(num2)^xor(num1-1);
        System.out.println(ans);
    }
    static int xor(int num){
        if(num%4==0){
            return num;
        }
        if(num%4==1){
            return 1;
        }
        if(num%4==2){
            return num+1;
        }
        else return 0;
    }
}
