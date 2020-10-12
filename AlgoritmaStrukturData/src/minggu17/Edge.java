package minggu17;

public class Edge {
    Vertex source, destination;
    int weight;

    public Edge(Vertex source, Vertex destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge{" + "source=" + source + ", destination=" + destination + '}';
    }
    
    
}
