package minggu7;

import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        System.out.print("Masukkan ukuran: ");    
        int size = scInt.nextInt();
        
        Stack tumpuk = new Stack(size);
        for (int i = 0; i < size; i++) {
            System.out.print("Masukkan data ke-"+i+": ");
            String isi = scStr.nextLine();
            tumpuk.push(isi);
        }
        
        tumpuk.tampilkan();
    }
}
