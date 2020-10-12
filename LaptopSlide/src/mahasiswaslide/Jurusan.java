package mahasiswaslide;

public class Jurusan {
    private String nama, akreditasi;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAkreditasi() {
        return akreditasi;
    }

    public void setAkreditasi(String akreditasi) {
        this.akreditasi = akreditasi;
    }
    
    public void tampilkanInfo(){
        System.out.println("Jurusan: "+nama);
        System.out.println("Akreditasi: "+akreditasi);
    }
}
