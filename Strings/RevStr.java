package Strings;

public class RevStr {
    public static void main(String[] args) {
        String str="Let's take LeetCode contest";
        String[] gg=str.split(" ");
       // String[] ans= new String[gg.length];
//        for (int i = 0; i < gg.length; i++) {
//            StringBuilder rev;
//            rev=new StringBuilder(gg[i]);
//            ans[i]=rev.reverse().toString();
//        }
        StringBuilder ans=new StringBuilder();

        for (int i = 0; i <gg.length ; i++) {
            StringBuilder rev=new StringBuilder(gg[i]);
            ans.append(rev.reverse()+" ");
        }
        System.out.println(ans.toString().trim());
    }
}
