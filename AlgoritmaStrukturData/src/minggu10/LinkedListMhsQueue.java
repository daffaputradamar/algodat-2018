package minggu10;

public class LinkedListMhsQueue {

    NodeMahasiswa head;
    int size;

    public LinkedListMhsQueue() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa item) {
        head = new NodeMahasiswa(item, head);
        size++;
    }

    public void addLast(Mahasiswa item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            NodeMahasiswa tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new NodeMahasiswa(item, null);
        }
        size++;
    }

    public Mahasiswa getFirst() {
        if (isEmpty()) {
            System.out.println("LinkedList kosong");
            return null;
        }
        return head.data;
    }

    public Mahasiswa getLast(){
        if (isEmpty()) {
            System.out.println("LinkedList kosong");
            return null;
        }
        NodeMahasiswa tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Mahasiswa get(int index) {
        if (isEmpty()) {
            System.out.println("LinkedList kosong");
            return null;
        }
        NodeMahasiswa tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getByKey(Mahasiswa item){
        if (isEmpty()) {
            System.out.println("LinkedList kosong");
            return -1;
        }
        NodeMahasiswa tmp = head;
        int index = 0;
        while (!tmp.data.nim.equals(item.nim)) {
            tmp = tmp.next;
            index++;
        }
        return index;
    }

    public Mahasiswa removeFirst() {
        if (isEmpty()) {
            System.out.println("Linkedlist kosong");
            return null;
        } else {
            Mahasiswa simpan = head.data;
            if (size == 1) {
                head = null;
            } else {
                NodeMahasiswa tmp = head;
                head = tmp.next;
                tmp = null;
            }
            return simpan;
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa tmp = head;
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("LinkedList kosong");
        }
    }
}
