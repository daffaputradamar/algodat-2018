package komputerinheritance;

public class Mac extends Laptop{
    public String security;

    public Mac() {
    }

    public Mac(String security, String jnsBaterai, String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
        super(jnsBaterai, merk, jnsProcessor, kecProcessor, sizeMemory);
        this.security = security;
    }
    
    public void tampilMac(){
        super.tampilLaptop();
        System.out.println("Security    : "+security);
    }
}
