package minggu11;

public class Mahasiswa {
    String nama;
    int nilai;
    
    public Mahasiswa(String nama, int nilai){
        this.nama = nama;
        this.nilai = nilai;
    }
    
    public void print(){
        System.out.println("Nama\t: "+nama);
        System.out.println("Nilai\t: "+nilai);
    }
}
