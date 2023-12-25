package Arrays;

import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        if(sentence.length()>25){
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < sentence.length(); i++) {
                char c = Character.toLowerCase(sentence.charAt(i));
                if (c >= 'a' && c <= 'z') {
                    set.add(c);
                }
            }
            return set.size() == 26;
        }
        return false;
    }
}
