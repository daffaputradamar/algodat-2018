package percobaan2.phone;

public class TestPhone {
    public static void main(String[] args) {
        MobilePhone noqia = new MobilePhone();
        SmartPhone samsunk = new SmartPhone();
        MP3Player iphod = new MP3Player();
        USBCharger charger = new USBCharger();
        
        charger.charge(noqia);
        charger.charge(iphod);
        
        charger.stop(noqia);
        charger.stop(iphod);

    }
}
