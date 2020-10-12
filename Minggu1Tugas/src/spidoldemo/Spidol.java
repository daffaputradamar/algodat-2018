package spidoldemo;

public class Spidol {
    private String merek;
    private int harga;

    public Spidol(String merek, int harga) {
        this.merek = merek;
        this.harga = harga;
    }
    
    public void cetakData() {
        System.out.println("Merek: "+merek);
        System.out.println("Harga: "+ harga);
    }
}
