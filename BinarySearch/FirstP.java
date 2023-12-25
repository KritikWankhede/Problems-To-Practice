package BinarySearch;

public class FirstP {
    public static void main(String[] args) {
        int[] arr={1,5,6,10,12,19,25,28};
        int target=12;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[]arr,int item)
    {
        int start=0;
        int  end=arr.length-1;
        boolean isAsc=(arr[start]<arr[end]);

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==item)return mid;
            if (isAsc) {
                if (arr[mid] > item) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
            else {
                if (arr[mid] > item) {
                    start=mid+1;
                } else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
