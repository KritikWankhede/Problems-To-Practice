package Strings;
import java.util.ArrayList;
import java.util.Scanner;
public class SimplifyPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> ans =new ArrayList<>();
        String path=sc.nextLine();
        int i=0;
        while(i<path.length()){
            if(path.charAt(i)=='/' && path.charAt(i+1)=='/'){
                ans.add(String.valueOf(path.charAt(i)));
                i++;
            }
            else if(path.charAt(i)=='/' && path.charAt(i+1)=='"'){
                ans.add(String.valueOf(path.charAt(i+1)));
                i++;
            }
            else if(path.charAt(i)=='.' && path.charAt(i+1)=='.'){
                ans.add(String.valueOf(path.charAt(path.length()-1)));
                i++;
                break;
            }
            else{
                ans.add(String.valueOf(path.charAt(i)));
            }
            i++;
        }
        StringBuffer sb = new StringBuffer();
        for (String s : ans) {
            sb.append(s);
        }
        String answer =sb.toString();
        System.out.println(answer);
    }
}
/*

    public String simplifyPath(String path) {
        Deque<String> dirOrFiles = new ArrayDeque<>();
        for (String dirOrFile : path.split("/")) {
            if (!dirOrFiles.isEmpty() && dirOrFile.equals("..")) {
                dirOrFiles.removeLast();
            } else if (!dirOrFile.equals(".") && !dirOrFile.equals("") && !dirOrFile.equals("..")) {
                dirOrFiles.addLast(dirOrFile);
            }
        }
        StringBuilder simplified_path = new StringBuilder();
        for (String dirOrFile : dirOrFiles) {
            simplified_path.append("/").append(dirOrFile);
        }
        return simplified_path.length() == 0 ? "/" : simplified_path.toString();
    }

 */