package FlowOfProgram;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size,num,count=0;
        boolean flag=true;
        System.out.println("Enter the size of array:-");
        size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array:-");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched:-");
        num=sc.nextInt();
        for (int s:arr) {
            if(s==num){
               flag=false;
                break;
            }
            count++;
        }
        if(!flag) System.out.println("Element found at position:-"+(count+1));
        else System.out.println("Element is not present in array.");
    }
}
