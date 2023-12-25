package Ganit;


import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        System.out.println(addBinary(num1, num2));
    }

    static String addBinary(String a, String b) {

        int num =Integer.parseInt(a,2);
        int num2 = Integer.parseInt(b,2);
        int sum=num+num2;

        return Integer.toBinaryString(sum);
    }
}

