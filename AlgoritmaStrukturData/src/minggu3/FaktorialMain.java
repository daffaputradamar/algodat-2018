package minggu3;

import java.util.Scanner;

public class FaktorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Faktorial fakObjek = new Faktorial();
        
        System.out.print("Masukkan jumlah faktorial: ");
        fakObjek.nilai = sc.nextInt();
        
        System.out.println("Nilai faktorial Brute Force: " + fakObjek.faktorialBF(fakObjek.nilai));
        System.out.println("Nilai faktorial Divide Conquer: " + fakObjek.faktorialDC(fakObjek.nilai));
    }
}
