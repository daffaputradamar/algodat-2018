package minggu5;

import java.util.Scanner;

public class BarangMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        KeranjangBelanja data = new KeranjangBelanja();
        int jumBrg = data.listBarang.length;
        
        Barang b1 = new Barang("Kertas A4", 3, 2000);
        data.tambah(b1);
        Barang b2 = new Barang("Pensil", 2, 100);
        data.tambah(b2);
        Barang b3 = new Barang("Penghapus", 1, 500);
        data.tambah(b3);
        Barang b4 = new Barang("Spidol", 3, 200);
        data.tambah(b4);

        System.out.println("Data Barang sebelum sorting = ");
        data.tampil();
        
        System.out.println("Data barang berdasarkan harga satuan = ");
        data.bubbleSort();
        data.tampil();
        System.out.println("Data barang berdasarkan harga total per barang = ");
        data.selectionSort();
        data.tampil();
        System.out.println("Data Barang berdasarkan jumlah barang = ");
        data.sort(data.listBarang, 0, data.listBarang.length-1);
        data.tampil();
    }
}
