package Ganit;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(climbStairs(num));
    }
    static int climbStairs(int n) {
            double sqrt=Math.sqrt(5);
            double ans=Math.pow((1+sqrt)/2,n+1)-Math.pow((1-sqrt)/2,n+1);
            return (int)(ans/sqrt);
        }
}


