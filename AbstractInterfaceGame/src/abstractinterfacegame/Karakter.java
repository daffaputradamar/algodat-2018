package abstractinterfacegame;

public class Karakter extends GameChara implements VulnerableByMonster{
    private int shield;

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getShield() {
        return shield;
    }
    
    public void shield() {
        System.out.println("Karakter sedang dalam posisi bertahan");
    }
    
    @Override
    public void attack() {
        System.out.println("Karakter sedang menyerang");
    }
    
    @Override
    public void damaged() {
        System.out.println("Karakter telah diserang");
    }

    @Override
    public void damage() {
        System.out.println("Karakter telah diserang Monster");
    }
    
    
   
}
