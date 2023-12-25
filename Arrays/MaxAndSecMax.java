package Arrays;

public class MaxAndSecMax {
    public static void main(String[] args) {
        int[] num={3,5,4,5};
        int max=0;
        int smax=0;
        for (int j : num) {
            if (j >= max) {
                smax = max;
                max = j;
            } else if (j > smax) {
                smax = j;
            }
        }
        System.out.println((max-1)*(smax-1));
    }
}
