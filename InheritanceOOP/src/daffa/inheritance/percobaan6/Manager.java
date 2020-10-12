package daffa.inheritance.percobaan6;

public class Manager extends Karyawan{
    public int tunjangan;

    public Manager() {
    }
    
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan   : " + tunjangan);
        System.out.println("Total Gaji  : " + (tunjangan + super.gaji));
    }
}
