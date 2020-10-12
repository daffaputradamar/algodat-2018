package minggu2;

import java.util.Scanner;

public class JajarGenjangMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        JajarGenjang[] jg = new JajarGenjang[5];
        
        for (int i = 0; i < jg.length; i++) {
            System.out.println("Jajargenjang ke-"+(i+1));
            System.out.print("Masukkan tinggi: ");
            int tinggi = sc.nextInt();
            System.out.print("Masukkan panjang: ");
            int panjang = sc.nextInt();
            System.out.print("Masukkan sisi miring: ");
            int sisimiring = sc.nextInt();
            
            jg[i] = new JajarGenjang(tinggi, panjang, sisimiring);
        }
        
        for (int i = 0; i < jg.length; i++) {
            System.out.println("Luas Jajargenjang ke-"+(i+1)+": "+jg[i].hitungLuas());
            System.out.println("Keliling Jajargenjang ke-"+(i+1)+": "+jg[i].hitungKeliling());
        }
    }
}
