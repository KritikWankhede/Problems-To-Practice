package SORTING;
import java.util.ArrayList;
import java.util.List;
import static SORTING.InsertionSort.swap;
public class DisapperedInArray {
    public static void main(String[] args) {
       int[] arr={4,3,2,3,2,7,8,1};
       cyclic(arr);
       List <Integer> ans=getAnswer(arr);
        System.out.println(ans);
    }

    private static List<Integer> getAnswer(int[] arr) {
        List<Integer> ans=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }

    static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if( arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }
}
