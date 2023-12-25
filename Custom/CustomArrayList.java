package Custom;
import java.util.Arrays;
public class CustomArrayList<T> {
      private static int DEFAULT_SIZE=10;
      private int size=0;
      private Object[] data;
      public CustomArrayList(){
          this.data=new Object[DEFAULT_SIZE];
      }
      public void add(T num){
          if(this.isFull()){
              resize();
          }
          data[size++]=num;
      }
    private void resize() {
          Object[] temp=new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data=temp;
    }
    private boolean isFull() {
          return size== data.length;
    }
    public T remove(){
          T removed=(T)data[--size];
          return removed;
    }
    public T get(int index){
          return (T)data[index];
    }
    public int size(){
          return size;
    }
    public void set(int index,T value){
          data[index]=value;
    }

    @Override
    public String toString() {
          return "CustomArrayList("+Arrays.toString(data)+")";
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> list=new CustomArrayList<>();
        list.add(2);
        list.add(8);
        list.add(15);
        System.out.println(list);
    }
}
