package minggu14;

import java.util.Scanner;

public class ProjectBST {

    static Scanner scInt = new Scanner(System.in);

    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();

        int menu = 0;
        int data;

        do {
            menu = menu();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan data: ");
                    data = scInt.nextInt();
                    b.insert(data);
                    break;
                case 2:
                    System.out.print("Masukkan data: ");
                    data = scInt.nextInt();
                    b.delete(data);
                    break;
                case 3:
                    System.out.print("Masukkan data: ");
                    data = scInt.nextInt();
                    Node cari = b.findNode(data);
                    if (cari == null) {
                        System.out.println("Data yang anda cari tidak dapat ditemukan.");
                    } else {
                        System.out.println("Data "+cari.data+" ditemukan.");
                    }
                    break;
                case 4:
                    b.display(b.root);
                    System.out.println();
                    break;
                case 5:
                    b.getMin();
                    break;
                case 6:
                    b.getMax();
                    break;
            }

        } while (menu != 7);

    }

    static int menu() {
        System.out.println("BINARY SEARCH TREE DENGAN MENU");
        System.out.println("==============================");
        System.out.println("Memilih menu");
        System.out.println("1. Insert Data");
        System.out.println("2. Delete Data");
        System.out.println("3. Find Data");
        System.out.println("4. Display Binary Tree");
        System.out.println("5. Get Min");
        System.out.println("6. Get Max");
        System.out.println("7. Keluar");
        System.out.println("==============================");
        System.out.print(">> ");
        int menu = scInt.nextInt();
        System.out.println("==============================");

        return menu;
    }
}
