package BitwiseOperator;

public class LongestNiceSubString {
    public static void main(String[] args) {
        String s="dDzeE";
        System.out.println(longestNiceSubstring(s));
    }
    static String longestNiceSubstring(String s) {
        String res="";
        if(s.length()==2){
            if(s.charAt(0)==s.charAt(1)+32 || s.charAt(0)==s.charAt(1)-32){
                return s;
            }
            else{
                return res;
            }
        }
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)+32 || s.charAt(i)==s.charAt(i+1)-32 ||s.charAt(i-1)==s.charAt(i)+32 || s.charAt(i-1)==s.charAt(i)-32){
                res=res+s.charAt(i);
            }
        }
        return res;
    }
}
