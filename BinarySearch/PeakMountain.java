package BinarySearch;
public class PeakMountain {
    public static void main(String[] args) {
        int[] arr={0,6,7,9,4,2,1};
        System.out.println(bitonicArray(arr));
    }
    static int bitonicArray(int[] nums){
        int start=0;
        int end=nums.length-1;
        if(nums.length<3) {
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]>nums[mid+1]) {
               end=mid-1;
            }
            else
            {
               start=mid+1;
            }
        }
        return start;
    }
}
