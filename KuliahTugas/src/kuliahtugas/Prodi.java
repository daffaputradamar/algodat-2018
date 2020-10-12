package kuliahtugas;

public class Prodi {

    private String nama;
    private Kelas[] kls;
    private Jurusan jur;

    public Prodi(String nama, Jurusan jur, int jml) {
        this.nama = nama;
        this.jur = jur;
        kls = new Kelas[jml];
        initProdi();
    }

    public Prodi(String nama, Jurusan jur) {
        this.nama = nama;
        this.jur = jur;
    }

    public Prodi() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Kelas[] getKls() {
        return kls;
    }

    public void setKls(Kelas[] kls) {
        this.kls = kls;
    }

    public Jurusan getJur() {
        return jur;
    }

    public void setJur(Jurusan jur) {
        this.jur = jur;
    }

    private void initProdi() {
        for (int i = 0; i < kls.length; i++) {
            this.kls[i] = new Kelas();
        }
    }

    public void tampilkanInfo() {
        System.out.println("Prodi");
        System.out.println("\tNama    : " + nama);
        System.out.println("\tJurusan   : " + jur.getNama());
    }
    
    public void tampilkanKelas(){
        for (Kelas kl : kls) {
            kl.tampilkanInfo();
        }
    }

}
