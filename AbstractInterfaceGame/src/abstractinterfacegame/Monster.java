package abstractinterfacegame;

public class Monster extends GameChara{

    @Override
    void attack() {
        System.out.println("Monster sedang menyerang");
    }

    @Override
    void damaged() {
        System.out.println("Monster telah diserang");
    }
    
    public void respawn() {
        System.out.println("Monster telah respawn");
    }
}
