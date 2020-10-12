package kuliahtugas;

public class Mahasiswa {
    private String nim, nama;
    private Kelas kls;
    
    public Mahasiswa(String nim, String nama, Kelas kls) {
        this.nim = nim;
        this.nama = nama;
        this.kls = kls;
    }
    
    public Mahasiswa(){
        
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

    public Kelas getKls() {
        return kls;
    }

    public void setKls(Kelas kls) {
        this.kls = kls;
    }

    public void tampilkanInfo() {
        System.out.println("Mahasiswa");
        System.out.println("\tNama    : "+nama);
        System.out.println("\tNIM     : "+nim);
        System.out.println("\tKelas   : "+kls.getNama());
    }
   
}
