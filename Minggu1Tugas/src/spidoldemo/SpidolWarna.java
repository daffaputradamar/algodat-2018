package spidoldemo;

public class SpidolWarna extends Spidol {
    String warna;
    
    SpidolWarna(String merek, int harga, String warna){
        super(merek, harga);
        this.warna = warna;
    }
    
    public void cetakData(){
        super.cetakData();
        System.out.println("Warna: "+warna);
    }
}
