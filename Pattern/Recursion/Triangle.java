package Pattern.Recursion;

public class Triangle {
    public static void main(String[] args) {
      triangle(4,0);
        System.out.println("______------------------------------------______");
      triangle1(4,0);
        System.out.println("______------------------------------------______");
    }
    static void triangle(int rows,int cols){
        if(rows==0){
            return;
        }
        if(cols<rows){
            System.out.print("* ");
            triangle(rows,cols+1);
        }
        else{
            System.out.println();
            triangle(rows-1,0);
        }
    }

    static void triangle1(int rows,int cols){
        if(rows==0){
            return;
        }
        if(cols<rows){
            triangle1(rows,cols+1);
            System.out.print("* ");
        }
        else{
            triangle1(rows-1,0);
            System.out.println();
        }
    }
}
