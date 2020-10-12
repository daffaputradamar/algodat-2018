package minggu15;

public class NodeAL {
    Vertex vertex;
    NodeAL prev, next;
    
    NodeAL(NodeAL prev, Vertex data, NodeAL next){
        this.prev = prev;
        this.vertex = data;
        this.next = next;
    }
}
