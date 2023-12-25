package Strings;

import java.util.Stack;

public class BackSpace {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        String s="ac##";
        String t="d#f#";
        System.out.println(check(s).equals(String.valueOf(check(t))));

    }
    static String check(String s){
        Stack<Character> st=new Stack<>();
        for (char c:s.toCharArray()) {
            if(c!='#'){
                st.push(c);
            }
            else if(!st.empty()){
                st.pop();
            }
        }
        return String.valueOf(st);
    }
}
