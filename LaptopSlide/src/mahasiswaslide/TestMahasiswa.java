package mahasiswaslide;

public class TestMahasiswa {
    public static void main(String[] args) {
        Jurusan jur = new Jurusan();
        jur.setNama("Teknologi Informasi");
        jur.setAkreditasi("A");
        
        Mahasiswa mhs = new Mahasiswa("111001", "Jones", jur);
        mhs.tampilkanInfo();
    }
}
