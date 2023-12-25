package FlowOfProgram;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,base=5;
        int num=sc.nextInt();
        /*
        (6)10=(110)2:-1*5^3+1*5^2+0*5^1=150
         */
        while(num!=0){
            int last=num & 1;
            num= num>>1;
            sum=sum+last*base;
            base=base*5;
        }
        System.out.println(sum);
    }
}
