package minggu11;

import java.util.Scanner;

public class DLLMainMhs {

    static Scanner scInt = new Scanner(System.in);
    static Scanner scStr = new Scanner(System.in);

    public static void main(String[] args) {

        DLLMhs dll = new DLLMhs();
        Mahasiswa baru;
        String nama;
        int menu, nilai, index;
        try {
            do {
                menu = menu();
                switch (menu) {
                    case 1:
                        System.out.println("Masukkan data: ");
                        System.out.print("Nama\t: ");
                        nama = scStr.nextLine();
                        System.out.print("Nilai\t: ");
                        nilai = scInt.nextInt();
                        baru = new Mahasiswa(nama, nilai);
                        dll.addFirst(baru);
                        break;
                    case 2:
                        System.out.println("Masukkan data: ");
                        System.out.print("Nama\t: ");
                        nama = scStr.nextLine();
                        System.out.print("Nilai\t: ");
                        nilai = scInt.nextInt();
                        baru = new Mahasiswa(nama, nilai);
                        dll.addLast(baru);
                        break;
                    case 3:
                        System.out.println("Masukkan data: ");
                        System.out.print("Nama\t: ");
                        nama = scStr.nextLine();
                        System.out.print("Nilai\t: ");
                        nilai = scInt.nextInt();
                        baru = new Mahasiswa(nama, nilai);
                        System.out.print("Masukkan posisi indeks data: ");
                        index = scInt.nextInt();
                        dll.add(baru, index);
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
                        dll.sorting();
                        break;
                }
            } while (menu != 0);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static int menu() {
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
        System.out.println("8. Urutkan data");
        System.out.println("0. Keluar");
        System.out.println("==============================");
        System.out.print(">> ");
        int menu = scInt.nextInt();
        System.out.println("==============================");

        return menu;
    }
}
