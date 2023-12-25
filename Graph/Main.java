package Graph;

public class Main {
    public static void main(String[] args) {
        int node=5;
//        Learn1 obj=new Learn1(node);
//
//        obj.addEdge(0, 1);
//        obj.addEdge(0, 4);
//        obj.addEdge(1, 2);
//        obj.addEdge(1, 3);
//        obj.addEdge(1, 4);
//        obj.addEdge(2, 3);
//        obj.addEdge(3, 4);
//
//        obj.printGraph();
        GraphWithWeight obj=new GraphWithWeight(5);
        obj.addWeight(0,1,5);
        obj.addWeight(0,4,6);
        obj.addWeight(1,2,2);
        obj.addWeight(1,3,3);
        obj.addWeight(1,4,1);
        obj.addWeight(2,3,2);
        obj.addWeight(3,4,5);

        obj.printGraphWeight();



    }
}
