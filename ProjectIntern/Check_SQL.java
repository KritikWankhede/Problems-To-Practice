package ProjectIntern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Check_SQL {
    static Operations op=new Operations();
    static Scanner sc=new Scanner(System.in);
    static String url="jdbc:mysql://localhost:3306/bank";
    static String username;
    static String password;

    static String inputUsername;
    static String inputPassword;
    public Check_SQL(String password,String username,String inputPassword,String inputUsername){
        this.password=password;
        this.username=username;
        this.inputPassword=inputPassword;
        this.inputUsername=inputUsername;
    }


    public void verify(){
          try{
              Connection con= DriverManager.getConnection(url,username,password);
              String query = "SELECT * FROM bankaccount WHERE Name = ? AND password = ?";

              PreparedStatement preparedStatement = con.prepareStatement(query);
              preparedStatement.setString(1, inputUsername);
              preparedStatement.setString(2, inputPassword);
              ResultSet resultSet = preparedStatement.executeQuery();

              if (resultSet.next()) {
                  System.out.println("Username and password are valid. Access granted.");
                  operations_performed(con);
                  // Perform other operations for the ATM interface
              } else {
                  System.out.println("Invalid username or password. Access denied.");
                  // Display an error message or take appropriate action
              }

              resultSet.close();
              preparedStatement.close();
          }
          catch(Exception e){
              System.out.println("There is some Problem\nApologies for the Inconvenience\nTRY AGAIN LATER.");
              e.printStackTrace();
          }
      }
      public static void operations_performed(Connection con){
          char ch='n';
          while(ch!='y'){
              System.out.println("Select options to be performed from the following:-\n1.Transaction History\n2.Deposit\n3.Withdraw\n4.Check Balance\n5.Exit");
              int choice=sc.nextInt();
              switch (choice) {
                  case 1 -> {
                      op.transactionHistory(url, username, password,inputUsername);
                  }
                  case 2 -> {
                      System.out.println("Enter amount to be deposited :-");
                      float amount = sc.nextFloat();
                      op.deposit(url, username, password, amount,inputUsername);
                  }
                  case 3 -> {
                      System.out.println("Enter amount to be withdraw:-");
                      float amountwithdraw = sc.nextFloat();
                      op.withdraw(con, inputUsername, amountwithdraw);
                      System.out.println("You current balance is:-"+op.getBalance(con,inputUsername));
                  }
                  case 4 -> {
                      float ans=op.getBalance(con, inputUsername);
                      System.out.println("You current balance is:-"+ans);
                  }
                  case 5 -> {
                      System.out.println("Do you want to exit?\nYes 'y' or NO 'n'");
                      ch = sc.next().charAt(0);
                  }
                  default -> System.out.println("Choose appropriately from above options");
              }


          }
      }
}

