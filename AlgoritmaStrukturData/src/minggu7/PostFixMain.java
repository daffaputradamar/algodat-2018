package minggu7;

import java.util.Scanner;

public class PostFixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String P,Q;
        System.out.println("Masukkan Ekspresi : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        
        int total = Q.length();
        PostFix pf = new PostFix(total);
        P = pf.convertPostFix(Q);
        System.out.println("Postfix:\n"+P);


    }
}
