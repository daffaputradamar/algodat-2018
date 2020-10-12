package motorencapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }

    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if (kontakOn) {
            if (kecepatan + 5 > 100) {
                System.out.println("Kecepatan tidak dapat bertambah (Maks: 100)");
            } else {
                kecepatan += 5;
            }
        } else {
            System.out.println("Kecepatan tidak bertambah karena Mesin Off! \n");
        }
    }
    
    public void kurangiKecepatan(){
        if (kontakOn) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bertambah karena Mesin Off! \n");
        }
    }
    
    public void printStatus() {
        if (kontakOn) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
    }
}
