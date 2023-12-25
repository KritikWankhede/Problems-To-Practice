package BitwiseOperator;

import java.util.Scanner;

public class NoOfPrimeBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(countPrimeSetBits(num,num2));
    }
    static int countPrimeSetBits(int left, int right) {
        int res=0;
         while(left<=right){
             int count=0,i=2;
             boolean flag=true;
             int temp=left;
             while(temp!=0){
                 count++;
                 temp&=temp-1;
             }
             if(count<2){
                 flag=false;
             }
             else{
                 while(i*i<=count){
                     if((count%i)==0){
                         flag=false;
                     }
                     i++;
                 }
             }
             if(flag){
                 res++;
             }
            left++;
         }
         return res;
    }
}
