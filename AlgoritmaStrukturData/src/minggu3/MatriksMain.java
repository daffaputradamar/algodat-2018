package minggu3;

import java.util.Scanner;

public class MatriksMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Matriks matriks = new Matriks();

        for (int i = 0; i < matriks.elemenMatriks.length; i++) {
            for (int j = 0; j < matriks.elemenMatriks[i].length; j++) {
                System.out.printf("elemen matriks[%d][%d]: ", i, j);
                matriks.elemenMatriks[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < matriks.elemenMatriks.length; i++) {
            for (int j = 0; j < matriks.elemenMatriks[i].length; j++) {
                System.out.print(matriks.elemenMatriks[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
