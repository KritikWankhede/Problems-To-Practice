package Arrays;
import java.util.Arrays;
public class ShuufleArray {
    public static void main(String[] args) {
        int[] nums={1,2,2,1};
        int[] ans=shuffle(nums,2);
        System.out.println(Arrays.toString(ans));
    }
   static int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int left=0;
        int right=(nums.length/2);
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                res[i]=nums[left];
                left++;
            }
            else{
                res[i]=nums[right];
                right++;
            }
        }
        return res;
    }
}
