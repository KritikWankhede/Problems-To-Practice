package ProjectIntern;


import java.sql.*;

public class Operations {
    public void transactionHistory(String url, String username, String password,String inputUsername){
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            String query="select * from transaction where username=? ORDER BY timestamp ASC";
            PreparedStatement preparedStatement= con.prepareStatement(query);
            preparedStatement.setString(1,inputUsername);
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
                System.out.println("Username:-"+rs.getString("username"));
                System.out.println("Activity:-"+rs.getString("activity"));
                System.out.println("Amount:-"+rs.getFloat("amount"));
                System.out.println("Balance:-"+rs.getFloat("balance"));
                System.out.println("Timestamp:-"+rs.getTimestamp("timestamp"));
                System.out.println("*-----------------------------------------------------------*");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void deposit(String url,String username,String password,float amount,String inputUser){
        try{
            Connection con=DriverManager.getConnection(url, username, password);
            float currentBalance=getBalance(con,inputUser);
            currentBalance += amount;
            updateBalance(con,inputUser,currentBalance);
            logTransaction(con,inputUser,"Deposit",amount,currentBalance);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static float getBalance(Connection con,String username){
        try{
            String query="Select amount from bankaccount where Name= ?";
            PreparedStatement preparedStatement=con.prepareStatement(query);
            preparedStatement.setString(1,username);
            ResultSet rs=preparedStatement.executeQuery();
            if(rs.next()){

                return rs.getFloat("amount");
            }
        }
        catch(Exception e){
          e.printStackTrace();
        }
        return (float)0.0;
    }
    public static void logTransaction(Connection con,String username,String activity,float amount,float balance){
        String query="INSERT INTO transaction(username,activity,amount,balance) values(?,?,?,?)";
        try{
            PreparedStatement preparedStatement=con.prepareStatement(query);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,activity);
            preparedStatement.setFloat(3,amount);
            preparedStatement.setFloat(4,balance);
            preparedStatement.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void updateBalance(Connection con,String username,float amount){
        String query="update bankaccount set amount =? where Name=?";
        try {
            PreparedStatement preparedStatement=con.prepareStatement(query);
            preparedStatement.setFloat(1,amount);
            preparedStatement.setString(2,username);
            preparedStatement.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void withdraw(Connection con,String username, float amount) {
        try  {
            // Get current balance from the database
            float currentBalance = getBalance(con,username);

            // Check if sufficient balance is available for withdrawal
            if (currentBalance >= amount) {
                // Calculate new balance after withdrawal
              currentBalance-=amount;

                // Update the balance in the database
                updateBalance(con, username, currentBalance);

                // Log the transaction
                logTransaction(con, username, "withdraw", amount,currentBalance);
            } else {
                System.out.println("Insufficient balance. Withdrawal failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}








