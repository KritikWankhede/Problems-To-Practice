package SerialAndDeserialization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Serial  {
    public static void main(String[] args) {
        Emp emp=new Emp();
        emp.name="John Cena";
        emp.address="Boston";
        try{
            FileOutputStream file=new FileOutputStream("C:\\Users\\kriti\\OneDrive\\Documents\\Serial.txt");
            ObjectOutputStream out=new ObjectOutputStream(file);
            out.writeObject(emp);
            System.out.print("File is Serialized");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
