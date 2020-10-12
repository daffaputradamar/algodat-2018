package abtractinterfacesignal;

public class Operator {
    public void wifiControl(WIFI wifi) {
        wifi.sendData();
    }
    
    public void radioControl(Radio radio) {
        radio.sendSignal();
    }
}
