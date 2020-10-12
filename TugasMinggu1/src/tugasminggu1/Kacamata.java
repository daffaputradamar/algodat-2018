package tugasminggu1;

public class Kacamata {
    private String merek, jenisLensa, warnaFrame;
    
    public void setMerek(String newVal) {
        merek = newVal;
    }
    
    public void setJenisLensa(String newVal) {
        jenisLensa = newVal;
    }
    
    public void setWarnaFrame(String newVal) {
        warnaFrame = newVal;
    }
    
    public void gantiLensa(String newVal) {
        setJenisLensa(newVal);
    }
    
    public void gantiFrame(String newVal) {
        setWarnaFrame(newVal);
    }
    
    public void tampilkanData(){
        System.out.println("Merek: "+merek);
        System.out.println("Jenis Lensa: " + jenisLensa);
        System.out.println("Warna Frame: " + warnaFrame);
    }
}
