package mahasiswaslide;

public class Mahasiswa {
    private String nim, nama;
    Jurusan jur;

    public Mahasiswa(String nim, String nama, Jurusan jur) {
        this.nim = nim;
        this.nama = nama;
        this.jur = jur;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Jurusan getJur() {
        return jur;
    }

    public void setJur(Jurusan jur) {
        this.jur = jur;
    }
    
    public void tampilkanInfo(){
        System.out.println("NIM: "+nim);
        System.out.println("Nama Mahasiswa: "+nama);
        jur.tampilkanInfo();
    }
}
