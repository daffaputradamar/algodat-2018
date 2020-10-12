package laptopslide;

public class Processor {
    private String merk;
    private double frekuensi;

    public Processor() {
    }

    public Processor(String merk, double frekuensi) {
        this.merk = merk;
        this.frekuensi = frekuensi;
    }
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getFrekuensi() {
        return frekuensi;
    }

    public void setFrekuensi(double frekuensi) {
        this.frekuensi = frekuensi;
    }
    
    public void tampilkanInfo(){
        System.out.println("Merk Processor: "+ merk);
        System.out.println("frekuensi Processor: "+ frekuensi+ " Ghz");
    }
}
