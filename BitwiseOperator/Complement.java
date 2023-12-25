package BitwiseOperator;

import java.util.Scanner;

public class Complement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0,i=0;
        while(i<num){
            i=(int)(i+Math.pow(2,count));
            count++;
        }
        System.out.println(count);
        System.out.println(i-num);
    }
}
