package Arrays;
import java.util.Arrays;
public class Majority {
    public static void main(String[] args) {
           int[] arr={1};
        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
