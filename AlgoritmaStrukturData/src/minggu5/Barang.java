package minggu5;

public class Barang {
    String nama;
    int jumlah, hargaSatuan;
    
    Barang(String n, int j, int hs){
        nama = n;
        jumlah = j;
        hargaSatuan = hs;
    }
    
    void tampil(){
        System.out.println("Nama: "+nama);
        System.out.println("Jumlah: "+jumlah);
        System.out.println("HargaSatuan: "+hargaSatuan);
        System.out.println("HargaTotal: "+hitungHargaTotal());
    }
    
    int hitungHargaTotal(){
       return jumlah*hargaSatuan; 
    }
}
