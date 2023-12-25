package Ganit;
import java.util.ArrayList;
import java.util.Scanner;
public class GrayCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(grayCode(num));
    }
    static ArrayList<Integer> grayCode(int n) {
        System.out.println("n = "+n);
        ArrayList<Integer> result = new ArrayList<>();
        if(n == 0) {
            result.add(0);
            System.out.println("result = " + result);
            return result;
        }
        ArrayList<Integer> prevCode = grayCode(n - 1);
        System.out.println("prevCode = " + prevCode);
        result.addAll(prevCode);
        for(int i = prevCode.size() - 1; i >= 0; i--) {
            result.add(prevCode.get(i) + (1 << (n - 1)));
        }
        System.out.println("result = " + result);
        return result;
    }
}
