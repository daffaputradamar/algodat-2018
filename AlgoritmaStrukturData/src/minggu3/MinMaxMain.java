package minggu3;

import java.util.Scanner;
public class MinMaxMain {
    public static void main(String[] args) {
        MinMax[] ppArray = new MinMax[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            ppArray[i] = new MinMax();
            System.out.println("Nilai Array index ke-" +i);
            System.out.print("Masukkan nilai: ");
            ppArray[i].nilaiArray = sc.nextInt();
        }
        
        int min = ppArray[0].nilaiArray;
        int max = ppArray[0].nilaiArray;
        for (int i = 1; i < 5; i++) {
            if (ppArray[i].nilaiArray < min) {
                min = ppArray [i].nilaiArray;
            } else if (ppArray[i].nilaiArray > max) {
                max = ppArray [i].nilaiArray;
            }
        }
        
        System.out.println("Brute Force");
        System.out.println("Nilai Minimal : " + min);
        System.out.println("Nilai Maksimal : " + max);
        
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ppArray[i].nilaiArray;
        }
        
        Maxmin hasil= new Maxmin();
        MinMax.max_min(arr, 0, arr.length - 1, hasil);
        
        System.out.println("Divide and Qonquer");
        System.out.print("Nilai Minimal: " + hasil.minimum + "\nNilai Maksimum: "+ hasil.maximum);
        System.out.print("\n");
        
    }
}
