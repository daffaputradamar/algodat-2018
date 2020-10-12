package komputerinheritance;

public class Windows extends PC{
    public String fitur;

    public Windows() {
    }

    public Windows(String fitur, int ukuranMonitor, String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
        super(ukuranMonitor, merk, jnsProcessor, kecProcessor, sizeMemory);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        super.tampilPC();
        System.out.println("Fitur   :" + fitur);
    }
}
