package Ganit;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        factors(num);
    }
    static void factors(int num){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i < Math.sqrt(num); i++) {
            if(num%i==0){
                if(i==num/i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" ");
                    list.add(num/i);
                }
            }
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i)+" ");
        }
    }

}
