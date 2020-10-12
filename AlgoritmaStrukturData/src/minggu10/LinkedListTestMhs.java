package minggu10;

import java.util.Scanner;

public class LinkedListTestMhs {

    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        LinkedListMahasiswa data = new LinkedListMahasiswa();

        int menu, submenu;
        String nama, nim, cari;
        Mahasiswa baru, cariMhs;

        try {
            do {
                menu();
                System.out.print("Masukkan pilihan anda: ");
                menu = scInt.nextInt();
                if (menu == 4) {
                    break;
                }
                do {
                    submenu(menu);
                    System.out.print("Masukkan pilihan anda: ");
                    submenu = scInt.nextInt();
                    if (submenu == 9) {
                        break;
                    }
                    if (menu == 1) {
                        switch (submenu) {
                            case 1:
                                System.out.println("Masukkan data mahasiswa baru: ");
                                System.out.print("Masukkan nama: ");
                                nama = scStr.nextLine();
                                System.out.print("Masukkan nim: ");
                                nim = scStr.nextLine();
                                baru = new Mahasiswa(nama, nim);
                                data.addFirst(baru);
                                break;
                            case 2:
                                System.out.print("Masukkan index: ");
                                int indeks = scInt.nextInt();
                                System.out.println("Masukkan data mahasiswa baru: ");
                                System.out.print("Masukkan nama: ");
                                nama = scStr.nextLine();
                                System.out.print("Masukkan nim: ");
                                nim = scStr.nextLine();
                                baru = new Mahasiswa(nama, nim);
                                data.add(baru, indeks);
                                break;
                            case 3:
                                System.out.print("Masukkan nim mahasiswa yang dicari: ");
                                cari = scStr.nextLine();
                                cariMhs = new Mahasiswa();
                                cariMhs.nim = cari;
                                System.out.println("Masukkan data mahasiswa baru: ");
                                System.out.print("Masukkan nama: ");
                                nama = scStr.nextLine();
                                System.out.print("Masukkan nim: ");
                                nim = scStr.nextLine();
                                baru = new Mahasiswa(nama, nim);
                                data.addAfter(cariMhs, baru);
                                break;
                            case 4:
                                System.out.println("Masukkan data mahasiswa baru: ");
                                System.out.print("Masukkan nama: ");
                                nama = scStr.nextLine();
                                System.out.print("Masukkan nim: ");
                                nim = scStr.nextLine();
                                baru = new Mahasiswa(nama, nim);
                                data.addLast(baru);
                                break;
                        }
                    } else if (menu == 2) {
                        switch (submenu) {
                            case 1:
                                System.out.print("Masukkan index: ");
                                int indeks = scInt.nextInt();
                                data.remove(indeks);
                                break;
                            case 2:
                                System.out.print("Masukkan nim mahasiswa yang ingin dihapus: ");
                                cari = scStr.nextLine();
                                cariMhs = new Mahasiswa();
                                cariMhs.nim = cari;
                                data.removeByKey(cariMhs);
                                break;
                            case 3:
                                data.clear();
                                break;
                        }
                    } else if (menu == 3) {
                        switch (submenu) {
                            case 1:
                                System.out.print("Masukkan index: ");
                                int indeks = scInt.nextInt();
                                Mahasiswa item = data.get(indeks);
                                System.out.println("Mahasiswa di indeks ke-"+indeks+" adalah: ");
                                item.print();
                                break;
                            case 2:
                                System.out.print("Masukkan nim mahasiswa yang ingin dicari: ");
                                cari = scStr.nextLine();
                                cariMhs = new Mahasiswa();
                                cariMhs.nim = cari;
                                int index = data.getByKey(cariMhs);
                                System.out.println("Data mahasiswa berada di index: " + index);
                                break;
                        }
                    }
                } while (submenu != 9);
            } while (menu != 4);
            data.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void menu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Keluar");
    }

    static void submenu(int menu) {
        switch (menu) {
            case 1:
                System.out.println("SubMenu 1:");
                System.out.println("1. Tambah (First)");
                System.out.println("2. Tambah (Index)");
                System.out.println("3. Tambah (Key)");
                System.out.println("4. Tambah (Last)");
                System.out.println("9. Keluar");
                break;
            case 2:
                System.out.println("SubMenu 2:");
                System.out.println("1. Hapus (Index)");
                System.out.println("2. Hapus (Key)");
                System.out.println("3. Clear");
                System.out.println("9. Keluar");
                break;
            case 3:
                System.out.println("SubMenu 3:");
                System.out.println("1. Cari (Index)");
                System.out.println("2. Cari (Key)");
                System.out.println("9. Keluar");
                break;
        }
    }
}
