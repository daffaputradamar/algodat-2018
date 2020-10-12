package Overload;

public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
        sudut = 180 - sudutA;
        return sudut;
    }
    
    public int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }
    
    public int keliling(int sisiA, int sisiB, int sisiC){
        return (sisiA + sisiB + sisiC);
    }
    
    public double keliling(int sisiA, int sisiB){
        double c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return c;
    }
    
    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println(s.totalSudut(50));
        System.out.println(s.totalSudut(30, 20));
        System.out.println(s.keliling(60, 60, 60));
        System.out.printf("%.2f\n",s.keliling(5, 5));
    }
}
