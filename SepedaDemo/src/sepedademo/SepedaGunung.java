package sepedademo;

public class SepedaGunung extends Sepeda {
    private String tipeSuspensi;
    
    public void setTipeSupensi(String newValue){
        tipeSuspensi = newValue;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe suspensi: " + tipeSuspensi);
    }
}
