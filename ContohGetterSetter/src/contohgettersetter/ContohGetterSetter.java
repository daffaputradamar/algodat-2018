package contohgettersetter;

public class ContohGetterSetter {

    public static void main(String[] args) {
        Barang b1 = new Barang();
        
//        b1.namaBarang = "Botol";
//        b1.harga = 2000;

        b1.setHarga(2000);
        b1.setNamaBarang("Botol");
        
//        System.out.println("Nama barang: " + b1.namaBarang);
        System.out.println("Nama barang: " + b1.getNamaBarang());
    }
    
}
