package BinarySearch;
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,19};
        int target=6;
        int ans= checkQuestionCeiling(arr,target);
        System.out.println("Ceiling of number is at index:-"+ans);
    }
    /* Ceiling of number is smallest number greatest or equal to target
    * Floor of number is greatest number smallest or equal to target   */
    static int checkQuestionCeiling(int[] arr, int item){
        int start=0;
        int end= arr.length-1;
        boolean isAsc=(arr[start]<arr[end]);
        if(item>arr[arr.length-1]){
            return -1;
        }
        while (start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==item)
            {
                return mid;
            }
            if(isAsc){
                if(arr[mid]>item){
                    end=mid-1;
                }
                else {
                   start=mid+1;
                }
            }
            else{
                if(arr[mid]<item){
                    end=mid-1;
                }
                else start=mid+1;
            }
        }
        return start;
    }
}
