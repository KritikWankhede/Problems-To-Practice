package ProjectIntern;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        char cont = 'y';
        int chance = 0;
        Scanner sc = new Scanner(System.in);
        while (cont == 'Y' || cont == 'y') {
            int gen = generate();
            while (chance < 5) {
                System.out.println("Enter a number from 1 - 100:-");
                int num = sc.nextInt();
                if (num == gen) {
                    System.out.println("You Won and You get " + (501-(chance * 100)) + " points");
                    System.out.println("*--------------------------------------*\nDo You Want to Play Again:-\nSelect 'y' for YES and 'n' for NO:- ");
                    cont=sc.next().charAt(0);
                        if(checkIt(cont)){
                            greeting();
                        }
                    chance=0;
                }
                else {
                    System.out.println(decider(num, gen));
                    chance++;
                }
            }
            System.out.println("The number was "+gen);
            System.out.println("You Lost");
            System.out.println("Do You Want to Play Again:-\nSelect 'y' for YES and 'n' for NO:- ");
            cont=sc.next().charAt(0);
            if(checkIt(cont)){
                greeting();
            }
            chance=0;
        }

    }

    public static String decider(int num,int rand){
        if(num<rand){
            return ("Go Higher");
        }
        return "Go Lower";
    }
    public static int generate(){
        int min=1,max=100;
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static boolean checkIt(char ch){
       return ch != 'y';
    }
    static void greeting(){
        System.out.println("================================\nThank You For Playing \nHave a nice day. ");
        return;
    }
}
