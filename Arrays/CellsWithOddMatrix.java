package Arrays;

import java.util.Arrays;

public class CellsWithOddMatrix {
    public static void main(String[] args) {
        int[][] indices={{0,1},{1,1}};
        System.out.println(oddCells(2,3,indices));
    }
    static int oddCells(int m, int n, int[][] indices) {
        int[][] ans=new int[m][n];
        int count=0;
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[i].length; j++) {
                   if(i==indices[i][j] || j==indices[i][j]){
                       ans[i][j]+=1;
                   }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
                return count;
    }
}
