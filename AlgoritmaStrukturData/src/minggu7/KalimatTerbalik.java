package minggu7;

import java.util.Scanner;

public class KalimatTerbalik {
    
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat: ");
        String isi = scStr.nextLine();
        
        String[] data = isi.split(" ");
        
        tampilkan(data);
    }
    
    static void tampilkan(String[] data){
        System.out.print("Kalimat Dibalik: ");
        for (int i = data.length-1; i >= 0; i--) {
            System.out.print(data[i]+" ");
        }
    } 
}
