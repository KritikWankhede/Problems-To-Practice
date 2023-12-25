package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums={2,3,5,6,8,10,12,13,15,18,20,23,25,30};
        int target=8;
        System.out.println(ans(nums,target));
    }
    static int ans(int[]arr,int item)
    {
        int start=0;
        int end=1;
        while(arr[end]<item)
        {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,item,start,end);

    }
    static int binarySearch(int[] nums,int item,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
           if(nums[mid]>item)
           {
               end=mid-1;
           } else if (nums[mid]<item){
               start=mid+1;
           }
           else
           {
               return mid;
           }
        }
        return -1;
    }

}
