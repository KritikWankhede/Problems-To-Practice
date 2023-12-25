package BitwiseOperator;
import java.util.Arrays;
import java.util.Scanner;
public class DecodeXor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int first=sc.nextInt();
        int[] encoded={6,2,7,3};
        System.out.println(Arrays.toString(decode(encoded,first)));
    }
    static int[] decode(int[] encoded, int first) {
        int[] arr=new int[encoded.length+1];
        arr[0]=first;
        for (int i = 0; i < encoded.length; i++) {
            arr[i+1]=arr[i]^encoded[i];
        }
        return arr;
    }
}
