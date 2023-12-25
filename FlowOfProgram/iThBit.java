package FlowOfProgram;

import java.util.Scanner;

public class iThBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ith=sc.nextInt();
        System.out.println(num & (1<<(ith-1)));

    }
}
