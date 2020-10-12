package minggu1;

public class PacMan {
    int x, y, width, height;
    
    PacMan(int width, int height, int x, int y){
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }
    
    void moveLeft(){
        if (x - 1 < 0) {
            return;
        }
        x--;
    }
    
    void moveRight(){
        if (x + 1 > width) {
            return;
        }
        x++;
    }
    
    void moveUp(){
        if (y + 1 > height) {
            return;
        }
        y++;
    }
    
    void moveDown(){
        if (y - 1 < 0) {
            return;
        }
        y--;
    }
    
    void printPosition(){
        System.out.printf("Posisi(%d,%d)\n", x,y);
    }
}
