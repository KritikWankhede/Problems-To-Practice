package FlowOfProgram;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int num1=0,num2=1,num3,series;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:-");
        series=sc.nextInt();
        System.out.print("Fibonacci series:-"+num1+" "+num2+" ");
        for (int i = 0; i < series-2; i++) {
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(num3+" ");
        }
    }
}
