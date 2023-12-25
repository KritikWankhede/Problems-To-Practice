package BitwiseOperator;

public class SumOfSubsetXor {
    public static void main(String[] args) {
        int[] num={3,4,5,6,7,8};
        System.out.println(subsetXORSum(num));
    }
    static int subsetXORSum(int[] nums) {
        int sum=0,all=0;
        if(nums.length>2) {
            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i];
                all = all ^ nums[i];
            }
            sum = sum + all;
        }
        else{
            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                sum=sum+(nums[i]^nums[j]);
            }
        }

        return sum;
    }
}
