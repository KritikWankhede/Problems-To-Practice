package Graph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ChatGptSolution {
        private Map<Integer, List<Edge>> adjacencyList;

        public ChatGptSolution() {
            adjacencyList = new HashMap<>();
        }

        public void addEdge(int source, int destination, int weight) {
            Edge edge = new Edge(destination, weight);
            adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(edge);

            // For an undirected graph, add the reverse edge as well
            Edge reverseEdge = new Edge(source, weight);
            adjacencyList.computeIfAbsent(destination, k -> new ArrayList<>()).add(reverseEdge);
        }

        public List<Edge> getEdges(int vertex) {
            return adjacencyList.getOrDefault(vertex, new ArrayList<>());
        }
        public static void main(String[] args) {
            ChatGptSolution graph = new ChatGptSolution();

            graph.addEdge(0, 1, 4);
            graph.addEdge(0, 2, 3);
            graph.addEdge(1, 2, 1);
            graph.addEdge(1, 3, 2);
            graph.addEdge(2, 3, 4);
            graph.addEdge(3, 4, 2);

            for (int vertex = 0; vertex < 5; vertex++) {
                List<Edge> edges = graph.getEdges(vertex);
                System.out.print("Vertex " + vertex + ": ");
                for (Edge edge : edges) {
                    System.out.print("(" + edge.destination + ", " + edge.weight + ") ");
                }
                System.out.println();
            }
    }

    class Edge {
        int destination;
        int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    }


