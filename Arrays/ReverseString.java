package Arrays;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s={'H','e','l','l','o'};
        reverse(s);
    }
    static void reverse(char[] s){
//       String[] str=new String[s.length];
        for (int i = s.length-1; i >=0 ; i--) {
            if(i==s.length-1) {
                System.out.print("["+s[i]+" ");
            }
            else if(i==0) {
                System.out.print(s[i]+"]");
            }
            else {
                System.out.print(s[i]+" ");
            }
        }
    }
}
