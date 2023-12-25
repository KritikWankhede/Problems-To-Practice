package Strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        //throwCombination("",4);
        System.out.println(throwCombinationRet("",4));
    }
    static void throwCombination(String sub,int number){
         if(number==0){
             System.out.println(sub);
             return;
         }
        for (int i = 1; i <=6 && i<=number ; i++) {
            throwCombination(sub+i,number-i);
        }
    }
    static ArrayList<String> throwCombinationRet(String sub, int number){
        if(number==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(sub);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 1; i <=6 && i<=number ; i++) {
            ans.addAll(throwCombinationRet(sub+i,number-i));
        }
        return ans;
    }
}
