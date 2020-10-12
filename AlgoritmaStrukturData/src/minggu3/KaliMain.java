package minggu3;

import java.util.Scanner;

public class KaliMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = 4;
        
        long[] x = new long[digit];
        long[] y = new long[digit];
        
        for (int i = 0; i < digit; i++) {
            System.out.print("Masukkan nilai x digit ke-"+(i+1)+": ");
            x[i] = sc.nextLong();
        }
        System.out.println();
        for (int i = 0; i < digit; i++) {
            System.out.print("Masukkan nilai y digit ke-"+(i+1)+": ");
            y[i] = sc.nextLong();
        }
        
        Kali kali = new Kali();
        kali.Kalil(x, y, digit);
    }
}
