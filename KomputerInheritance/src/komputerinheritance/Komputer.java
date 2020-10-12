package komputerinheritance;

public class Komputer {
    public String merk, jnsProcessor;
    public int kecProcessor,sizeMemory;

    public Komputer() {
    }

    public Komputer(String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
        this.merk = merk;
        this.jnsProcessor = jnsProcessor;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
    }
    
    public void tampilData(){
        System.out.println("Merk            : " + merk);
        System.out.println("Jenis Processor : " + jnsProcessor);
        System.out.println("Kecepatan Processor : " + kecProcessor);
        System.out.println("Size Memory     : " + sizeMemory);
    }
}
