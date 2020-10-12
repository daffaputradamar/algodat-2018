package inheritanceslide;

public class Manager extends Pegawai {
    public String departemen;
    
    @Override
    public void tampilkanStatus(){
        super.tampilkanStatus();
        System.out.println("Departemen  :" + departemen);
    }
}
