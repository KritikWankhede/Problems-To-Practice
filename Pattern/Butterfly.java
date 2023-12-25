package Pattern;
/*
 *             *
 * *         * *
 * * *     * * *
 * * * * * * * *
 * * *     * * *
 * *         * *
 *             *
 */
public class Butterfly {
    public static void main(String[] args) {
        int num = 4;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int space = 2*num-2*i; space>0; --space) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <=num ; i++) {
            for (int j = num; j >i ; j--) {
                System.out.print("* ");
            }
            for (int space =0; space <2*i ; space++) {
                System.out.print("  ");
            }
            for (int j = num; j >i ; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

