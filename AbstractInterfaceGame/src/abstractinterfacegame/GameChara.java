package abstractinterfacegame;

abstract public class GameChara extends GameObject {
    protected int power;

    @Override
    abstract void damaged();
    
    abstract void attack();
}
