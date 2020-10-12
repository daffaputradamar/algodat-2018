package televisioverrideoverload;

public class TelevisiModern extends Televisi{
    public static String TELETEXT = "Teletext";
    public static String TV = "Televisi";
    private String CD, tampilanSaatIni;
    private int halTeleText;

    public TelevisiModern(String deskripsi, int jumlahChannel) {
        super(deskripsi, jumlahChannel);
    }

    public void setDiscTray(String CD) {
        this.CD = CD;
    }

    public void setModusTampilan(String tampilan){
        if (tampilan.equals("Teletext")) {
            tampilanSaatIni = "Teletext";
        } else {
            tampilanSaatIni = "Televisi";
        }
        System.out.println("Modus Tampilan: " + tampilan);
    }
    
    public void setHalamanTeletext(int halTeleText){
        if (tampilanSaatIni.equals("Teletext")) {
            this.halTeleText = halTeleText;
            System.out.println("Berpindah ke halaman teletext " + halTeleText);
        }
    }

    public void playCD() {
        if (CD == null) {
            System.out.println("Tidak ada CD di dalam disc tray");
        } else {
            System.out.println("Memutar film " + CD);
        }
    }
    
    
    
}
