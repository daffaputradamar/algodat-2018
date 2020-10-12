package minggu1;

public class SewaGame {
    int id, lamaPinjam, hargaSewa;
    String namaMember, namaGame;
    
    SewaGame(int id, int lamaPinjam, int hargaSewa, String namaMember, String namaGame){
        this.id = id;
        this.lamaPinjam = lamaPinjam;
        this.hargaSewa = hargaSewa;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
    }
    
    int hitungHarga(){
        return hargaSewa*lamaPinjam;
    }
    
    void tampilHasil(){
        System.out.println("Id anda: " + id);
        System.out.println("Nama: " + namaMember);
        System.out.println("Game: " + namaGame);
        System.out.println("Lama sewa: " + lamaPinjam);
        System.out.println("Harga sewa/hari: " + hargaSewa);
        System.out.println("Harga total: " + hitungHarga());
    }
}
