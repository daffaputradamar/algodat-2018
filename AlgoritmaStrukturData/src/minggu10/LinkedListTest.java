package minggu10;

import java.util.Scanner;

public class LinkedListTest {

    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        LinkedList data = new LinkedList();

        int menu, submenu, nilai;

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
                                System.out.print("Masukkan data node: ");
                                nilai = scInt.nextInt();
                                data.addFirst(nilai);
                                break;
                            case 2:
                                System.out.print("Masukkan data node: ");
                                nilai = scInt.nextInt();
                                System.out.print("Masukkan index: ");
                                int indeks = scInt.nextInt();
                                data.add(nilai, indeks);
                                break;
                            case 3:
                                System.out.print("Masukkan data node yang dicari: ");
                                nilai = scInt.nextInt();
                                System.out.print("Masukkan data node: ");
                                int nilaidata = scInt.nextInt();
                                data.addAfter(nilai, nilaidata);
                                break;
                            case 4:
                                System.out.print("Masukkan data node: ");
                                nilai = scInt.nextInt();
                                data.addLast(nilai);
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
                                System.out.print("Masukkan data node: ");
                                nilai = scInt.nextInt();
                                data.removeByKey(nilai);
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
                                int item = data.get(indeks);
                                System.out.println("Data: " + item);
                                break;
                            case 2:
                                System.out.print("Masukkan nilai: ");
                                nilai = scInt.nextInt();
                                int index = data.getByKey(nilai);
                                System.out.println("Index: " + index);
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
