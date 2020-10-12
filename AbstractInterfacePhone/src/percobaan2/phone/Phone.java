package percobaan2.phone;

abstract class Phone {
    protected String phoneNumber;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    abstract void call(String callNumber);
    abstract void endCall();
}
