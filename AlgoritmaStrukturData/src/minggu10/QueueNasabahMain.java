package minggu10;

import java.util.Scanner;

public class QueueNasabahMain {

    static void menu() {
        System.out.println("Pilih operasi yang ingin dilakukan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Print data yang berada di depan");
        System.out.println("5. Print data yang berada di belakang");
        System.out.println("6. Cari indeks data yang anda input");
        System.out.println("7. Cari data di posisi yang anda tentukan");
        System.out.println("8. Keluar");
    }

    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        int pil = 0;
        
        QueueLinkedList qobj = new QueueLinkedList();
        
        do {
            menu();
            pil = scInt.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("Masukkan data baru: ");
                    System.out.println("Masukkan data mahasiswa baru: ");
                    System.out.print("Masukkan nama: ");
                    String nama = scStr.nextLine();
                    System.out.print("Masukkan nim: ");
                    String nim = scStr.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nama, nim);
                    qobj.enqueue(mhs);
                    break;
                case 2:
                    Mahasiswa dataOut = qobj.dequeue();
                    if (dataOut != null) {
                        System.out.println("Data yang terambil: ");
                        dataOut.print();
                    }
                    break;
                case 3:
                    qobj.print();
                    break;
                case 4:
                    qobj.printFront();
                    break;
                case 5:
                    qobj.printRear();
                    break;
                case 6:
                    System.out.print("Masukkan nim mahasiswa yang dicari: ");
                    String cari = scStr.nextLine();
                    Mahasiswa mhsCari = new Mahasiswa();
                    mhsCari.nim = cari;
                    qobj.printPosition(mhsCari);
                    break;
                case 7:
                    System.out.print("Masukkan posisi yang anda inginkan: ");
                    int posCari = scInt.nextInt();
                    qobj.printDataByPos(posCari);
                    break;
            }
        } while (pil >= 1 && pil < 8);
    }
}
