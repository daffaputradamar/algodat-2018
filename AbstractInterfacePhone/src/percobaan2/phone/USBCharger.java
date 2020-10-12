package percobaan2.phone;

public class USBCharger {
    public void charge(ChargeAble device){
        device.doCharge();
    }
    
    public void stop(ChargeAble device) {
        device.stopCharge();
    }
}
