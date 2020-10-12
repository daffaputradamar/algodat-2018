package abtractinterfacesignal;

public class TestSignal {

    public static void main(String[] args) {
        Desktop aceer = new Desktop();
        RaspberryPi rp = new RaspberryPi();
        Drone dji = new Drone();
        Operator op = new Operator();
        
        op.wifiControl(aceer);
        op.wifiControl(rp);
        op.wifiControl(dji);
        op.radioControl(rp);
        op.radioControl(dji);
    }
    
}
