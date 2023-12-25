package BitwiseOperator;
public class FlipImage {
    public static void main(String[] args) {
        int[][] arr={{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans=flip(arr);
        for(int i = 0; i < ans.length; i++) {
            for(int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] flip(int[][] image){
        for (int[] row:image) {
            for (int i = 0; i < (image[0].length+1)/2; i++) {
                int temp=row[i]^1;
                row[i]=row[image[0].length-i-1]^1;
                row[image[0].length-i-1]=temp;
            }

        }
        return image;
    }
}
