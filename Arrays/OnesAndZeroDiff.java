package Arrays;

import java.util.Arrays;

public class OnesAndZeroDiff {
    public static void main(String[] args) {
        int[][] grid={{0,1,1},{1,0,1},{0,0,1}};
        int m = grid.length;
        int n = grid[0].length;
        int[][] res = new int[m][n];
        int[] onesRow = new int[m];
        int[] onesCol = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                onesRow[i] += (grid[i][j] == 1) ? 1 : 0;
                onesCol[j] += grid[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = onesRow[i] + onesCol[j] - (m - onesRow[i]) - (n - onesCol[j]);
            }
        }

        for(int[] ans: res){
            System.out.print(Arrays.toString(ans));
            System.out.println();
        }


    }


}
