package BitwiseOperator;

import java.util.Scanner;

public class ReduceToZero {
    public static void main(String[] args) {
        ReduceToZero obj=new ReduceToZero();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(obj.numberOfSteps(num));
    }
    public int numberOfSteps(int num) {
        int numSteps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            numSteps++;
        }

        return numSteps;
    }
}
