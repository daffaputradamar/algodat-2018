package Overide;

class Dosen extends Manusia{
    @Override
    public void makan(){
        System.out.println("Dosen Butuh Makan");
    }
    
    public void lembur(){
        System.out.println("Dosen Sedang Lembur");
    }
}