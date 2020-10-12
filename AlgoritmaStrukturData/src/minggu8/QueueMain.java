package minggu8;

import java.util.Scanner;

public class QueueMain {
    
    static void menu(){
        System.out.println("Pilih operasi yang ingin dilakukan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Print data yang berada di depan");
        System.out.println("5. Print data yang berada di belakang");
        System.out.println("6. Cari posisi data yang anda input");
        System.out.println("7. Cari data di posisi yang anda tentukan");
        System.out.println("8. Keluar");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pil = 0;
        System.out.print("Masukkan berapa maksimal data antrian = ");
        int m = sc.nextInt();
        Queue qobj = new Queue(m);
        do{
            menu();
            pil = sc.nextInt();
            switch(pil){
                case 1: 
                    System.out.print("Masukkan data baru: ");
                    int dataIn = sc.nextInt();
                    qobj.enqueue(dataIn);
                    break;
                case 2:
                    int dataOut = qobj.dequeue();
                    if (dataOut != 0) {
                        System.out.println("Data yang terambil: " + dataOut);
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
                    System.out.print("Masukkan data yang dicari: ");
                    int dataCari = sc.nextInt();
                    qobj.printPosition(dataCari);
                    break;
                case 7:
                    System.out.print("Masukkan posisi yang anda inginkan: ");
                    int posCari = sc.nextInt();
                    qobj.printDataByPos(posCari);
                    break;
            }
        }while (pil >= 1 && pil < 8);
    }
}
