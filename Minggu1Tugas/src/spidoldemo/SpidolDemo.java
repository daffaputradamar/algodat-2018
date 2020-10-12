package spidoldemo;

public class SpidolDemo {
    public static void main(String[] args) {
        Spidol b1 = new Spidol("SnowWoman", 3000);
        Spidol b2 = new Spidol("FaberOptic", 3500);
        SpidolWarna b3 = new SpidolWarna("Standart", 2000, "Merah");
        
        b1.cetakData();
        b2.cetakData();
        b3.cetakData();
    }
}
