package minggu3;

public class KaliMatriksDC {

    Matriks matriks1 = new Matriks();
    Matriks matriks2 = new Matriks();

    public KaliMatriksDC(Matriks matrik1, Matriks matrik2) {
        for (int i = 0; i < matrik1.elemenMatriks.length; i++) {
            for (int j = 0; j < matrik1.elemenMatriks[i].length; j++) {
                matriks1.elemenMatriks[i][j] = matrik1.elemenMatriks[i][j];
                matriks2.elemenMatriks[i][j] = matrik2.elemenMatriks[i][j];
            }
        }
    }

    void DivideConquer(Matriks hasil, int tambah, int size, int baris, int kolom, int kali){
        if (kali == size) {
            kali = 0;
            kolom++;
            if (kolom == size) {
                kolom = 0;
                baris++;
                if (baris == size) {
                    tampilDC(hasil);
                return;
                }
            }
        }
        tambah = sum(hasil,tambah,size, baris, kolom, kali, matriks1.elemenMatriks[baris][kali]*matriks2.elemenMatriks[kali][kolom]);
        DivideConquer(hasil, tambah, size, baris, kolom, kali+1);
    }

    int sum(Matriks hasil, int tambah,int size,int baris,int kolom, int kali, int hasilKali) {
        if (kali < size) {
            tambah = tambah + hasilKali;
            if (kali == size - 1) {
                hasil.elemenMatriks[baris][kolom]= tambah;
                tambah = 0;
            }
        }
        return tambah;
    }
    
    public void tampilDC(Matriks hasil){
        for (int i = 0; i < hasil.elemenMatriks.length; i++) {
            for (int j = 0; j < hasil.elemenMatriks[i].length; j++) {
                System.out.print(hasil.elemenMatriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}


