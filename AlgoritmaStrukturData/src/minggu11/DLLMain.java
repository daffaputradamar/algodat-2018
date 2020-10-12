package minggu11;

import java.util.Scanner;

public class DLLMain {

    static Scanner scInt = new Scanner(System.in);

    public static void main(String[] args) {

        DoubleLinkedList dll = new DoubleLinkedList();
        int menu, data, index;
        try {
            do {
                menu = menu();
                switch (menu) {
                    case 1:
                        System.out.print("Masukkan data: ");
                        data = scInt.nextInt();
                        dll.addFirst(data);
                        break;
                    case 2:
                        System.out.print("Masukkan data: ");
                        data = scInt.nextInt();
                        dll.addLast(data);
                        break;
                    case 3:
                        System.out.print("Masukkan data: ");
                        data = scInt.nextInt();
                        System.out.print("Masukkan posisi indeks data: ");
                        index = scInt.nextInt();
                        dll.add(data, index);
                        break;
                    case 4:
                        dll.removeFirst();
                        break;
                    case 5:
                        dll.removeLast();
                        break;
                    case 6:
                        System.out.print("Masukkan posisi indeks data: ");
                        index = scInt.nextInt();
                        dll.remove(index);
                        break;
                    case 7:
                        dll.print();
                        break;
                    case 8:
                        System.out.print("Masukkan data: ");
                        data = scInt.nextInt();
                        int idxDt = dll.getByData(data);
                        System.out.println("Data: "+data+" ditemukan pada indeks ke: "+idxDt);
                        break;
                    case 9:
                        dll.sorting();
                        break;
                }
            } while (menu != 0);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static int menu() throws Exception {
        System.out.println("DOUBLE LINK LIST DENGAN MENU");
        System.out.println("==============================");
        System.out.println("Memilih menu");
        System.out.println("1. Tambah awal");
        System.out.println("2. Tambah akhir");
        System.out.println("3. Tambah data di indeks tertentu");
        System.out.println("4. Hapus awal");
        System.out.println("5. Hapus akhir");
        System.out.println("6. Hapus indeks tertentu");
        System.out.println("7. Cetak data");
        System.out.println("8. Cari");
        System.out.println("9. Urutkan data");
        System.out.println("0. Keluar");
        System.out.println("==============================");
        System.out.print(">> ");
        int menu = scInt.nextInt();
        System.out.println("==============================");

        return menu;
    }
}
