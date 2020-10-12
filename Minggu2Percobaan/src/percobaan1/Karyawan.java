package percobaan1;

public class Karyawan {
    public String id, nama, jenisKelamin, jabatan;
    public int gaji;
    
    public void cetakData() {
        System.out.println("Id Karyawan: "+id);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: "+ jenisKelamin);
        System.out.println("Jabatan: " + jabatan);
    }
    public void cetakGaji() {
        System.out.println("Gaji: "+gaji);
    }
}
