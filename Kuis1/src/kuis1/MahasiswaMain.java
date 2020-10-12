package kuis1;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        
        Scanner scDouble = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        
        Mahasiswa[] mhs = new Mahasiswa[5];
        
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Mahasiswa ke-"+(i+1)+": ");
            mhs[i] = new Mahasiswa();
            System.out.print("Masukkan nama: ");
            mhs[i].nama = scStr.nextLine();
            System.out.print("Masukkan nim: ");
            mhs[i].nim = scStr.nextLine();
            System.out.println("Masukkan nilai ip: ");
            for (int j = 0; j < mhs[i].ipSemester.length; j++) {
                System.out.print("IP ke-"+(j+1)+": ");
                mhs[i].ipSemester[j] = scDouble.nextDouble();
            }
            System.out.println("Masukkan kelas: ");
            mhs[i].kelas = scStr.nextLine();
        }
        
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Mahasiswa ke-"+(i+1)+": ");
            mhs[i].tampil();
        }
        
        int rata_rata = 0;
        int count = 0;
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].kelas.equalsIgnoreCase("1G")) {
                count++;
                rata_rata += mhs[i].hitungIpRataRata();
            }
        }
        System.out.println("Jumlah nilai rata - rata IP Mahasiswa 1G: "+ rata_rata/count);
    
        double max = 0;
        int datake = 0;
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].kelas.equalsIgnoreCase("1G") && max < mhs[i].hitungIpRataRata()) {
                datake = i;
                max = mhs[i].hitungIpRataRata();
            }
        }
        System.out.println("rata - rata IP Tertinggi Mahasiswa 1G: " + max);
        mhs[datake].tampil();
    }
}
