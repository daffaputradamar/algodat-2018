package minggu1;

public class Lingkaran {
    final double PHI = 3.14; 
    double r;
    
    Lingkaran(double jari){
        r = jari;
    }
    
    double hitungLuas(){
        return PHI*Math.pow(r, 2);
    }
    double hitungKeliling(){
        return PHI*2*r;
    }
}
