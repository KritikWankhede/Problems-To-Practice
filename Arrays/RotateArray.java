package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr,3);
    }
    static public void rotate(int[] nums, int k) {
        int count=0;
        for(int i=nums.length-1;i>0 && count<k ;i--) {
            int temp=nums[i];
            nums[i]=nums[i-1];
            nums[i-1]=temp;
            if(i==1){
                count++;
                i=nums.length;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

}
