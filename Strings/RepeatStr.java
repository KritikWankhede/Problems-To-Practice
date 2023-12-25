package Strings;

public class RepeatStr {
    public static void main(String[] args) {
        String str="ababdc";
        String doub=str+str;
        String sub=doub.substring(1,doub.length()-1);

        System.out.println(sub.contains(str));

    }
}
