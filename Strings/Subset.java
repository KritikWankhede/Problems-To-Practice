package Strings;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr={1,2,3};
         List<List<Integer>> ans=subSet(arr);

        for (List<Integer> list:ans) {
            System.out.println(list);
        }

    }
    static List<List<Integer>> subSet(int[] nums){
        List<List<Integer>> set=new ArrayList<>();
        set.add(new ArrayList<>());
        for (int num: nums) {
            int n=set.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal=new ArrayList<>(set.get(i));
                internal.add(num);
                set.add(internal);
            }
        }
        return set;
    }
}
