package Ganit;

import java.util.Scanner;

public class NBitsToZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
//        String bnum=Integer.toBinaryString(num);
//
//        System.out.println(bnum+" "+bnum.length());
        int res=0;
        int mul=1;
        while(num>0){
            res+= num ^(num-1) * mul;
            mul=-1*mul;
            num &=num-1;
        }
        System.out.println(Math.abs(res));
    }
}
