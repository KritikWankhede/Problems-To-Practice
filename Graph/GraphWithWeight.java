package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class GraphWithWeight {
    Map<Integer,ArrayList<Integer>> adj;
    int node;
    public GraphWithWeight(int node){
        this.node=node;
        adj=new HashMap<>(node);
    }
    public void addWeight(int src,int destination,int weight){
            adj.computeIfAbsent(src,k -> new ArrayList<Integer>()).add(destination,weight);
            adj.computeIfAbsent(destination,k -> new ArrayList<>()).add(src,weight);
    }
    public void printGraphWeight(){
        for (int i = 0; i < adj.size(); i++) {
            System.out.print("VERTEX " + i +" -> ");
            System.out.println(adj.get(i).toString());
        }
    }

}
