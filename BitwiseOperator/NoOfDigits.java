package BitwiseOperator;
import java.util.Scanner;
public class NoOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=(int)(Math.log(num)/Math.log(2))+1;
        System.out.println(ans);
        System.out.println(Integer.toBinaryString(num));
    }
}
