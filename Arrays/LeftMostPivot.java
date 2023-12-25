package Arrays;

public class LeftMostPivot {
    public static void main(String[] args) {
         int[] nums={1,2,3};
        System.out.println(pivotIndex(nums));
    }
    static int pivotIndex(int[] nums) {
            if(nums.length==0){
                return -1;
            }
            int lsum=0,tsum=0;
            for (int i = 0; i <nums.length ; i++) {
            tsum=tsum+nums[i];
          }
            for (int i = 0; i < nums.length; i++) {
                if (lsum == tsum - nums[i]) {
                    return i;
                } else {
                    lsum += nums[i];
                    tsum -= nums[i];
                }
            }
            return -1;
    }

}
