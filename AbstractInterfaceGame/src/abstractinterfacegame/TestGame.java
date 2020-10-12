package abstractinterfacegame;

public class TestGame {

    public static void main(String[] args) {
        Karakter chara1 = new Karakter();
        Bangunan building1 = new Bangunan();
        Kendaraan vehicle1 = new Kendaraan();
        
        GameMaster gm = new GameMaster();
        
        gm.monsterAttack(chara1);
        gm.monsterAttack(building1);
        gm.monsterAttack(vehicle1);
    }
    
}
