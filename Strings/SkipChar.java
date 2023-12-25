package Strings;
public class SkipChar {
    public static void main(String[] args) {
        System.out.println(skip("abccaadfghaj"));
        System.out.println(skipApp("javaapplet"));
        System.out.println(skipString("appleadaykeepsdoctoraway"));
    }
    static String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch=str.charAt(0);
        if(ch=='a'){
            return skip(str.substring(1));
        }
        else {
            return ch+skip(str.substring(1));
        }
    }
    /*\
    skip a string from string
     */
    static String skipString(String str){
        if(str.isEmpty()) return "";
        if(str.startsWith("apple")){
            return skipString(str.substring(5));
        }
        else{
            return str.charAt(0)+skipString(str.substring(1));
        }
    }
    /*
    skip if it does not meets requirements
     */
    static String skipApp(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app")  && !str.startsWith("apple")){
            return skipApp(str.substring(3));
        }
        else{
            return str.charAt(0) +skipApp(str.substring(1));
        }
    }
}
