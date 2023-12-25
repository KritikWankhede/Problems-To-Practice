package Arrays;
import java.util.Arrays;
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums={1,-1,3,4};
        System.out.println(firstMissingPositive(nums));
    }
    static int firstMissingPositive(int[] nums) {
        int start=0,end=nums.length;
        Arrays.sort(nums);
        int ans=1;
        while(start<end){
            if(nums[start]==ans){
                ans=ans+1;
            }
            start++;
        }
        return ans;
    }
}
