package minggu3;

import java.util.Scanner;

public class MatrikskaliMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Matriks matriks1 = new Matriks();
        Matriks matriks2 = new Matriks();
        
        System.out.println("Matriks 1");
        for (int i = 0; i < matriks1.elemenMatriks.length; i++) {
            for (int j = 0; j < matriks1.elemenMatriks[i].length; j++) {
                System.out.printf("elemen matriks[%d][%d]: ", i, j);
                matriks1.elemenMatriks[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matriks 2");
        for (int i = 0; i < matriks2.elemenMatriks.length; i++) {
            for (int j = 0; j < matriks2.elemenMatriks[i].length; j++) {
                System.out.printf("elemen matriks[%d][%d]: ", i, j);
                matriks2.elemenMatriks[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matriks 1");
        tampilMatriks(matriks1);
        System.out.println("Matriks 2");
        tampilMatriks(matriks2);
        
        Matriks hasil = new Matriks();
        System.out.println("Hasil Matriks BF: ");
        KaliMatriksBF matriksBF = new KaliMatriksBF(matriks1, matriks2);
        matriksBF.BruteForce(hasil);
        
        System.out.println("Hasil Matriks DC: ");
        KaliMatriksDC matriksDC = new KaliMatriksDC(matriks1, matriks2);
        matriksDC.DivideConquer(hasil,0, hasil.elemenMatriks.length, 0, 0, 0);

    }
    
    static void tampilMatriks(Matriks matrik){
        for (int i = 0; i < matrik.elemenMatriks.length; i++) {
            for (int j = 0; j < matrik.elemenMatriks[i].length; j++) {
                System.out.print(matrik.elemenMatriks[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
