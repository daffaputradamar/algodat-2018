package minggu10;

public class NodeMahasiswa {
    Mahasiswa data;
    NodeMahasiswa next;
    
    public NodeMahasiswa(Mahasiswa data, NodeMahasiswa next){
        this.data = data;
        this.next = next;           
    }
}
