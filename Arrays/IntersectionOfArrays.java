package Arrays;

import java.util.Arrays;

public class IntersectionOfArrays {
    public static void main(String[] args) {
         int[] num1={1,2,2,1};
         int[] num2={2,2};
        System.out.println(Arrays.toString(intersection(num1,num2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        int[] res=new int[2];
        int large=0,k=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(k<2 && large!=nums2[j] && nums1[i]==nums2[j]){
                    res[k]=nums2[j];
                    large=nums2[j];
                    k++;
                }
            }
        }
        if(res[0]==res[1]){
           return new int[] {res[0]};
        }
        return res;
    }
}
