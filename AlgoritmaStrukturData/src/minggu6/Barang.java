package minggu6;

public class Barang {
    int nomorUrut, stok, harga;
    String nama;
    
    Barang(String nm, int nu, int st, int hg){
        nama = nm;
        nomorUrut = nu;
        stok = st;
        harga = hg;
    }
    
    void tampil(){
        System.out.println("Nama Barang: " + nama);
        System.out.println("Nomor Urut Barang: "+ nomorUrut);
        System.out.println("Stok Barang: "+stok);
        System.out.println("Harga Barang: "+ harga);
    }
}
