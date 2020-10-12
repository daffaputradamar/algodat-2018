package inheritanceslide;

public class TestPegawai {
    public static void main(String[] args) {
        
        Supervisor spv = new Supervisor();
        
        spv.nama = "Bob";
        spv.gaji = 25000;
        spv.departemen = "IT";
        spv.shift = "Pagi";
        spv.durasi = 5;
        
        spv.tampilkanGajiTotal();
        
    }
}
