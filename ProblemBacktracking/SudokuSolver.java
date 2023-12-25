package ProblemBacktracking;
public class SudokuSolver {
    public static void main(String[] args) {
         int[][] grid=new int[][]{
                 {3, 0, 6, 5, 0, 8, 4, 0, 0},
                 {5, 2, 0, 0, 0, 0, 0, 0, 0},
                 {0, 8, 7, 0, 0, 0, 0, 3, 1},
                 {0, 0, 3, 0, 1, 0, 0, 8, 0},
                 {9, 0, 0, 8, 6, 3, 0, 0, 5},
                 {0, 5, 0, 0, 9, 0, 6, 0, 0},
                 {1, 3, 0, 0, 0, 0, 2, 5, 0},
                 {0, 0, 0, 0, 0, 0, 0, 7, 4},
                 {0, 0, 5, 2, 0, 6, 3, 0, 0} };
         if(solve(grid)){
             display(grid);
         }
         else{
             System.out.println("Cannot display solution");
         }
    }
    static boolean solve(int[][] board){
        int n= board.length;
        int rows=-1,cols=-1;
        boolean empty=true;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==0){
                    rows=i;
                    cols=j;
                    empty=false;
                    break;
                }
            }
            if(!empty){
                break;
            }
        }
        if(empty){
            return true;
        }
        for (int i = 1; i <=9; i++) {
            if(isSafe(board,rows,cols,i)){
                board[rows][cols]=i;
                if(solve(board)){
                    return  true;
                }
                else{
                    board[rows][cols]=0;
                }
            }
        }
        return false;
    }
    static void display(int[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length ; j++) {
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] board,int rows,int cols,int num){
        for (int i = 0; i < board.length; i++) {
            if(board[rows][i]==num){
                return false;
            }
        }
        for(int i = 0; i < board.length; i++) {
            if(board[i][cols]==num){
                return false;
            }
        }
        int sqrt=(int)Math.sqrt(board.length);
        int sleft=rows-rows%sqrt;//for rows
        int sright=cols-cols%sqrt;//for column

        for (int i = sleft; i < sleft+sqrt; i++) {
            for (int j = sright; j < sright+sqrt; j++) {
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
}
