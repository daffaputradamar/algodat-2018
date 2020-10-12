package minggu8;

import java.util.Scanner;

public class QueueNasabahMain {
    static void menu(){
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
        System.out.print("Masukkan berapa maksimal data antrian = ");
        int m = scInt.nextInt();
        QueueNasabah qobj = new QueueNasabah(m);
        do{
            menu();
            pil = scInt.nextInt();
            switch(pil){
                case 1: 
                    System.out.println("Masukkan data baru: ");
                    System.out.print("Masukkan nama: ");
                    String nama = scStr.nextLine();
                    System.out.print("Masukkan no rekening: ");
                    String noRek = scStr.nextLine();
                    Nasabah nsb = new Nasabah(noRek,nama);
                    qobj.enqueue(nsb);
                    break;
                case 2:
                    Nasabah dataOut = qobj.dequeue();
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
                    System.out.print("Masukkan nama nasabah yang dicari: ");
                    String namaCari = scStr.nextLine();
                    System.out.print("Masukkan nomor rekening nasabah yang dicari: ");
                    String noRekCari = scStr.nextLine();
                    Nasabah nsbCari = new Nasabah(noRekCari,namaCari);
                    qobj.printPosition(nsbCari);
                    break;
                case 7:
                    System.out.print("Masukkan posisi yang anda inginkan: ");
                    int posCari = scInt.nextInt();
                    qobj.printNasabah(posCari);
                    break;
            }
        }while (pil >= 1 && pil < 8);
    }
}
