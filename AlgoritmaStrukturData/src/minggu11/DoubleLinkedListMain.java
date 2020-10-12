package minggu11;

public class DoubleLinkedListMain {

    public static void main(String[] args) {

        DoubleLinkedList dll = new DoubleLinkedList();

        try {
//            dll.print();
//            System.out.println("Size: " + dll.size());
//            System.out.println("====================================");
//            dll.addFirst(3);
//            dll.addLast(4);
//            dll.addFirst(7);
//            dll.print();
//            System.out.println("Size: " + dll.size());
//            System.out.println("====================================");
//            dll.add(40, 1);
//            dll.print();
//            System.out.println("Size: " + dll.size());
//            System.out.println("====================================");
//            dll.clear();
//            dll.print();
//            System.out.println("Size: " + dll.size());
            
            dll.addLast(50);
            dll.addLast(40);
            dll.addLast(10);
            dll.addLast(20);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("====================================");
            dll.removeFirst();
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("====================================");
            dll.removeLast();
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("====================================");
            dll.remove(1);
            dll.print();
            System.out.println("Size: " + dll.size());
        
            System.out.println("data pada awal linked list adalah : "+dll.getFirst());
            System.out.println("data pada akhir linked list adalah : "+dll.getLast());
            System.out.println("data yang diambil dari method get(index) adalah : "+dll.get(1));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
