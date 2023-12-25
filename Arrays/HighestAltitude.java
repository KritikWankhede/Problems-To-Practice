package Arrays;

import java.util.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
         int[] arr={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
    static int largestAltitude(int[] gain) {
        int large=0;
        int[] ans=new int[gain.length+1];
        ans[0]=0;
        for(int i=0;i<gain.length;i++){
            for(int j=i+1;j<ans.length;j++){
                ans[j]=ans[i]+gain[i];
            }
        }
        System.out.println(Arrays.toString(ans));
        for(int i=0;i<ans.length;i++){
            if(large<ans[i]){
                large=ans[i];
            }
        }
        return large;
    }
}
