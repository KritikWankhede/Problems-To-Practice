package BitwiseOperator;

import java.util.Scanner;

public class AlternateBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(hasAlternatingBits(num));
    }
    static boolean hasAlternatingBits(int n) {
      String str=Integer.toBinaryString(n);
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i)==str.charAt(i+1))
                return false;
        }
        return true;
    }
}
