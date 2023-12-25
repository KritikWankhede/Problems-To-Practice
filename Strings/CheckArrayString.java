package Strings;

public class CheckArrayString {
    public static void main(String[] args) {
        String[] one={"a","bc"};
        String[] two={"ab","c"};
        System.out.println(makeJoin(one).equals(makeJoin(two)));
//        boolean ans=String.join("",one).equals(String.join("",two));
//        System.out.println(ans);
    }
    public static String makeJoin(String[] str){
        StringBuilder s=new StringBuilder();
        for (String n: str) {
            s.append(n);
        }
        System.out.println(s);
        return s.toString();
    }


}
