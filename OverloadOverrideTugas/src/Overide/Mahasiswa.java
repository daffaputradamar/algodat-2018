package Overide;

class Mahasiswa extends Manusia{
    @Override
    public void makan(){
        System.out.println("Mahasiswa Butuh Makan");
    }
    
    public void tidur(){
        System.out.println("Mahasiswa Sedang Tidur");
    }
}