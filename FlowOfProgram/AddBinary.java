package FlowOfProgram;

public class AddBinary {
    public static void main(String[] args) {
        String num1="11";
        String num2="1";
        System.out.println(addBinary(num1,num2));
    }
    static String addBinary(String num1,String num2){
        StringBuilder sum= new StringBuilder("");
        int indexA= num1.length()-1;
        int indexB =num2.length()-1;
        int carry=0;
        int digitSum;
        while(indexA >= 0 || indexB >= 0 || carry > 0 ){
            digitSum = carry;
            if(indexA >= 0) digitSum += num1.charAt(indexA--)-'0';
            if(indexB >= 0) digitSum += num2.charAt(indexB--)-'0';
            if(digitSum >1) carry=1;
            else carry=0;
            sum.insert(0, digitSum%2);
        }
        return sum.toString();
    }
}
