package SORTING;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
       int arr[]={5,2,1,3,6};
       selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int max=getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getMaxIndex(int arr[],int start,int last){
        int max=start;
        for (int i = start; i <=last; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
       return max;
    }
    static void swap(int arr[],int start,int last){
        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;

    }
}
