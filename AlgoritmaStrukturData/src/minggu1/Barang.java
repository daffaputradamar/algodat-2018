package minggu1;

public class Barang {
    
    String namaBarang,jenisBarang;
    int stok, hargaSatuan;
    
    Barang(){
      
    }
    
    Barang(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
    
    void tampilBarang(){
        System.out.println("Nama = " + namaBarang);
        System.out.println("Jenis = " + jenisBarang);
        System.out.println("Stok = " + stok);
        System.out.println("Harga Satuan = " + hargaSatuan);
    }
    void tambahStok(int n){
        stok += n;
    }
    
    void kurangiStok(int n){
        if(stok > 0){
        stok -= n;
        }
    }
    
    int hitungHargaTotal(int jumlah){
        return jumlah*hargaSatuan;
    }
}
