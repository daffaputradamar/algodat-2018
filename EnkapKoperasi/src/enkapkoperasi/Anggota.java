package enkapkoperasi;

public class Anggota {
    private String nomorKtp, nama;
    private int limitPeminjaman, jmlPeminjaman;

    public Anggota(String nomorKtp, String nama, int limitPeminjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }

    public void angsur(int uang) {
        if (uang >= (jmlPeminjaman*0.1)) {
            if (uang > jmlPeminjaman) {
                int tambahlimit = uang - jmlPeminjaman;
                int kurangpinjam = uang - tambahlimit;
                jmlPeminjaman -= kurangpinjam;
                limitPeminjaman += tambahlimit;
                
            } else {
                jmlPeminjaman -= uang;
                limitPeminjaman += uang;   
            }
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }
    
    public void pinjam(int uang){
        if (uang > limitPeminjaman) {
            System.out.println("Maaf, jumlah peminjaman melebihi limit");
        } else {
            jmlPeminjaman += uang;
            limitPeminjaman -= uang;
        }
    }
    
    public int getJmlPeminjaman() {
        return jmlPeminjaman;
    }
    
    public String getNama() {
        return nama;
    }

    public int getLimitPeminjaman() {
        return limitPeminjaman;
    }
    
    
}
