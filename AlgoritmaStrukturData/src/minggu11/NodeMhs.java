package minggu11;

public class NodeMhs {
    Mahasiswa data;
    NodeMhs prev, next;
    
    NodeMhs(NodeMhs prev, Mahasiswa data, NodeMhs next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
