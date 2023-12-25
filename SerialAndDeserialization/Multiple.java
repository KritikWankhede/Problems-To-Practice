package SerialAndDeserialization;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> list = new ArrayList<>();
//            while (true) {
//                Student obj = new Student();
//                obj.num = sc.nextInt();
//                obj.rollno = sc.nextInt();
//                obj.name = sc.next();
//                list.add(obj);
//                System.out.println("Do you want to add more:-");
//                String ch = sc.next();
//                if (ch.equalsIgnoreCase("no")) {
//                    break;
//                }
//
//            }
            list.add("1");
            list.add("Ankur");
            FileOutputStream file = new FileOutputStream("C:\\Users\\kriti\\OneDrive\\Documents\\MultiSerial.xml");
            XMLEncoder encoder=new XMLEncoder(file);
            encoder.writeObject(list);

            encoder.close();
            file.close();
            System.out.println("Serialization Completed");

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
