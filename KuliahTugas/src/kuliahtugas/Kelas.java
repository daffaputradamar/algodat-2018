package kuliahtugas;

public class Kelas {

    private String nama;
    private Mahasiswa[] mhs;
    private Prodi prod;

    public Kelas(String nama, Prodi prod, int jml) {
        this.nama = nama;
        this.prod = prod;
        mhs = new Mahasiswa[jml];
        initKelas();
    }

    public Kelas(String nama, Prodi prod) {
        this.nama = nama;
        this.prod = prod;
    }
    
    public Kelas() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mahasiswa[] getMhs() {
        return mhs;
    }

    public void setMhs(Mahasiswa[] mhs) {
        this.mhs = mhs;
    }

    public Prodi getProd() {
        return prod;
    }

    public void setProd(Prodi prod) {
        this.prod = prod;
    }

    private void initKelas() {
        for (int i = 0; i < mhs.length; i++) {
            this.mhs[i] = new Mahasiswa();
        }
    }

    public void tampilkanInfo() {
        System.out.println("Kelas");
        System.out.println("\tNama    : " + nama);
        System.out.println("\tProdi   : " + prod.getNama());
    }
    
    public void tampilkanMahasiswa(){
        for (Mahasiswa mh : mhs) {
            mh.tampilkanInfo();
        }
    }

}
