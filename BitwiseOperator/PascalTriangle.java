package BitwiseOperator;

import java.util.Scanner;
/*
Pascal Triangle:-
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
 */
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=1<<num-1;
        System.out.println(ans);

    }
}
