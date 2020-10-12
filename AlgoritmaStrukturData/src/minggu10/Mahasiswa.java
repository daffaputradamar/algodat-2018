package minggu10;

public class Mahasiswa {
    String nim,nama;
    
    Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    Mahasiswa(){
    }
    
    public void print(){
        System.out.println("Nama: " + nama);
        System.out.println("Nim: "+nim);
    }
}
