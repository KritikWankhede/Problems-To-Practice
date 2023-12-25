package SerialAndDeserialization;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Deserialize {
    public static void main(String[] args){
        Emp emp;
        try {
            FileInputStream file=new FileInputStream("C:\\Users\\kriti\\OneDrive\\Documents\\Serial.txt");
            ObjectInputStream in=new ObjectInputStream(file);
            emp=(Emp) in.readObject();
            in.close();
            file.close();
            System.out.println("Deserialized File");
            System.out.println(emp.name);
            System.out.println(emp.address);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
