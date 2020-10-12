package minggu2;

import java.util.Scanner;

public class NilaiMahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
       
        NilaiMahasiswa[] mhs = new NilaiMahasiswa[jmlMhs];
        
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Mahasiswa ke-"+(i+1));
            System.out.print("nilai 1: ");
            int nilai1 = sc.nextInt();
            System.out.print("nilai 2: ");
            int nilai2 = sc.nextInt();
            
            mhs[i] = new NilaiMahasiswa(nilai1, nilai2);
        }
        
        System.out.println();
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Nilai terbaik Mhs " + (i+1)+": "+mhs[i].nilaiTertinggi());
        }
    }
}
