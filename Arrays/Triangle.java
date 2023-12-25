package Arrays;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
       List<List<Integer>> list=new ArrayList<>(List.of(
               new ArrayList<>(List.of(2)),
               new ArrayList<>(List.of(3,4)),
               new ArrayList<>(List.of(6,5,7)),
               new ArrayList<>(List.of(4,1,8,3))
       ));

       System.out.println(list);
       System.out.println(minimumTotal(list));

    }
    static int minimumTotal(List<List<Integer>> triangle) {
        int sum=0;
        for (int i = 0; i <triangle.size() ; i++) {
            int num= (triangle.get(i).size()-1)/2;
            sum=sum+(int)triangle.get(i).get(num);
        }
        return sum;
    }
}
