package minggu6;

import java.util.Scanner;

public class Tugas4 {

    public static int pencarianData(int[] arr, int x) {
        int simpanIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                simpanIdx = i;
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

        hasil = pencarianData(data, cari);

        if (hasil == -1) {
            System.out.println("Pencarian tidak ketemu");
        } else {
            System.out.println("Posisi terkanan bilangan " + cari + " berada pada index ke:" + hasil);
        }
    }
}
