package BitwiseOperator;
import java.util.Scanner;
public class XOROperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int start=sc.nextInt();
        XOROperations obj=new XOROperations();
        System.out.println(obj.xorOperation(num,start));
    }
    public int xorOperation(int n, int start) {
       int num=0;
        for(int i = 0; i < n; i++) {
            int j=start+2*i;
            num=num^j;
        }
        return num;
    }
}
