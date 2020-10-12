/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu5_2;

/**
 *
 * @author Daffa
 */
public class Peringkat {
    static Mahasiswa[] listMhs = new Mahasiswa[5];
    
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Andi", 8.2, 8.3, 8.0);
        Mahasiswa mhs2 = new Mahasiswa("Budi", 8.3, 8.2, 8.0);
        Mahasiswa mhs3 = new Mahasiswa("Cindy", 8.2, 8.4, 7.9);
        Mahasiswa mhs4 = new Mahasiswa("Danang", 8.2, 8.0, 8.0);
        Mahasiswa mhs5 = new Mahasiswa("Ema", 9.0, 8.0, 8.0);

        listMhs[0] = mhs1;
        listMhs[1] = mhs2;
        listMhs[2] = mhs3;
        listMhs[3] = mhs4;
        listMhs[4] = mhs5;
        
        insertionSort();
        outputFirstThree();
    }
    
    static void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa key = listMhs[i];
            int j = i-1;
            while(j>=0 && key.total >= listMhs[j].total){
                if (listMhs[j].total == key.total) {
                    for (int k = 0; k < key.nilai.length; k++) {
                        if (key.nilai[k] > listMhs[j].nilai[k]) {
                            listMhs[j+1] = listMhs[j];
                            break;
                        }
                    }
                } else {
                 listMhs[j+1] = listMhs[j];   
                }
                j--;
            }
            listMhs[j+1] = key;
        }
    }
    
    static void outputFirstThree() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Peringkat ke-"+ (i+1) +": " + listMhs[i].name);
        }
    }
}

