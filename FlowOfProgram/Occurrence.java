package FlowOfProgram;
public class Occurrence {
    public static void main(String[] args) {
       String[] name={"Hello how are you?"};
        StringBuilder[] naam=new StringBuilder[name.length];
        for (int i = 0; i < naam.length; i++) {
            naam[i]=new StringBuilder(name[i]);
        }
        for (int i = 0; i < naam.length; i++) {
            name[i]=naam[i].reverse().toString();
        }
        for (String s : name) {
            System.out.print(s + " ");
        }
        }
    }



