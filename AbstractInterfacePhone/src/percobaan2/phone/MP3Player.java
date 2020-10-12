package percobaan2.phone;

public class MP3Player implements ChargeAble{
    public int storageCapacity;
    
    public void playMusic(String filename){
        System.out.println("PLaying music: " + filename);
    }
    
    @Override
    public void doCharge() {
        System.out.println("MP3Player is charging");
    }

    @Override
    public void stopCharge() {
        System.out.println("MP3Player has stopped charging");
    }
    
}
