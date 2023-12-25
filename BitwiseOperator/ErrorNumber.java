package BitwiseOperator;
import java.util.Arrays;
public class ErrorNumber {
    public static void main(String[] args) {

        int[] num={2,2};
        System.out.println(Arrays.toString(findErrorNums(num)));
    }
    static int[] findErrorNums(int[] nums) {
        int[] arr=new int[2];
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                arr[0]=nums[i];
                arr[1]=i+1;
            }
            i++;
        }
        return arr;
    }
}
