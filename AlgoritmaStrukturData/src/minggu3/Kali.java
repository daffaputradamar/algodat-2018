package minggu3;

public class Kali {
    int temp;
    int AngkaSatuan;
    int AngkaPuluhan;
//    private String simpanString, angkasatu;

    public void Kalil(long[] x, long[] y, int n){
        int hasilBaris = n;
        int hasilKolom = n*n;

        int[][] hasil = new int[hasilBaris][hasilKolom];
        int isiBaris = 0;
        int isiKolom = hasilKolom-1;
        int[] simpan = new int[n];


        for (int i = n-1; i >= 0; i--) {
            AngkaPuluhan = 0;
            for (int j = n-1; j >= 0; j--) {
                temp = (int)(x[j] * y[i]);
                temp = temp + AngkaPuluhan;
                AngkaSatuan = temp % 10;
                AngkaPuluhan = temp / 10;
                if (j == 0 && String.valueOf(temp).length() == 2) {
                    hasil[isiBaris][isiKolom] = AngkaSatuan;
                    hasil[isiBaris][isiKolom-1] = AngkaPuluhan;
                } else {
                    hasil[isiBaris][isiKolom] = AngkaSatuan;
                }
                isiKolom--;
            }
            isiBaris++;
            isiKolom = hasilKolom-1;
        }
//        tampilHasil(hasil);
//        return;
        int[][] newHasil = hilangNull(simpan, hasil, n);
        int[][] finalHasil = tambahNol(newHasil, newHasil[0].length);
        int[] hasilAkhir = hitungHasil(finalHasil);

        tampilHasil(hasilAkhir);
    }
    
    int[] hitungHasil(int[][] finalHasil){
        int AngkaPuluh = 0;
        int AngkaSatu;
        int simpan;
        int[] hasilAkhir = new int[finalHasil[0].length];

        for (int i = finalHasil[0].length-1; i >= 0; i--) {
//            for (int j = finalHasil.length-1; j >= 0; j--) {
            simpan = finalHasil[0][i] + finalHasil[1][i] + finalHasil[2][i] + finalHasil[3][i];
            simpan = simpan + AngkaPuluh;
            AngkaSatu = simpan % 10;
            AngkaPuluh = simpan / 10;
            
            hasilAkhir[i] = AngkaSatu;
//            }
        }
        return hasilAkhir;
    }
    
    int[][] tambahNol(int[][] newHasil, int batas){
        if (batas == 4) {
            int[][] finalHasil = {
            {0, 0, 0, newHasil[0][0], newHasil[0][1], newHasil[0][2], newHasil[0][3]},
            {0, 0, newHasil[1][0], newHasil[1][1], newHasil[1][2], newHasil[1][3], 0},
            {0, newHasil[2][0], newHasil[2][1], newHasil[2][2], newHasil[2][3], 0, 0},
            {newHasil[3][0], newHasil[3][1], newHasil[3][2], newHasil[3][3], 0, 0, 0},
            };
            return finalHasil;

        } else if (batas == 5) {
            int[][] finalHasil = {
            {0, 0, 0, newHasil[0][0], newHasil[0][1], newHasil[0][2], newHasil[0][3], newHasil[0][4]},
            {0, 0, newHasil[1][0], newHasil[1][1], newHasil[1][2], newHasil[1][3], newHasil[1][4], 0},
            {0, newHasil[2][0], newHasil[2][1], newHasil[2][2], newHasil[2][3], newHasil[2][4], 0, 0},
            {newHasil[3][0], newHasil[3][1], newHasil[3][2], newHasil[3][3], newHasil[3][4], 0, 0, 0},
            };
            return finalHasil;
        }
        return newHasil;
    }
    
    int[][] hilangNull(int[] simpan, int[][] hasil, int digit){
        boolean stop;
        int isiBaris = 0;
        int isiKolom = 0;
        int count;
        for (int i = 0; i < hasil.length; i++) {
            count = 0;
            stop = false;
            for (int j = 0; j < hasil[i].length; j++) {
                if (hasil[i][j] != 0) {
                    stop = true;   
                }
                if (stop) {
                    count++;
                }
            }
            simpan[i] = count;
        }
        int maxSimpan = maxCount(simpan);
        int[][] newHasil = new int[digit][maxSimpan];
        for (int i = 0; i < hasil.length; i++) {
            if (isiBaris == newHasil.length) {
                break;
            }
            stop = false;
            for (int j = 0; j < hasil[i].length; j++) {
                if (isiKolom == maxSimpan) {
                    break;
                }
                if (j >= (digit*digit)- maxSimpan) {
                    stop = true;   
                }
                if (stop) {
                    newHasil[isiBaris][isiKolom] = hasil[i][j];
                    isiKolom++;
                }
            }
            if (stop) {
                isiKolom = 0;
                isiBaris++;   
            }
        }
        return newHasil;
    }
    
    int maxCount(int[] simpan){
        int max = simpan[0];
        for (int i = 1; i < simpan.length; i++) {
            if (max < simpan[i]) {
                max = simpan[i];
            }
        }
        return max;
    }
    
    void tampilHasil(int[] hasil){
        System.out.print("Hasil: ");
        for (int i = 0; i < hasil.length; i++) {
            if (i == 0 && hasil[0] == 0) {
                continue;
            }
            System.out.print(hasil[i]);
        }
        System.out.println();
    }
}
