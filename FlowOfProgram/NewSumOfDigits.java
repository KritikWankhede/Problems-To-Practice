package FlowOfProgram;
import java.util.Scanner;
public class NewSumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            int rem=num%10;
            int temp=num/10;
            while(temp!=0){
                int nrem=temp%10;
                sum=rem+nrem+sum;
                temp/=10;
            }
            num=num/10;
        }
        System.out.println(sum);
    }
}
