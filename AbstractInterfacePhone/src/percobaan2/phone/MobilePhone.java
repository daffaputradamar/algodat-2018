package percobaan2.phone;

public class MobilePhone extends Phone implements ChargeAble{

    @Override
    void call(String callNumber) {
        System.out.println("MobilePhone melakukan panggilan ke: " + callNumber);
    }

    @Override
    void endCall() {
        System.out.println("MobilePhone mengakhiri panggilan");
    }
    
    public void doCharge() {
        System.out.println("MobilePhone is charging");
    }
    
    @Override
    public void stopCharge() {
        System.out.println("MobilePhone has stopped charging");
    }
    
}
