package abtractinterfacesignal;

public class RaspberryPi extends Computer implements WIFI,Radio{
   public int numSocket;

    @Override
    public void sendData() {
        System.out.println("Controlling Raspberry Pi via WIFI..");
    }

    @Override
    public void sendSignal() {
        System.out.println("Controlling Raspberry Pi via Radio..");
    }
}
