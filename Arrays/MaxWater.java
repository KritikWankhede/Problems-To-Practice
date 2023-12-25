package Arrays;
public class MaxWater {
    public static void main(String[] args) {
        int[] nums={1,2,4,8,7,9,1};
        System.out.println(maxArea(nums));
    }
    static int maxArea(int[] height) {
        int start=0;
        int end=height.length-1,large=0;
        while(start<end){
            int sum=0;
            if(height[start]>height[end]){
                sum=height[end]*(end-start);
                end--;
            }
            else{
                sum=height[start]*(end-start);
                start++;
            }
            if(large<sum){
                large=sum;
            }
        }
        return large;
    }
}
