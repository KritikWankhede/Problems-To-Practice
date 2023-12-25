package SORTING;
import static SORTING.InsertionSort.swap;
public class MissingPositive {
    public static void main(String[] args) {
        int[] arr={4,1,-1,3};
        System.out.println(getAnswer(arr));
    }

    private static int getAnswer(int[] arr) {
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{i++;}
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }
}
