package Ganit;

public class AreaOfRectilinearRectangle {
    public static void main(String[] args) {
        System.out.println(computeArea(-2,-2,2,2,3,3,4,4));
    }
    static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        //Area of rectangle=area of 1st rectangle+area of 2nd rectangle -area of intersection
        int area1=(ax2-ax1)*(ay2-ay1);
        int area2=(bx2-bx1)*(by2-by1);
        int xo=Math.min(ax2,bx2)-Math.max(ax1,bx1);
        int yo=Math.min(ay2,by2)-Math.max(ay1,by1);
        int area3=xo*yo;
        return (area1+area2-area3);
    }

}
