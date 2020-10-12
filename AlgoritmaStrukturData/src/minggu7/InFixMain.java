package minggu7;

import java.util.Scanner;

public class InFixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String P,Q;
        System.out.println("Masukkan Ekspresi : ");
        Q = sc.nextLine();
        Q = Q.trim();
        
        int total = Q.length();
        InFix iF = new InFix(total);
        P = iF.convertInFix(Q);
        System.out.println("Infix:\n"+P);

    }
}
