package FlowOfProgram;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(isLeapYear(year)){
            System.out.println(year+" is leap year");
        }
        else{
            System.out.println(year+" is not leap year");
        }
    }
    static boolean isLeapYear(int year){
        if(year%4==0){
            if(year%100==0){
                return ((year % 400) == 0);
            }
            else {
                return true;
            }
        }
        return false;
    }
}
