package Strings;

import java.util.ArrayList;

public class FindWords {
    public static void main(String[] args) {
       String chars = "atach";
       String[] str={"cat","bt","hat","tree"};
       int sum=0;
        for (String s : str) {
            if (check(s, chars)) {
                sum += s.length();
            }
        }
        System.out.println(sum);
    }
    static boolean check(String word, String target){
        ArrayList<Character> ch=new ArrayList<>();
        for (char c: target.toCharArray()) {
            ch.add(c);
        }
        for (char c: word.toCharArray()) {
            if(!ch.contains(c)){
                return false;
            }
        }
        return true;
    }

}
