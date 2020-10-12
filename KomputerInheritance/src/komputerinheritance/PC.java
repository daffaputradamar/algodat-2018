package komputerinheritance;

public class PC extends Komputer{
    public int ukuranMonitor;

    public PC() {
    }

    public PC(int ukuranMonitor, String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
        super(merk, jnsProcessor, kecProcessor, sizeMemory);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPC(){
        super.tampilData();
        System.out.println("Ukuran Monitor  : "+ukuranMonitor);
    }
}
