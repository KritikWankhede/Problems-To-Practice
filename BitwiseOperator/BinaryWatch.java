package BitwiseOperator;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryWatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(readBinaryWatch(num));
    }
    static ArrayList<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> list=new ArrayList<>();
        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                if(Integer.bitCount(h)+Integer.bitCount(m)==turnedOn){
                    list.add(String.format("%d:%02d",h,m));
                }
            }
        }
        return list;
    }
}
