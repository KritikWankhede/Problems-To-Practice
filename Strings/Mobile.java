package Strings;
import java.util.ArrayList;
public class Mobile {
    public static void main(String[] args) {
       // dialPad("","12");
        System.out.println(dialPadRet("","12"));
    }
    public static void dialPad(String sub,String str){
        if(str.isEmpty()){
            System.out.println(sub);
            return;
        }
        int digit =str.charAt(0)-'0';
        for (int i = (digit-1)*3; i <digit*3; i++) {
               char ch=(char)('a'+i);
               dialPad((sub+ch),str.substring(1));
        }
    }
    public static ArrayList<String> dialPadRet(String sub, String str){
        if(str.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(sub);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        int digit =str.charAt(0)-'0';
        for (int i = (digit-1)*3; i <digit*3; i++) {
            char ch=(char)('a'+i);
            ans.addAll(dialPadRet(sub+ch,str.substring(1)));
        }
        return ans;
    }
}
