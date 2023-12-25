package ProjectIntern;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Username and Password:-");
        String username=sc.next();
        String password=sc.next();

        System.out.println("Enter your account username and password:-");
        String inputUsername=sc.next();
        String inputPassword=sc.next();
        Check_SQL verification=new Check_SQL(password,username,inputPassword,inputUsername);
        verification.verify();

    }
}
