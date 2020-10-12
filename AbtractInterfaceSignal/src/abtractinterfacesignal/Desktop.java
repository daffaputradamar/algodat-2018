package abtractinterfacesignal;

public class Desktop extends Computer implements WIFI{
    public int battCapacity;

    @Override
    public void sendData() {
        System.out.println("Controlling Desktop via WIFI..");
    }
    
}
