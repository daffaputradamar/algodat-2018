package minggu5;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa[] listMhs = new Mahasiswa[5];
    int idx;
    
    void tambah(Mahasiswa mhs){
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampil(){
        for (Mahasiswa m : listMhs) {
            m.tampil();
            System.out.println("----------------------------");
        }
    }
    
    void bubbleSort(){
        for (int i = 0; i < listMhs.length; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa tmp = listMhs[j]; 
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    
    void selectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    
    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa key = listMhs[i];
            int j = i-1;
            while(j>=0 && listMhs[j].ipk > key.ipk){
                listMhs[j+1] = listMhs[j];
                j--;
            }
            listMhs[j+1] = key;
        }
    }
}
