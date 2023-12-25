package Hexa;
public class Ans extends SumofRem {
    public static void main(String[] args) {

        int sum=0;
        Ans obj =new Ans();
        int num=obj.sumofRem();
        while(num!=0){
            int rem=num%10;
            int temp=num/10;
            while(temp!=0){
                int rem2=temp%10;
                sum=sum+rem+rem2;
                temp=temp/10;
            }
            num/=10;
        }
        System.out.println(sum);
    }
}
