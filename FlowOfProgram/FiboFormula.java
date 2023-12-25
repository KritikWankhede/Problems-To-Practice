package FlowOfProgram;

import java.util.Scanner;

public class FiboFormula {
    public static void main(String[] args) {
        int input;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive integer number:-");
        input=sc.nextInt();
        if(input<0){
            System.out.println("Enter Positive integer!");
            return ;
        }
        System.out.println(fiboformula(input));
        System.out.println(fib(input));
    }
    static int fiboformula(int num){
        return (int) (Math.pow((1+Math.sqrt(5))/2,num)/Math.sqrt(5));
    }
    static int fib(int n) {
        if(n<1){
            return 0;

        }
        if(n==1 ||n==2){
            return 1;
        }

        return (int) ((Math.pow((1+Math.sqrt(5))/2,n)/Math.sqrt(5))-(Math.pow((1-Math.sqrt(5))/2,n)/Math.sqrt(5)));
    }
}
