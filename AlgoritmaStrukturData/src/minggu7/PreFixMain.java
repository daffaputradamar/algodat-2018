package minggu7;

import java.util.Scanner;

public class PreFixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String P,Q;
        System.out.println("Masukkan Ekspresi : ");
        Q = sc.nextLine();
        Q = Q.trim();
        
        int total = Q.length();
        PreFix pf = new PreFix(total+1);
        P = pf.convertPreFix(Q);
        System.out.println("PreFix:\n"+P);

    }
}
