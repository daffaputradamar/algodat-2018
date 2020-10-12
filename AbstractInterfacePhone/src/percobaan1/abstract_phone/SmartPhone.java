package percobaan1.abstract_phone;

public class SmartPhone extends Phone {
    public String ipAddress;

    @Override
    void call(String callNumber) {
        System.out.println("SmartPhone melakukan panggilan ke: " + callNumber);
    }

    @Override
    void endCall() {
        System.out.println("SmartPhone mengakhiri panggilan");
    }
    
    public void connectToNetwork() {
        System.out.println("Smartphone melakukan koneksi jaringan");
    }
    
    
}
