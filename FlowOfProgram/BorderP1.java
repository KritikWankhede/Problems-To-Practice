package FlowOfProgram;


import java.util.Scanner;

public class BorderP1 {
    public static void main(String[] args) {
        int rows, cols;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:-");
        rows=sc.nextInt();
        cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        System.out.println("Enter the numbers:-");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Pattern:-");
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < cols; j++) {
                if(i==0||i==rows-1||j==0||j==cols-1)
                    System.out.print(arr[i][j]+" ");
                else System.out.print("  ");
            }
            System.out.println();

        }
    }
}
