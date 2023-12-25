package BitwiseOperator;

import java.util.Arrays;
import java.util.Scanner;

public class SetBits {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
//       int count=0;
//        System.out.println(Integer.toBinaryString(num));
//        while(num!=0){
//            count++;
//            num=num&num-1;
//        }
//        System.out.println(count);

        int[] arr=new int[num+1];
        for(int i=1;i<=num;i++){
            arr[i]=arr[i&(i-1)]+1;
        }
        System.out.println(Arrays.toString(arr));

    }
}
