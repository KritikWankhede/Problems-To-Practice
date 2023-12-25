package ProjectIntern;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;
import java.util.Properties;
import java.util.Scanner;
public class ChatBot {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Hello! How can I assist you today?");
        System.out.println("You can ask me about the system, OS, RAM, storage, or check your mail notifications.");

        while (true) {
            System.out.print("User: ");
            String input = sc.nextLine();
            String response = getBotResponse(input.toLowerCase());
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;
            }
            System.out.println("Chatbot: " + response);

        }

        sc.close();
    }

    public static String getBotResponse(String input) {
        if (input.contains("system")) {
            return "This is a chatbot running on Java.";
        }
        else if (input.contains("os")) {
            String osName = System.getProperty("os.name");
            String osVersion = System.getProperty("os.version");
            return "Operating System: " + osName + " " + osVersion;
        }
        else if (input.contains("ram")) {
            long totalMemory = Runtime.getRuntime().totalMemory();
            long freeMemory = Runtime.getRuntime().freeMemory();
            long usedMemory = totalMemory - freeMemory;
            return "RAM Information:\nTotal: " + totalMemory + " bytes\nUsed: " + usedMemory + " bytes\nFree: " + freeMemory + " bytes";
        }
        else if (input.contains("storage")) {
            long totalSpace = java.nio.file.FileSystems.getDefault().getPath("/").toFile().getTotalSpace();
            long freeSpace = java.nio.file.FileSystems.getDefault().getPath("/").toFile().getFreeSpace();
            long usedSpace = totalSpace - freeSpace;
            return "Storage Information:\nTotal: " + totalSpace + " bytes\nUsed: " + usedSpace + " bytes\nFree: " + freeSpace + " bytes";
        }
        else if (input.contains("mail")) {
            String mailNotifications = checkMail();
            return "Checking mail and displaying notifications...";

        }
        else {
            return "I'm sorry, I didn't understand your request.";
        }
    }
    public static String checkMail() {

        String host = "smtp.gmail.com";
        System.out.println("Enter your mail username and Password:-");
        String username = sc.next();
        String password = sc.next();

        String notifications = "";

        try {
            // Set up mail properties
            Properties properties = new Properties();
            properties.setProperty("mail.store.protocol", "imaps");

            // Connect to the mail server
            Session session = Session.getInstance(properties);
            Store store = session.getStore();
            store.connect(host, username, password);

            // Open the INBOX folder
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);

            // Get the messages
            Message[] messages = inbox.getMessages();

            for (Message message : messages) {
                String subject = message.getSubject();
                String from = message.getFrom()[0].toString();

                notifications += "From: " + from + "\nSubject: " + subject + "\n\n";
            }

            // Close the connections
            inbox.close(false);
            store.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return notifications;
    }
}


