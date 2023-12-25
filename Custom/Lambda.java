package Custom;
public class Lambda {
    public static void main(String[] args) {
        Lambda calculator=new Lambda();
        Operation sum=((a, b) -> (a+b));
        Operation diff=((a, b) -> (a-b));
        Operation mul=((a,b) ->(a*b));

        System.out.println(calculator.operate(4,5,sum));
        System.out.println(calculator.operate(4,5,diff));
        System.out.println(calculator.operate(4,5,mul));

    }
    private int operate(int a,int b, Operation op){
        return op.operation(a,b);
    }
}

interface Operation {
    int operation(int a, int b);
}
