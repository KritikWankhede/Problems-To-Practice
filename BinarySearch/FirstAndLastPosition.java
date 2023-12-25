package BinarySearch;
import java.util.Arrays;
public class FirstAndLastPosition {
    public static void main(String[] args) {
         int[] num={5,7,7,8,8,10};
         System.out.println(Arrays.toString(searchRange(num,8)));
    }
   static int[] searchRange(int[] nums, int target) {
       int start=0,end=nums.length-1;
       int large=0,small= nums.length-1;
       int[] ans={-1,-1};
       while(start<=end){
           int mid=start+(end-start)/2;
           if(nums[mid]==target){
               if(mid>=large){
                   large=mid;
                   ans[1]=mid;
               }
               if(mid<=small){
                   small=mid;
                   ans[0]=small;
               }
               end--;
           }
           else if(nums[mid]<target){
               start=mid+1;
           }
           else {
               end = mid - 1;
           }
       }
       return ans;
   }
}
