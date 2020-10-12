package percobaan1.abstract_phone;

public class MobilePhone extends Phone {

    @Override
    void call(String callNumber) {
        System.out.println("MobilePhone melakukan panggilan ke: " + callNumber);
    }

    @Override
    void endCall() {
        System.out.println("MobilePhone mengakhiri panggilan");
    }
    
    
    
}
