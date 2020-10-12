package minggu12;

import java.util.Scanner;

public class MainBuatSS {

    public static void main(String[] args) {
        BinaryTreeArray bt = new BinaryTreeArray();
        int[] data = {0,0,0,0,0,0,0,0,0,0};
        int idxLast = -1;
        bt.populateData(data, idxLast);
        
        bt.add(10);
        bt.add(20);
        bt.add(5);
        bt.add(25);
        bt.add(15);
        
        bt.traversePostOrder(0);
        System.out.println();
        bt.traversePreOrder(0);
    }
}
