package Ganit;
import java.util.Scanner;

public class ExcelColumnSheet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(convertToTitle(num));
    }
    static String convertToTitle(int columnNumber) {
       StringBuilder list=new StringBuilder();
       while(columnNumber!=0){
           --columnNumber;
           int mod=columnNumber%26;
           list.append((char)('A'+mod));
           columnNumber/=26;
       }
       list.reverse();

       return list.toString();
    }
}
