package Kuis2;

public class Main {
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        DoubleLinkedList dll = new DoubleLinkedList();
        
        dll.addLast(1);
        dll.addLast(10);
        dll.addLast(15);
        dll.addLast(5);
        dll.addLast(8);
        
        bst.addRecursive(1, bst.root);
        bst.addRecursive(10, bst.root);
        bst.addRecursive(15, bst.root);
        bst.addRecursive(5, bst.root);
        bst.addRecursive(8, bst.root);
    
//        bst = dll.bt();
//        bst.traverseInOrder(bst.root);
//        System.out.println("");
//        bst.isiDLL(bst.root);
//        dll = bst.dll;
//        dll.print();
        
    }
}
