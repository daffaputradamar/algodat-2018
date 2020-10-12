package kuliahtugas;

public class KuliahTest {

    public static void main(String[] args) {
        Jurusan jur = new Jurusan("Teknologi Informasi");

        Prodi prod1 = new Prodi("Teknik Informatika", jur);
        Prodi prod2 = new Prodi("Manajemen Informatika", jur);

        Kelas kls1 = new Kelas("1A", prod1);
        Kelas kls2 = new Kelas("1B", prod1);
        Kelas kls3 = new Kelas("1A", prod2);
        Kelas kls4 = new Kelas("1B", prod2);

        Mahasiswa mhs1 = new Mahasiswa("12345", "Afifah", kls1);
        Mahasiswa mhs2 = new Mahasiswa("67890", "Aji", kls1);
        Mahasiswa mhs3 = new Mahasiswa("09876", "Aldi", kls2);
        Mahasiswa mhs4 = new Mahasiswa("54321", "Bimas", kls2);
        Mahasiswa mhs5 = new Mahasiswa("10293", "Bachtiar", kls3);
        Mahasiswa mhs6 = new Mahasiswa("01928", "Bashori", kls3);
        Mahasiswa mhs7 = new Mahasiswa("47563", "Dena", kls4);
        Mahasiswa mhs8 = new Mahasiswa("84576", "Daffa", kls4);

        Mahasiswa[] arrayMhs1 = {mhs1, mhs2};
        Mahasiswa[] arrayMhs2 = {mhs3, mhs4};
        Mahasiswa[] arrayMhs3 = {mhs5, mhs6};
        Mahasiswa[] arrayMhs4 = {mhs7, mhs8};

        Kelas[] arrayKelas1 = {kls1, kls2};
        Kelas[] arrayKelas2 = {kls3, kls4};

        Prodi[] arrayProd = {prod1, prod2};

        jur.setProd(arrayProd);
        
        prod1.setKls(arrayKelas1);
        prod2.setKls(arrayKelas2);
        
        kls1.setMhs(arrayMhs1);
        kls2.setMhs(arrayMhs2);
        kls2.setMhs(arrayMhs3);
        kls4.setMhs(arrayMhs4);
        
        jur.tampilkanInfo();
        jur.tampilkanProdi();
        System.out.println();
        prod1.tampilkanInfo();
        prod1.tampilkanKelas();
        System.out.println();
        kls1.tampilkanInfo();
        kls1.tampilkanMahasiswa();
        System.out.println();
        mhs1.tampilkanInfo();
    }
}
