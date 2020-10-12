package contohgettersetter;

public class Barang {
    private int harga;
    private String namaBarang;

    public int getHarga() {
        return harga;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    
    public void info(){
        System.out.println("Nama: "+namaBarang);
        System.out.println("Harga: "+harga);
    }
}
