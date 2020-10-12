package laptopslide;

public class TestLaptop {
    public static void main(String[] args) {
        
        Processor proc = new Processor("Intel", 2400);
        Processor procKos = new Processor();
//        proc.setMerk("Intel Core i7");
//        proc.setFrekuensi(2400);
        
        proc.tampilkanInfo();
        
        Laptop lap = new Laptop();
        lap.setMerk("Asus");
        lap.setCPU(proc);
        
//        lap.overclock();
        
        lap.tampilkanInfo();
                
    }
}
