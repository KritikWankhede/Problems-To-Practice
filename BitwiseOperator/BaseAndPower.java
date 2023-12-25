package BitwiseOperator;

import java.util.Scanner;

public class BaseAndPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int power=sc.nextInt();
        int ans=1;
        while(power!=0){
            int last=power & 1;
            if(last!=0){
                ans=ans*num;
            }
            num=num*num;
            power=power>>1;
        }
        System.out.println(ans);
    }
}
