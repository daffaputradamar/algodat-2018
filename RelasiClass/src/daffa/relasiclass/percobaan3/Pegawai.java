package daffa.relasiclass.percobaan3;

public class Pegawai {
    private String nip, nama;

    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }
    
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String info(){
        return "Nip: " + this.nip + "\nNama: "+this.nama+"\n";
    }
    
}
