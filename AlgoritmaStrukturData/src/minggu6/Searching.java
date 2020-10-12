package minggu6;

import java.util.Scanner;

public class Searching {

    static int sequentialSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int binarySearch(int arr[], int x) {
        int awal = 0, akhir = arr.length - 1;
        while (awal <= akhir) {
            int tengah = awal + (akhir - awal) / 2;
            if (arr[tengah] == x) {
                return tengah;
            }
            if (arr[tengah] < x) {
                awal = tengah + 1;
            } else {
                akhir = tengah - 1;
            }
        }
        return -1;
    }
    
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[idxMin]) {
                    idxMin = j;
                }
            }
            int tmp = arr[idxMin];
            arr[idxMin] = arr[i];
            arr[i] = tmp;
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah data: ");
        int n = sc.nextInt();
        
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Data ke-"+i+": ");
            data[i] = sc.nextInt();
        }
        
        System.out.print("Pencarian: ");
        int cari = sc.nextInt();
        
        int hasil;
        
//        bubbleSort(data);
        selectionSort(data);
        hasil = binarySearch(data, cari);
//        hasil = sequentialSearch(data, cari);
        
        if (hasil == -1) {
            System.out.println("Pencarian tidak ketemu");
        } else {
            System.out.println("Pencarian ketemu di index ke:" + hasil);
        }
    }
}
