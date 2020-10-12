package percobaan1.abstract_phone;

public class TestPhone {
    public static void main(String[] args) {
        MobilePhone noqia = new MobilePhone();
        SmartPhone samsunk = new SmartPhone();
//        Phone sony = new Phone();
        
        noqia.setPhoneNumber("081234567");
        samsunk.setPhoneNumber("08567891011");
        
        noqia.call("0833445566");
        noqia.endCall();
        
        checkPhoneNumber(samsunk);
    }
    
    public static void checkPhoneNumber(Phone phone){
        System.out.println("Nomor dari telepon ini adalah: " + phone.getPhoneNumber());
    }
}
