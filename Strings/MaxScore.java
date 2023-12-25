package Strings;

public class MaxScore {
    public static void main(String[] args) {
        String str="011101";
        System.out.println(maxScore(str));
    }
    static int maxScore(String str){
        int maxOnes=0;
        int temp=str.charAt(0)=='0' ? 1 : 0;
        int score=temp;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)=='0'){
                temp+=1;
            }
            else{
                maxOnes++;
                temp-=1;
            }
            if (temp>score){
                score=temp;
            }
        }

        return maxOnes+score;
    }
}
