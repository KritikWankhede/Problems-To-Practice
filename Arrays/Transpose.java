package Arrays;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] num={{1,2,3},{4,5,6}};
        int[][] ans=reverse(num);
        for (int[] i: ans) {
            System.out.println(Arrays.toString(i));
        }
    }
    static int[][] reverse(int[][] num){
        int[][] mat=new int[num[0].length][num.length];
        for (int i = 0; i <num.length; i++) {
            for (int j = 0; j <num[i].length; j++) {
                mat[j][i]=num[i][j];
            }
        }
        return mat;
    }
}
