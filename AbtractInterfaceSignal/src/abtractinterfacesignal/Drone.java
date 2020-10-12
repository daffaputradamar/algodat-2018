package abtractinterfacesignal;

public class Drone implements WIFI, Radio{
    public int maxSpeed, maxAltitudel;

    @Override
    public void sendData() {
        System.out.println("Controlling Drone via WIFI..");
    }

    @Override
    public void sendSignal() {
        System.out.println("Controlling Drone via Radio..");
    }
}
