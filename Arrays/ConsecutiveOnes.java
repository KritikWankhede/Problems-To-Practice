package Arrays;
public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int count=0,large=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1 ){
                count++;
            }
            else{
                    large=Math.max(large,count);
                    count=0;
                }
            }
        large=Math.max(large,count);
        return large;
    }
}
