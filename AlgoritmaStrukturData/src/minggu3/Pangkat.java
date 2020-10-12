package minggu3;

public class Pangkat {
    public int x, n;
    
    int pangkatBruteforce(int angka, int pangkat){
        int hasil = 1;
        for (int i = 1; i <= pangkat; i++) {
            hasil *= angka;
        }
        return hasil;
    }
    
    int pangkatDivideConquer(int angka, int pangkat){
        if (pangkat == 1) {
            return angka;
        }
        return angka *= pangkatDivideConquer(angka, pangkat-1);
    }
}
