
public class TestMahasiswa {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        
        mhs1.nama= "Daffa";
        mhs1.nim = "123";
        mhs1.beratBadan = 60;
        
//        mhs1.setNama("Daffa");
//        mhs1.setNim("123");
//        mhs1.setBeratBadan(60);
        
        mhs2.nama = "Akbar";
        mhs2.nim = "456";
        mhs2.beratBadan = 80;
                
                
//        mhs2.setNama("Akbar");
//        mhs2.setNim("456");
//        mhs2.setBeratBadan(80);
        
        mhs1.tampilkanBiodata();
        mhs2.tampilkanBiodata();
    }
}

