package Ganit;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        for (int i = num1; i <num2 ; i++) {
             if(isPrime(i)) {
                 System.out.print(i+" ");
             }
        }
    }
    static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        int c=2;
        while(c*c<=num){
            if(num%c==0){
                return false;
            }
            c++;
        }

        return true;
    }
}
