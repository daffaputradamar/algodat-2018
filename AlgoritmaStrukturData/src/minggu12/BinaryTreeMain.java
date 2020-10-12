package minggu12;

import java.util.Scanner;

public class BinaryTreeMain {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);

        int pilih = 0, isi;
        do {
            menu();
            System.out.print("Masukkan pilihan anda: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data: ");
                    isi = sc.nextInt();
                    bt.addRecursive(isi, bt.root);
                    break;
                case 2:
                    System.out.print("Masukkan data: ");
                    isi = sc.nextInt();
                    bt.delete(isi);
                    break;
                case 3:
                    System.out.print("Masukkan data: ");
                    isi = sc.nextInt();
                    System.out.println(bt.find(isi));
                    break;
                case 4:
                    bt.traverseInOrder(bt.root);
                    System.out.println();
                    break;
                case 5:
                    bt.traversePreOrder(bt.root);
                    System.out.println();
                    break;
                case 6:
                    bt.traversePostOrder(bt.root);
                    System.out.println();
                    break;
            }
        } while (pilih != 7);

    }

    static void menu() {
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Find");
        System.out.println("4. traverse inOrder");
        System.out.println("5. traverse preOrder");
        System.out.println("6. traverse postOrder");
        System.out.println("7. keluar");
    }
}
