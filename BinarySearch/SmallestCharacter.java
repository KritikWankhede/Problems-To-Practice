package BinarySearch;

public class SmallestCharacter {
    public static void main(String[] args) {
        char[] ch={'c','d','f','j'};
        char target='j';
        char ans=wrap(ch,target);
        System.out.println(ans);
    }
    static char wrap(char[] ch,char item)
    {
        int start=0;
        int end=ch.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(ch[mid]>item){
                end=mid-1;
            }
            else {
                start=mid+1;
            }

        }
        return ch[start % ch.length];
    }
}
