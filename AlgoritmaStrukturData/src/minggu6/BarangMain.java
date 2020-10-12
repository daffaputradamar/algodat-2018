package minggu6;

import java.util.Scanner;

public class BarangMain {
    
    public static void selectionSort(Barang[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j].nomorUrut < arr[idxMin].nomorUrut) {
                    idxMin = j;
                }
            }
            Barang tmp = arr[idxMin];
            arr[idxMin] = arr[i];
            arr[i] = tmp;
        }
    }
    
    public static int binarySearch(Barang[] arr, int x) {
        int awal = 0, akhir = arr.length - 1;
        while (awal <= akhir) {
            int tengah = awal + (akhir - awal) / 2;
            if (arr[tengah].nomorUrut == x) {
                return tengah;
            }
            if (arr[tengah].nomorUrut < x) {
                awal = tengah + 1;
            } else {
                akhir = tengah - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner (System.in);
        
        System.out.print("Jumlah Barang: ");
        int n = scInt.nextInt();
        
        Barang[] brg = new Barang[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Barang ke-"+i);
            System.out.print("Masukkan nomor urut barang: ");
            int urut = scInt.nextInt();
            System.out.print("Masukkan nama barang: ");
            String nama = scStr.nextLine();
            System.out.print("Masukkan jumlah stok barang: ");
            int stok = scInt.nextInt();
            System.out.print("Masukkan harga barang: ");
            int harga = scInt.nextInt();
            brg[i] = new Barang(nama, urut, stok, harga);
        }
        
        System.out.print("Nomor urut yang dicari: ");
        int cari = scInt.nextInt();
        
        int hasil;
        
        selectionSort(brg);
        hasil = binarySearch(brg,cari);
        
        if (hasil == -1) {
            System.out.println("Pencarian tidak ketemu");
        } else {
            System.out.println("Data terletak pada indeks ke-"+hasil);
            brg[hasil].tampil();
        }
    }
}
