package percobaan1.interface_phone;

public class MobilePhone extends Phone {

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
    
}
