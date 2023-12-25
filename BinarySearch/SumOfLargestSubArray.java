package BinarySearch;
public class SumOfLargestSubArray {
    public static void main(String[] args) {
        int[] nums={2,5,7,10,8};

    }
    public  int splitArray(int[] num,int m){
        int start=0,end=0;
        for (int i=0;i<num.length;i++){
            start=Math.max(start,num[i]);
            end+=num[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for (int nums:num) {
                if(sum+nums>mid){
                    sum=nums;
                    pieces++;
                }
                else{
                    sum+=nums;
                }
            }
            if(pieces>m){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
}
