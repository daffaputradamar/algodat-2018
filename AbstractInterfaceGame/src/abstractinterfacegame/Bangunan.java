package abstractinterfacegame;

public class Bangunan extends GameObject implements VulnerableByMonster{
    public void farm() {
        System.out.println("Bangunan menghasilkan sumber daya");
    }

    @Override
    void damaged() {
        System.out.println("Bangunan telah diserang");
    }

    @Override
    public void damage() {
        System.out.println("Bangunan telah diserang monster");
    }
    
    
}
