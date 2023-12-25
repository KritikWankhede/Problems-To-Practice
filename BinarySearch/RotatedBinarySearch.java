package BinarySearch;
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums={2,4,6,7,0,1};
        System.out.println(findPivot(nums));
        int target=6;
        System.out.println(itemSearch(nums,target));
    }
    static int itemSearch(int[] nums, int item){
        int pivot=findPivot(nums);
        if(pivot==-1)
        {
            return binarySearch(nums,item,0,nums.length-1);
        }
        if(nums[pivot]==item){
            return pivot;
        }
        if(nums[0]>item){
           return binarySearch(nums,item,pivot+1,nums.length-1);
        }
        return binarySearch(nums,item,0,pivot);
    }
    static int binarySearch(int[] nums,int item,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>item){
                end=mid-1;
            }
            else if(nums[mid]<item){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

     static int findPivot(int[] nums)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]>nums[mid+1] && mid<end){
               return mid;
            }
             else if(nums[mid]<nums[mid-1] && mid>start){
             return mid-1;
            }
             else if (nums[mid]<=nums[start]) {
                 end=mid-1;
            }
             else{
                start=mid+1;
            }
        }
        return -1;
    }
}
