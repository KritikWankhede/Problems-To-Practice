package Strings;

public class Big3Digit {
    public static void main(String[] args) {
          String str="90660";
//      //  long num=Long.parseLong(str);
//        int start=0;
//        int end=3;
//        int num=0;
//        String ans="";
//        while(end<=str.length()){
//            int num1=Integer.parseInt(str.substring(start,end));
//            if(check(num1) && num<num1){
//                num=num1;
//                end+=2;
//                start+=2;
//            }
//            start++;
//            end++;
//        }
//        if(num!=0){
//            ans=String.valueOf(num);
//        }
//        System.out.println(ans);
        int start=0;
        int end=3;
        String ans="";
        int num=0;
        while(end<=str.length()) {
            String sub=str.substring(start,end);
            if(check(sub)){
                if(num<=Integer.parseInt(sub)){
                    ans=sub;
                    num=Integer.parseInt(sub);
                    end+=2;
                    start+=2;
                }
            }
            start++;
            end++;
        }
        System.out.println(ans);
    }
    public static boolean check(String num){
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(1)!=num.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
