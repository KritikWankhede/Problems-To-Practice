package SORTING;
import java.util.ArrayList;
import java.util.List;

import static SORTING.InsertionSort.swap;
public class DupeInArray {
    public static void main(String[] args) {
        int[] arr={4,2,1,5,3,3,2,6};
        sort(arr);
        List <Integer> ans=getAnswer(arr);
        System.out.println(ans);
    }

    private static List<Integer> getAnswer(int[] arr) {
        List<Integer> ans=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }

}
