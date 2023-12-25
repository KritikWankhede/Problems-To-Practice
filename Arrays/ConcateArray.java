package Arrays;

import java.util.Arrays;

public class ConcateArray {
    public static void main(String[] args) {
        int[] nums={1,3,2,1};
        System.out.println(Arrays.toString(concate(nums)));
    }
    static int[] concate(int[] nums){
        int[] ans=new int[nums.length*2];
        int pos=0;
        while(pos!=ans.length){
            for (int i = 0; i < nums.length; i++) {
                ans[pos]=nums[i];
                pos++;
            }
        }
        return ans;
    }
}
