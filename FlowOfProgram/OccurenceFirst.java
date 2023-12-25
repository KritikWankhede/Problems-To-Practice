package FlowOfProgram;
import java.util.Scanner;
public class OccurenceFirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int num=sc.nextInt();
        String[] arr=new String[num];
        for (int i = 0; i <num; i++) {
            arr[i]= sc.nextLine();
        }
        int i=0;
        while(i<arr.length) {
            char[] ch=arr[i].toCharArray();
            for (int j = 0; j <arr[i].length() ; j++) {
                for (int k = 0; k < ch.length; k++) {
                    if(ch[j]==arr[i].charAt(k)){
                        count++;
                    }
                    if(count==2){
                        System.out.println(arr[i].charAt(k));
                        i++;
                        j=arr[i].length()-1;
                        k=ch.length-1;
                    }
                }
            }

        }

    }
}
