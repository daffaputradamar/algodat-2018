package minggu12;

public class BinaryTreeArrayMain {

    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = new int[100];
        for (int i = 0; i < 100; i++) {
            data[i] = 0;
        }
        int idxLast = -1;
        bta.populateData(data, idxLast);
        bta.add(1);
        bta.add(10);
        bta.add(15);
        bta.add(5);
        bta.add(8);
//        bta.add(7);
//        bta.add(9);
//        bta.add(10);
        System.out.print("InOrder\t\t:");
        bta.traverseInOrder(0);
        System.out.println();
        System.out.print("PreOrder\t:");
        bta.traversePreOrder(0);
        System.out.println();
        System.out.print("PostOrder\t:");
        bta.traversePostOrder(0);
        System.out.println();
    }
}
