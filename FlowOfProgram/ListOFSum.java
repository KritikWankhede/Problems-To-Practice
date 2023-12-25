package FlowOfProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOFSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        List<Integer> list =new ArrayList<>(num) ;

        int sum=0;
        for (int i = 0; i < num; i++) {
            int j=sc.nextInt();
            list.add(j);
        }
        for (int i=0;i<num;i++){
            int number= list.get(i);
            int large=0,rem;
            while(number!=0){
                rem=number%10;
                if(rem>large){
                    large=rem;
                }
                number=number/10;
            }
            sum=sum+large;
        }
        System.out.println(sum);
    }

}
