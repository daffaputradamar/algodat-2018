package daffa.inheritance.percobaan5;

public class Inheritance1 {
    public static void main(String[] args) {
        
        Manager m = new Manager();
        
        m.nama="Vivin";
        m.alamat="Jl. Vinolia";
        m.umur=25;
        m.jk="Perempuan";
        m.gaji=3000000;
        m.tunjangan=1000000;
        m.tampilDataManager();
        
        Staff s = new Staff();
        
        s.nama="Lestari";
        s.alamat="Malang";
        s.umur=25;
        s.jk="Perempuan";
        s.gaji=2000000;
        s.lembur=500000;
        s.potongan=250000;
        s.tampilDataStaff();
        
    }
}
