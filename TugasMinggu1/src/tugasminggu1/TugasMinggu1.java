package tugasminggu1;

public class TugasMinggu1 {

    public static void main(String[] args) {
        
        Kacamata km1 = new Kacamata();
        Kacamata km2 = new Kacamata();
        KacamataMinus km3 = new KacamataMinus();
        
        km1.setMerek("KacaGlasses");
        km1.setJenisLensa("Transparan");
        km1.setWarnaFrame("Merah");
        
        km2.setMerek("EyeKaca");
        km2.setJenisLensa("Gelap");
        km2.setWarnaFrame("Biru");
        km2.gantiFrame("Hijau");
        
        km3.setMerek("EyeGlasses");
        km3.setJenisLensa("Transparan");
        km3.setWarnaFrame("Hitam");
        km3.setMinus(0.5);
        
        km1.tampilkanData();
        km2.tampilkanData();
        km3.tampilkanData();
    }
    
}
