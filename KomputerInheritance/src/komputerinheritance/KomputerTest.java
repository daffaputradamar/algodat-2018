package komputerinheritance;

public class KomputerTest {
    public static void main(String[] args) {
        Mac mac = new Mac("Mac Defender", "Karbon", "Mac", "Intel HD", 4, 8);
        mac.tampilMac();
        
        Windows win = new Windows("Browsing", 21, "Windows", "Intel HD", 4, 8);
        win.tampilWindows();
        
        PC pc = new PC(21, "Windows", "Pentium 4", 3, 2);
        pc.tampilPC();
    }
}
