package Arrays;
import java.util.Arrays;
public class ChildrenCookie {
    public static void main(String[] args) {
        int[] g={1,2,3};
        int[] s={1,1};
        System.out.println(findContentChildren(g,s));
    }
    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m = g.length ;
        int n = s.length ;
        int i= 0;
        int j = 0 ;
        int count = 0 ;
        while(i<m && j<n){
            if(s[j]<g[i]){
                j++;
            }else{
                i++;
                j++;
                count++;
            }
        }
        return count;
    }
}
