package tugasminggu1;

public class KacamataMinus extends Kacamata {
    private double minus;
    
    public void setMinus(double newVal){
        minus = newVal;
    }
    
    public void gantiLensaMinus(double newVal){
        setMinus(newVal);
    }
    
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Minus: "+minus);
    }
}
