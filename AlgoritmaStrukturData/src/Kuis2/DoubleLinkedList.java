package Kuis2;

public class DoubleLinkedList {

    NodeDLL head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int item) {
        if (isEmpty()) {
            head = new NodeDLL(null, item, null);
        } else {
            NodeDLL newNode = new NodeDLL(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            NodeDLL current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeDLL newNode = new NodeDLL(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
            return;
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        NodeDLL current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        if (current.prev == null) {
            addFirst(item);
        } else {
            NodeDLL newNode = new NodeDLL(current.prev, item, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }

    }

    public int removeFirst() {
        int a = 0;
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
        } else {
            if (size == 1) {
                a = removeLast();
            } else {
                a = head.data;
                head = head.next;
                head.prev = null;
                size--;
            }
        }
        return a;
    }

    public int removeLast() {
        int a = 0;
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
        } else {
            if (head.next == null) {
                a = head.data;
                head = null;
            } else {
                NodeDLL current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                a = current.next.data;
                current.next = null;
            }
            size--;
        }
        return a;
    }

    public int getFirst() {
        if (isEmpty()) {
            System.out.print("Linked list kosong");
        }
        return head.data;
    }

    public int getLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        }
        NodeDLL tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (index < 0 || index >= size) {
            System.out.println("Index diluar batas");
        }
        NodeDLL tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getByData(int data) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        }
        int idxDt = -1;
        NodeDLL tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.data == data) {
                idxDt = i;
                break;
            }
            tmp = tmp.next;
        }
        if (idxDt == -1) {
            System.out.println("Data tidak ditemukan");
        }
        return idxDt;
    }

    public void sorting() {
        for (int i = 1; i < size; i++) {
            NodeDLL tmp = head;
            for (int j = 0; j < size - i; j++) {
                if (tmp.data > tmp.next.data) {
                    int simpan = tmp.data;
                    tmp.data = tmp.next.data;
                    tmp.next.data = simpan;
                }
                tmp = tmp.next;
            }
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public BinaryTree bt() {
        BinaryTree bst = new BinaryTree();
        if (isEmpty()) {
            System.out.println("LinkedList kosong");
        } else {
            NodeDLL tmp = head;
            while (tmp != null) {
                bst.add(tmp.data);
                tmp = tmp.next;
            }
        }
        return bst;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("LinkedList kosong");
        } else {
            NodeDLL tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
        }
    }

    public void printSt() {
        if (isEmpty()) {
            System.out.println("LinkedList kosong");
        } else {
            NodeDLL tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.prev;
            }

        }
    }
}
