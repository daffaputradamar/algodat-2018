package inheritanceslide;

public class Pegawai {
    public String nama;
    public double gaji;
    
    public String getDescription(){
        return "Nama: " +nama + ", Gaji: "+gaji;
    }
    
    public void tampilkanStatus(){
        System.out.println("Nama    : " + nama);
        System.out.println("Gaji    : " + gaji);
    }
}
