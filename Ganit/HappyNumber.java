package Ganit;
import java.util.Scanner;
public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(isHappy(num));
    }

        static boolean isHappy(int n) {

            if(n==7 ||n==1){
                return true;
            }
            while(n>=10){
                int sum=0;
                while(n!=0){
                    int rem=n%10;
                    sum=sum+rem*rem;
                    n=n/10;
                }
                n=sum;

                if(n==7 ||n==1){
                    return true;
                }
            }

           return false;
        }

}
