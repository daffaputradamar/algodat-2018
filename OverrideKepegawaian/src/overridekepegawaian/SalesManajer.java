package overridekepegawaian;

public class SalesManajer extends Manajer {
    String departemen;
    
    public SalesManajer(String nama, String departemen,int gaji) {
        super(nama, gaji);
        this.departemen = departemen;
    }
    
    @Override
    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji: " + gaji);
        System.out.println();
    }
}
