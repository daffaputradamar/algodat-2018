package laptopslide;

public class Laptop {
    private String merk;
    private Processor CPU;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Processor getCPU() {
        return CPU;
    }

    public void setCPU(Processor CPU) {
        this.CPU = CPU;
    }
    
    public void overclock(){
        CPU.setFrekuensi(CPU.getFrekuensi()+ 100);
    }
    
    public void tampilkanInfo(){
        System.out.println("Merk Laptop: "+merk);
        CPU.tampilkanInfo();
    }
    
}
