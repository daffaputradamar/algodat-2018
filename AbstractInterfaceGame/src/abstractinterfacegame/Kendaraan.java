package abstractinterfacegame;

public class Kendaraan extends GameObject implements VulnerableByMonster{
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
    
    public void move() {
        System.out.println("Kendaraan telah berjalan");
    }

    @Override
    public void damage() {
        System.out.println("Kendaraan telah diserang monster");
    }

    @Override
    void damaged() {
        System.out.println("Kendaraan telah diserang");
    }
    
}
