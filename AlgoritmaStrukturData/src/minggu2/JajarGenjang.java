package minggu2;

public class JajarGenjang {
    public int tinggi;
    public int panjang;
    public int sisimiring;
    
    public JajarGenjang(int tg, int pj, int sm){
        tinggi = tg;
        panjang = pj;
        sisimiring = sm;
    }
    
    int hitungLuas(){
        return tinggi * panjang;
    }
    
    int hitungKeliling(){
        return 2 * (panjang + sisimiring);
    }
}
