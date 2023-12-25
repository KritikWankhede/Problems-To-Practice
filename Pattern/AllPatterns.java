package Pattern;

import java.util.Scanner;

public class AllPatterns {
    public static void main(String[] args) {
        int nums;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows or cols:-");
        nums=sc.nextInt();

        pattern1(nums);
        System.out.println("----------------------");
        pattern2(nums);
        System.out.println("----------------------");
        pattern3(nums);
        System.out.println("----------------------");
        pattern4(nums);
        System.out.println("----------------------");
        pattern5(nums);
        System.out.println("----------------------");
        pattern6(nums);
        System.out.println("----------------------");
        pattern7(nums);
        System.out.println("----------------------");
        pattern8(nums);
        System.out.println("----------------------");
        pattern9(nums);
        System.out.println("----------------------");
        pattern10(nums);
        System.out.println("-----------------------");

    }
    /*
    *
    * *
    * * *
    * * * *
     */
    static void pattern1(int num){
        for (int rows = 0; rows < num; rows++) {
            for (int cols = 0; cols <rows+1; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    * * * *
    * * * *
    * * * *
    * * * *
     */
    static void pattern2(int num){
        for (int rows = 0; rows < num; rows++) {
            for (int cols = 0; cols <num ; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    * * * *
    * * *
    * *
    * *
     */
    static void pattern3(int num) {
        for (int rows = 0; rows < num; rows++) {
            for (int cols = 0; cols<num-rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    1
    1 2
    1 2 3
    1 2 3 4
     */
    static void pattern4(int num){
        for (int rows = 0; rows < num; rows++) {
            for (int cols = 0; cols <rows+1; cols++) {
                System.out.print((cols+1) + " ");
            }
            System.out.println();
        }
    }
    /*
    * 
    * *
    * * *
    * * * *
    * * *
    * *
    *
     */
     
    static void pattern5(int num){
        //you can also use int totalColsInRow= row>n ? 2*n-row: row;
        for (int rows = 0; rows < 2*num-1; rows++) {
            if(rows<num) {
                for (int cols = 0; cols < rows + 1; cols++) {
                    System.out.print("* ");
                }
            }
            else{
                for (int cols = 0; cols <(2*num-(rows+1)) ; cols++) {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
    /*
      *
     * *
    * * *
   * * * *
  * * * * *
   * * * *
    * * *
     * *
      *
     *
     */
    static void pattern6(int num) {
        //you can also use int totalColsInRow= row>n ? 2*n-row: row;
        for (int rows = 0; rows < 2*num-1; rows++) {
            if (rows < num) {
                for (int space = 0; space < num - (rows + 1); space++) {
                    System.out.print(" ");
                }
                for (int cols = 0; cols < rows + 1; cols++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int space = 0; space < rows - num + 1; space++) {
                    System.out.print(" ");
                }
                for (int cols = 0; cols < (2 * num - (rows + 1)); cols++) {
                    System.out.print("* ");
                }
            }
                System.out.println();
            }

        }
        /*
                 1
                212
               32123
              4321234
         */
        static void pattern7(int num){
            for (int rows = 1; rows <=num ; rows++) {
                for (int space = 0; space < num -rows; space++) {
                    System.out.print("  ");
                }
                for (int cols = rows; cols >0 ; cols--) {
                    System.out.print(cols+" ");
                }
                for (int cols = 2; cols <= rows; cols++) {
                    System.out.print(cols+" ");
                }

                System.out.println();
            }
        }
        /*
                   1
                 2 1 2
               3 2 1 2 3
             4 3 2 1 2 3 4
               3 2 1 2 3
                 2 1 2
                   1
         */
        static void pattern8(int num) {
            //you should use int totalColsInRow= row>n ? 2*n-row: row;
            for (int rows = 1; rows <= 2 * num - 1; rows++) {
                if (num >= rows) {
                    for (int space = 1; space <= num - rows; space++) {
                        System.out.print("  ");
                    }
                    for (int cols = rows; cols >0 ; cols--) {
                        System.out.print(cols+" ");
                    }
                    for (int cols = 2; cols <= rows; cols++) {
                        System.out.print(cols+" ");
                    }
                }
                else{
                    for (int spaces = 1; spaces <=rows-num ; spaces++) {
                        System.out.print("  ");
                    }
                    for (int cols = (2*num)-rows; cols >0; cols--) {
                        System.out.print(cols+" ");
                    }
                    for (int cols = 2; cols <=(2*num)-rows ; cols++) {
                        System.out.print(cols+" ");
                    }
                }
                System.out.println();
            }

        }
        /*
                4 4 4 4 4 4 4
                4 3 3 3 3 3 4
                4 3 2 2 2 3 4
                4 3 2 1 2 3 4
                4 3 2 2 2 3 4
                4 3 3 3 3 3 4
                4 4 4 4 4 4 4
         */
        static void pattern9(int num){
            //Brute force
//            for (int rows = 1; rows <=2*num-1 ; rows++) {
//                for (int cols = 1; cols <=2*num-1 ; cols++) {
//                    if(rows==1||rows==2*num-1||cols==1||cols==2*num-1){
//                        System.out.print(num+" ");
//                    }
//                    else if(rows==2||rows==2*num-2||cols==2||cols==2*num-2){
//                        System.out.print(num-1+" ");
//                    }
//                    else if(rows==3||rows==2*num-3||cols==3||cols==2*num-3){
//                        System.out.print(num-2+" ");
//                    }
//                    else{
//                        System.out.print(num-3+" ");
//                    }
//                }
//                System.out.println();
//            }
            for (int rows = 1; rows <=2*num-1 ; rows++) {
                int numCols=2*num;
                for (int cols = 1; cols <=2*num-1 ; cols++) {
                    int atEveryIndex=num+1-Math.min(Math.min(rows,cols),Math.min(numCols-rows,numCols-cols));
                    System.out.print(atEveryIndex+" ");
                }
                System.out.println();
        }
    }
    /*
    *             *
    * *         * *
    * * *     * * *
    * * * * * * * *
    * * *     * * *
    * *         * *
    *             *
     */
    static void pattern10(int num){
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


