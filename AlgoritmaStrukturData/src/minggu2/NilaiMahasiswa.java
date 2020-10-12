package minggu2;

public class NilaiMahasiswa {
    public int nilai1;
    public int nilai2;
    
    public NilaiMahasiswa(int n1,int n2){
        nilai1 = n1;
        nilai2 = n2;
    }
    
    public int nilaiTertinggi(){
        if (nilai1 > nilai2) {
            return nilai1;
        } else {
            return nilai2;
        }
    }
}
