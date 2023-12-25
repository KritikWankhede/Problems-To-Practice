package Pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalList {
    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>() ;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 0; i <num ; i++) {
            list.add(new ArrayList<>());;
        }
        for (int i = 0; i <num ; i++) {
            for (int j = 0; j < i; j++) {

            }
        }
    }
}
