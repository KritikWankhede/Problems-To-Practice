package SORTING;

import java.util.Arrays;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] arr={4,2,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        int ans=check(arr);
        System.out.println(ans);
    }
    static void sort(int[] num) {
        int i = 0;
        while (i < num.length) {
            int correct = num[i] - 1;
            if (num[i] != num[correct]) {
                swap(num, i, correct);
            } else {
                i++;
            }
        }
    }
    static int check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) {
                return arr[i];
            }
        }
        return -1;
    }
    static void swap(int[] arr,int start,int last){
        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }


}
