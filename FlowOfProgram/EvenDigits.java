package FlowOfProgram;

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size of array:-");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements:-");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Even digits number are:-");
        for (int s:arr) {
            int count=0,num=s;
            while(s!=0)
            {
                s=s/10;
               count++;
            }
            if(count%2==0)
            {
                System.out.print(num+" ");
            }
        }
    }
}
