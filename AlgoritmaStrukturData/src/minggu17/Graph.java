package minggu17;

import java.util.LinkedList;

public class Graph {
    LinkedList<Vertex> vertexes;
    LinkedList<Edge> edges;

    public Graph() {
        this.vertexes = new LinkedList<>();
        this.edges = new LinkedList<>();
    }
    
    public void addVertex(Vertex vertex){
        vertexes.add(vertex);
    }
    
    public void addEdge(int source, int destination, int weight){
        Edge edge = new Edge(vertexes.get(source), vertexes.get(destination), weight);
        edges.add(edge);
    }
   
}
