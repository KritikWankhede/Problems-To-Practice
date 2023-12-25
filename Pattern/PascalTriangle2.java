package Pattern;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        long start=1;
        ArrayList<Integer> list=new ArrayList<>();
        list.add((int) start);
        for (int i = 0; i < num; i++) {
            start*=(num-i);
            start/=(i+1);
            list.add((int)start);
        }
        System.out.println(list);
    }
}
