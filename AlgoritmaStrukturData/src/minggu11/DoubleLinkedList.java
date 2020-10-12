package minggu11;

public class DoubleLinkedList {

    Node head;
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
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
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
        Node current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        if (current.prev == null) {
            addFirst(item);
        } else {
            Node newNode = new Node(current.prev, item, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }

    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        }
        if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        }
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        } else if (index < 0 || index >= size) {
            throw new Exception("Index diluar batas");
        }

        if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                removeLast();
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
            }
        }
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        } else if (index < 0 || index >= size) {
            throw new Exception("Index diluar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getByData(int data) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        int idxDt = -1;
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.data == data) {
                idxDt = i;
                break;
            }
            tmp = tmp.next;
        }
        if (idxDt == -1) {
            throw new Exception("Data tidak ditemukan");
        }
        return idxDt;
    }

    public void sorting() {
        for (int i = 1; i < size; i++) {
            Node tmp = head;
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

    public void print() {
        if (isEmpty()) {
            System.out.println("LinkedList kosong");
        } else {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("Berhasil diisi");
        }
    }
}
