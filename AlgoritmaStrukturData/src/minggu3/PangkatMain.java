package minggu3;

import java.util.Scanner;

public class PangkatMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai Angka: ");
        int angka = sc.nextInt();
        System.out.print("Masukkan nilai Pangkat: ");
        int pangkat = sc.nextInt();

        Pangkat obj = new Pangkat();
        obj.x = angka;
        obj.n = pangkat;

        System.out.println("Brute Force: " + obj.pangkatBruteforce(obj.x, obj.n));
        System.out.println("Divide Conquer: " + obj.pangkatDivideConquer(obj.x, obj.n));

    }
}
