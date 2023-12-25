package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayFromRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        ArrayFromRange obj=new ArrayFromRange();
        System.out.println(Arrays.toString(obj.printPrime(arr)));
    }
    public int[] printPrime(int[] arr){
        int count = 0;
        int index=0;

        for(int value:arr)//forEach loop
        {
            count = 0;
            for(int i = 2; i*i <= value; i++)
            {
                if(value%i == 0)
                    count++;
            }
            if(count == 0 && value !=1) {
                index++;
            }
        }
        int[] ans=new int[index];
        index=0;
        for (int i = 0; i < arr.length; i++) {
            count=0;
            for (int j = 2; j*j <=arr[0] ; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            if(count==0 && arr[i]!=1 ){
                ans[index]=arr[i];
                index++;
            }
        }
        return ans;
    }
    }

