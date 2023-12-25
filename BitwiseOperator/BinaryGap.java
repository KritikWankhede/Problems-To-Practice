package BitwiseOperator;

import java.util.Scanner;

public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap obj=new BinaryGap();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(obj.binaryGap(num));
    }
    public int binaryGap(int n) {
        int maxGap = 0;
        int lastOne = -1;
        int i = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                if (lastOne != -1) {
                    maxGap = Math.max(maxGap, i - lastOne);
                }
                lastOne = i;
            }
            i++;
            n >>= 1;
        }
        return maxGap;
    }
}
