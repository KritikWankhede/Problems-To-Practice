package Strings;
import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
          // subset("","abc");
           System.out.println(subSeq("","abc"));
           System.out.println(subAscii("","abc"));
    }
    static  void subset(String sub,String str){
        if(str.isEmpty()){
            System.out.println(sub);
            return ;
        }
        char ch=str.charAt(0);
        subset(sub,str.substring(1));
        subset(ch+sub,str.substring(1));
    }
    static ArrayList<String> subSeq(String sub,String str){
        if(str.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(sub);
            return list;
        }
        char ch=str.charAt(0);
        ArrayList<String> left=subSeq(ch+sub,str.substring(1));
        ArrayList<String> right=subSeq(sub,str.substring(1));
        left.addAll(right);
        return left;
    }
    static ArrayList<String> subAscii(String sub,String str){
        if(str.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(sub);
            return list;
        }
        char ch=str.charAt(0);
        ArrayList<String> first=subAscii(ch+sub,str.substring(1));
        ArrayList<String> second=subAscii(sub,str.substring(1));
        ArrayList<String> third=subAscii(sub+(ch+0),str.substring(1) );
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
