package FlowOfProgram;
import java.util.Scanner;
public class palidrome {
    public static void main(String[] args) {
        int num,num1,rem,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:-");
        num=sc.nextInt();
        System.out.println(isPalindrome(num));
        num1=num;
        while(num1>0)
        {
            rem=num1%10;
            num1=num1/10;
            sum=sum*10+rem;
        }
        if(num==sum)
        {
            System.out.println("The number is palindrome.");
        }
        else{
            System.out.println("The number is not palindrome.");
        }
    }
    static boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        int left=0,right=str.length()-1;
        while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
