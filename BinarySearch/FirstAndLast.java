package BinarySearch;
import java.util.Arrays;
public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int[] ans=search(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] search(int[] nums,int item)
    {
        int[] ans={-1,-1};
        ans[0]=searchRange(nums,item,true);
        if (ans[0]!=-1) {
            ans[1]=searchRange(nums,item,false);
        }
        return ans;
    }
    static int searchRange(int[] nums,int item,boolean findStart)
    {
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<item)
            {
               start=mid+1;
            }
            else if(nums[mid]>item) {
                end=mid-1;
            }
            else
            {
                ans=mid;
                if(findStart)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
      return ans ;
    }
}
