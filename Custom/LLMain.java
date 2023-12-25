package Custom;

public class LLMain {
    public static void main(String[] args) {
        CLL list =new CLL();
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(8);
//        list.insertFirst(13);
//        list.insertLast(99);
//        list.insert(5,52);
//        list.display();
        list.insert(12);
        list.insert(2);
        list.insert(5);
        list.insert(18);
        list.display();
        list.delete(2);
        list.display();


    }
}
