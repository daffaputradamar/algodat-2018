package minggu2;

public class Tanah {
    public int panjang;
    public int lebar;
    
    public Tanah(int p, int l){
        panjang = p;
        lebar = l;
    }
    
    int hitungLuas(){
        return panjang*lebar;
    }
}
