package minggu3;

public class KaliMatriksBF {
    
    Matriks matriks1 = new Matriks();
    Matriks matriks2 = new Matriks();

    public KaliMatriksBF(Matriks matrik1, Matriks matrik2){
        for (int i = 0; i < matrik1.elemenMatriks.length; i++) {
            for (int j = 0; j < matrik1.elemenMatriks[i].length; j++) {
                matriks1.elemenMatriks[i][j] = matrik1.elemenMatriks[i][j];
                matriks2.elemenMatriks[i][j] = matrik2.elemenMatriks[i][j];
            }
        }
    }
    
    public void BruteForce(Matriks hasil){
        
        for (int i = 0; i < matriks1.elemenMatriks.length; i++) {
            for (int j = 0; j < matriks2.elemenMatriks[i].length; j++) {
                int x = 0;
                for (int k = 0; k < matriks2.elemenMatriks.length; k++) {
                    x+= matriks1.elemenMatriks[i][k] * matriks2.elemenMatriks[k][j];
                }
                hasil.elemenMatriks[i][j] = x;
            }
        }
        tampilBF(hasil);
    }
    
    public void tampilBF(Matriks hasil){
        for (int i = 0; i < hasil.elemenMatriks.length; i++) {
            for (int j = 0; j < hasil.elemenMatriks[i].length; j++) {
                System.out.print(hasil.elemenMatriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
