package minggu1;

public class Barang1 {
    String nama;
    int hargaSatuan, jumlah;
    
    Barang1(String nama, int hargaSatuan, int jumlah){
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
    }
    
    int hitungHargaTotal(){
        return jumlah * hargaSatuan;
    }
    
    int hitungDiskon(){
        int hargaTotal = hitungHargaTotal();
        if (hargaTotal > 100000) {
            System.out.println("Anda mendapat diskon 10%");
            return hargaTotal * 10/100;
        } else if (hargaTotal > 50000){
            System.out.println("Anda mendapat diskon 5%");
            return hargaTotal * 5/100;
        } else {
            return 0;
        }
    }
    
    int hitungHargaBayar(){
        return hitungHargaTotal() - hitungDiskon();
    }
}
