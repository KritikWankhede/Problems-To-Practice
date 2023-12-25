package FlowOfProgram;
import java.util.Scanner;
import static java.lang.System.*;

public class LargestOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(in);
         int size,large=0,sclarge=0;
        out.println("Enter the number of numbers to be entered:-");
        size=sc.nextInt();
        int[] num=new int[size];
        for (int i=0;i<num.length;i++)
        {
            num[i]=sc.nextInt();
        }
        for (int j : num) {
            if (large < j) {
                sclarge = large;
                large = j;
            }
            else if(sclarge<j) {
                sclarge=j;

            }
        }
        out.println("Largest number and second largest:-"+large+" "+sclarge);
    }
}