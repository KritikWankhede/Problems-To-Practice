package Arrays;

public class DiifMaxMinPair {
    public static void main(String[] args) {
         int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,min1=Integer.MAX_VALUE;
         int min2=Integer.MAX_VALUE;
         int[] num={4,2,5,9,7,4,8};
            for (int i = 0; i < num.length; i++) {
                if(max1<num[i]){
                    max2=max1;
                    max1=num[i];
                }
                else if(max2<num[i]){
                    max2=num[i];
                }
                else if(min1>num[i]){
                    min2=min1;
                    min1=num[i];
                }
                else if(min2>num[i]){
                    min2=num[i];
                }
            }
        System.out.println("Max1:-"+max1+"\nMax2:-"+max2+"\nMin1:-"+min1+"\nMin2:-"+min2);
        System.out.println((max1*max2)-(min1*min2));

    }
}
