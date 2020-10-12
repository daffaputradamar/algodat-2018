package overloadgasstation;

public class GasStation {
    public void isiBahanBakar(MobilMewah mw, double harga) {
        System.out.println("Mobil mewah telah diisi pertamax sejumlah " + harga/9500 +  " liter");
    }
    
    public void isiBahanBakar(MobilKuno mk, double harga) {
        System.out.println("Mobil kuno telah diisi pertalite sejumlah " + harga/7800 + " liter");
    }
}
