package Strings;

import java.util.Scanner;

public class LargestOddInString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String num= sc.next();
        char[] s=num.toCharArray();
        String ans="";
        if(getEnd(s)>-1){
            ans=num.substring(0,getEnd(s)+1);
        }
        System.out.println(ans);
    }
    static boolean checkOdd(char num){
        return Integer.parseInt(String.valueOf(num)) % 2 != 0;
    }

    static int getEnd(char[] s){
        int count=0;
        for (int i = s.length-1; i >=0; i--) {
            if(checkOdd(s[i])){
                return i;
            }
        }
        return count;
    }
}
