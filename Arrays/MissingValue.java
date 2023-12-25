package Arrays;
import java.util.Arrays;
import java.util.List;
import java .util.ArrayList;
public class MissingValue {
    public static void main(String[] args) {
        int[] num={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(num));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[correct]!=nums[i]){
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                list.add(i+1);
            }
            i++;
        }
        return list;
    }
}
