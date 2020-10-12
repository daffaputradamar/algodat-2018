package percobaan1.interface_phone;

public class MP3Player implements ChargeAble,ModAble{

    @Override
    public void doCharge() {
        System.out.println("MP3Player is charging");
    }

    @Override
    public void installMod(String modName) {
        System.out.println("MP3Player is installing Mod");
    }
    
}
