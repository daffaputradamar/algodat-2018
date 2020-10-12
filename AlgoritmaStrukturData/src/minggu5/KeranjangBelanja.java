package minggu5;

public class KeranjangBelanja {

    Barang[] listBarang = new Barang[4];
    int idx;

    void tambah(Barang brg) {
        if (idx < listBarang.length) {
            listBarang[idx] = brg;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Barang brg : listBarang) {
            brg.tampil();
            System.out.println("-----------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listBarang.length; i++) {
            for (int j = 1; j < listBarang.length - i; j++) {
                if (listBarang[j].hargaSatuan < listBarang[j - 1].hargaSatuan) {
                    Barang tmp = listBarang[j];
                    listBarang[j] = listBarang[j - 1];
                    listBarang[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listBarang.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listBarang.length; j++) {
                if (listBarang[j].hitungHargaTotal() < listBarang[idxMin].hitungHargaTotal()) {
                    idxMin = j;
                }
            }
            Barang tmp = listBarang[idxMin];
            listBarang[idxMin] = listBarang[i];
            listBarang[i] = tmp;
        }
    }

    void mergeSort(Barang brg[], int l, int m, int r) {
        int pjgBrg1 = m - l + 1;
        int pjgBrg2 = r - m;

        Barang[] brg1 = new Barang[pjgBrg1];
        Barang[] brg2 = new Barang[pjgBrg2];

        for (int i = 0; i < pjgBrg1; i++) {
            brg1[i] = brg[l + i];
        }

        for (int i = 0; i < pjgBrg2; i++) {
            brg2[i] = brg[m + 1 + i];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < pjgBrg1 && j < pjgBrg2) {
            if (brg1[i].jumlah <= brg2[j].jumlah) {
                brg[k] = brg1[i];
                i++;
            } else {
                brg[k] = brg2[j];
                j++;
            }
            k++;
        }

        while (i < pjgBrg1) {
            brg[k] = brg1[i];
            i++;
            k++;
        }
        while (j < pjgBrg2) {
            brg[k] = brg2[j];
            j++;
            k++;
        }
    }
    
    void sort(Barang[] brg, int l, int r){
        if (l < r) {
            int m = (l + r)/2;
            
            sort(brg, l, m);
            sort(brg, m+1, r);
            
            mergeSort(brg, l, m, r);
        }
    }
}
