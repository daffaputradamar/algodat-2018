package minggu2;

import java.util.Scanner;

public class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah tanah: ");
        int jmlTanah = sc.nextInt();
        
        Tanah[] tn = new Tanah[jmlTanah];
        
        for (int i = 0; i < tn.length; i++) {
            System.out.println("Tanah ke-"+(i+1));
            System.out.print("Panjang: ");
            int panjang = sc.nextInt();
            System.out.print("Lebar: ");
            int lebar = sc.nextInt();
            
            tn[i] = new Tanah(panjang, lebar);
        }
        System.out.println("");
        for (int i = 0; i < tn.length; i++) {
            System.out.println("Luas Tanah "+(i+1)+": "+tn[i].hitungLuas());
        }
    }
}
