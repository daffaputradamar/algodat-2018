package minggu11;

public class DLLMhs {

    NodeMhs head;
    int size;

    public DLLMhs() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Mahasiswa item) {
        if (isEmpty()) {
            head = new NodeMhs(null, item, null);
        } else {
            NodeMhs newNode = new NodeMhs(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(Mahasiswa item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            NodeMhs current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeMhs newNode = new NodeMhs(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    void add(Mahasiswa item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
            return;
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        NodeMhs current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        if (current.prev == null) {
            addFirst(item);
        } else {
            NodeMhs newNode = new NodeMhs(current.prev, item, current);
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
            NodeMhs current = head;
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
            NodeMhs current = head;
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
    
    public void sorting(){
        for (int i = 1; i < size; i++) {
            NodeMhs tmp = head;
            for (int j = 0; j < size-i; j++) {
                if (tmp.data.nilai < tmp.next.data.nilai) {
                    Mahasiswa simpan = tmp.data;
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
            NodeMhs tmp = head;
            while (tmp != null) {
                System.out.println("========================");
                tmp.data.print();
                System.out.println("========================");
                tmp = tmp.next;
            }
            System.out.println("Berhasil diisi");
        }
    }

}
