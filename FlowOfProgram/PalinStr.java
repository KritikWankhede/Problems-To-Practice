package FlowOfProgram;

public class PalinStr {
    public static void main(String[] args) {
        String name="Malayalam";
        boolean flag=true;
        int start=0;
        int end=name.length()-1;
        while(end>=start)
        {
            if(name.toLowerCase().charAt(start)!=name.toLowerCase().charAt(end)){
                flag=false;
                break;
            }
            else {
                end--;
                start++;
            }
        }
        if (flag) {
            System.out.println(name + " is Palindrome.");
        }
        else {
            System.out.println(name+ " is not Palindrome.");
        }

    }
}
