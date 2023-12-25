package Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class AddToArrayForm {
    public static void main(String[] args) {
        int[] num={1,2,0,0};
        System.out.println(Arrays.toString(addToArrayForm(num,34)));
    }
   static int[] addToArrayForm(int[] num, int k) {
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i]*((int)Math.pow(10,(num.length-1-i)));
        }
        sum=sum+k;
        ArrayList<Integer> list=new ArrayList<>();
        while(sum!=0){
            int rem=sum%10;
            list.add(rem);
            sum=sum/10;
        }
        int[] ck=new int[list.size()];
       for (int i = list.size()-1; i >=0; i--) {
           ck[list.size()-1-i]= list.get(i);
       }
        return ck;
    }
}
