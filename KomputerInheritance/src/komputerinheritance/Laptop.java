package komputerinheritance;

public class Laptop extends Komputer{
    public String jnsBaterai;

    public Laptop() {
    }

    public Laptop(String jnsBaterai, String merk, String jnsProcessor, int kecProcessor, int sizeMemory) {
        super(merk, jnsProcessor, kecProcessor, sizeMemory);
        this.jnsBaterai = jnsBaterai;
    }

    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Baterai   :" + jnsBaterai);
    }
    
}
