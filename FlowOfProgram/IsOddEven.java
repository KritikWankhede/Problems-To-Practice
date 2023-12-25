package FlowOfProgram;
import java.util.Scanner;
public class IsOddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if((num&1)==1)
            System.out.println("num is odd");

        else System.out.println("num is even");
    }
}
