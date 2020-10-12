package minggu8;

public class Nasabah {
    String noRekening, nama;
    
    Nasabah(String noRek, String nm){
        noRekening = noRek;
        nama = nm;
    }
    
    Nasabah(){
        
    }
    
    void print(){
        System.out.println("Data Nasabah: ");
        System.out.println("Nama\t\t: "+nama);
        System.out.println("No rekening\t: "+noRekening);
    }
}
