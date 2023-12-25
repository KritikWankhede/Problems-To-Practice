package Graph;

import java.util.ArrayList;

public class Learn1 {
    private ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    private int n;
    public Learn1(int n){
        this.n=n;
        for (int i = 0; i <n ; i++) {
            adj.add(new ArrayList<>());
        }
    }
    public void addEdge(int src,int destination){
          adj.get(src).add(destination);
          adj.get(destination).add(src);
    }

    public void printGraph(){
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(" Vertex "+ i +" -> ");
//            for (Integer n: adj.get(i)) {
//                System.out.print(n+" ");
//            }
//            System.out.println();
            System.out.println(adj.get(i).toString());
        }
    }

}
