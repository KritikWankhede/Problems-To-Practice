package ProblemBacktracking;
public class N_Queens {
    public static void main(String[] args) {
        int length=4;
        boolean[][] board=new boolean[length][length];
        System.out.println(queens(board,0));
    }
    static int queens(boolean[][] board,int rows){
        if(rows==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for (int cols = 0; cols < board.length; cols++) {
            if(isSafe(board,rows,cols)){
                board[rows][cols]=true;
                count=count+queens(board,rows+1);
                board[rows][cols]=false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] board,int rows,int cols){
        for (int i = 0; i <rows ; i++) {
            if(board[i][cols]){
                return false;
            }
        }
        int maxLeft=Math.min(rows,cols);
        for (int i = 1; i <=maxLeft ; i++) {
            if(board[rows-i][cols-i]){
                return false;
            }
        }
        int maxRight=Math.min(rows, board.length-cols-1);
        for (int i = 1; i <=maxRight ; i++) {
            if(board[rows-i][cols+i]){
                return false;
            }
        }
        return true;
    }
    static void display(boolean[][] board){
        for (boolean[] rows:board) {
            for(boolean element:rows){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
