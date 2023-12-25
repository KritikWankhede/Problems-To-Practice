package LinkedList;

public class ReverseLink {
    public static void main(String[] args) {
        MyLinkedList link=new MyLinkedList();
        link.add(100);
        link.add(50);
        link.add(25);
        link.add(13);
        //System.out.println(link.toString());
        //link.display();
        //link.reverselist();
        link.display();
        System.out.println(link.deleteAtPosition(2).data);
        link.display();
    }

}
class ListNode{
    int data;
    ListNode next;
    public ListNode(int data){
        this.data=data;
        this.next=null;
    }

}

class MyLinkedList{
    ListNode head;
    public MyLinkedList(){
        this.head=null;
    }
    public void add(int data){
        ListNode ln=new ListNode(data);
        if(head!=null){
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = ln;
        }
        else{
            head=ln;
        }
    }
    public void reverselist(){
        ListNode prev=null;
        ListNode current=head;
        ListNode next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        head=prev;
    }

    public void display(){
        ListNode current=head;
        while(current !=null){
            System.out.print(current.data +" -> ");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public ListNode deleteAtPosition(int pos){

        ListNode start=new ListNode(0);
        start.next=head;
        ListNode fast=start;
        ListNode slow=start;
        for (int i = 0; i < pos; i++) {
            fast = fast.next;
        }
        while(fast.next!=null){
               fast=fast.next;
               slow=slow.next;
        }
        ListNode del=slow.next;
        System.out.println("Deleted node:-"+del.data);
        slow.next=slow.next.next;
        return head;
    }
}


