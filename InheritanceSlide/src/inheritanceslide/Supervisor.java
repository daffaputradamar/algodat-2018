package inheritanceslide;

public class Supervisor extends Manager{
    public String shift;
    public int durasi;
    
    public void tampilkanGajiTotal(){
        System.out.println("Gaji total  : " + (super.gaji * this.durasi));
    }
}
