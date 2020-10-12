package minggu1;

import java.util.Scanner;

public class PacManMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PacMan pac = new PacMan(2, 2, 2, 1);
        
        do{
            pac.printPosition();
            System.out.print("Input (W/A/S/D): ");
            String jalan = input.nextLine();
            
            switch(jalan.toLowerCase()){
                case "w":
                    pac.moveUp();
                break;
                case "a":
                    pac.moveLeft();
                break;
                case "s":
                    pac.moveDown();
                break;
                case "d":
                    pac.moveRight();
                break;
            }
        }while(true);
    }
}
