package minggu6;

import java.util.Scanner;

public class Tugas5 {

    public static int cariJumlahData(int[] arr, int x) {
        int simpanIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                simpanIdx++;
            }
        }
        return simpanIdx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] data = {6,7,3,5,1,7,9,6,5,8};
        
        System.out.print("Pencarian: ");
        int cari = sc.nextInt();

        int hasil;

        hasil = cariJumlahData(data, cari);

        if (hasil == 0) {
            System.out.println("Pencarian tidak ketemu");
        } else {
            System.out.println("Jumlah bilangan " + cari + " dalam array adalah:" + hasil);
        }
    }
}
