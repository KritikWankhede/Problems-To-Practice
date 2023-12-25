package Arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] num={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(num)));
    }
   static int[] plusOne(int[] digits) {
       int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] num = new int [n + 1];
        num[0] = 1;
        return num;
    }
}
