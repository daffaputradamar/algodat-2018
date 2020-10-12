package Overide;

public class Orang{
    public static void main(String[] args) {
        Manusia a = new Manusia();
        Dosen b = new Dosen();
        Mahasiswa c = new Mahasiswa();
        
        Manusia Call;
        
        Call = a;
        Call.makan();
        
        Call = b;
        Call.makan();
        
        Call = c;
        Call.makan();
        
    }
}
