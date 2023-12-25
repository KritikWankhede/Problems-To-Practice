package Strings;
import java.util.ArrayList;
public class Permutation {
    public static void main(String[] args) {
      // permutation("","abc");
       ArrayList<String> list=permutationRet("","abc");
        System.out.println(list);
    }
    static void permutation(String sub, String str){
        if(str.isEmpty()){
            System.out.println(sub);
            return;
        }
        char ch=str.charAt(0);
        for (int i = 0; i <=sub.length() ; i++) {
            String first=sub.substring(0,i);
            String second=sub.substring(i,sub.length());
            permutation(first+ch+second,str.substring(1));
        }
    }
    static ArrayList<String> permutationRet(String sub, String str){
        if(str.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(sub);
            return list;
        }
        char ch=str.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 0; i <=sub.length() ; i++) {
            String first=sub.substring(0,i);
            String second=sub.substring(i,sub.length());
            ans.addAll(permutationRet(first+ch+second,str.substring(1)));
        }
        return ans;
    }

}
