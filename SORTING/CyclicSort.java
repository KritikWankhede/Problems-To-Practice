package SORTING;
//import java.util.Arrays;

import static SORTING.InsertionSort.swap;
public class CyclicSort {
    public static void main(String[] args) {
       int arr[]={1,0,5,4,2};

       cyclic(arr);
       int ans=check(arr);
       System.out.println(ans);
       // System.out.println(Arrays.toString(arr));
    }

    private static int check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i)
            {
                return i;
            }
        }
        return arr.length;
    }

    static void cyclic(int[] arr){
        int i=0;
        while (i<arr.length) {
            int correct = arr[i] ;
            if (arr[i]<arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
}
