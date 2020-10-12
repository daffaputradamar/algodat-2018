package minggu17;

public class DjikstraTest {
    public static void main(String[] args) {
        Graph graph = new Graph();
        for (int i = 0; i < 11; i++) {
            Vertex location = new Vertex("Vertex "+i);
            graph.addVertex(location);
        }
        graph.addEdge(0, 1, 85);
    }
}
