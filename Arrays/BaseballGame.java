package Arrays;
import java.util.ArrayList;
public class BaseballGame {
    public static void main(String[] args) {
        String[] operations={"1","C"};
        System.out.println(calPoints(operations));
    }

    static int calPoints(String[] operations) {
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i]=="C"){
                list.remove(list.get(count-1));
                count--;
            }
            else if(operations[i]=="D"){
                int num=list.get(count-1)*2;
                list.add(num);
                count++;
            }
            else if(operations[i]=="+"){
                int num= list.get(count-1)+list.get(count-2);
                list.add(num);
                count++;
            }
            else {
                list.add(Integer.parseInt(operations[i]));
                count++;
            }
        }
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            sum=sum+list.get(i);
        }
        System.out.println(list);
        return sum;
    }

}
