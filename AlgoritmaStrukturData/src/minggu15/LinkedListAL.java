package minggu15;

public class LinkedListAL {
    NodeAL head;
    int size;

    public LinkedListAL() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Vertex item) {
        if (isEmpty()) {
            head = new NodeAL(null, item, null);
        } else {
            NodeAL newNode = new NodeAL(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(Vertex item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            NodeAL current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeAL newNode = new NodeAL(current, item, null);
            current.next = newNode;
            size++;
        }
    }

//    void add(int item, int index) throws Exception {
//        if (isEmpty()) {
//            addFirst(item);
//            return;
//        } else if (index < 0 || index > size) {
//            throw new Exception("Nilai index di luar batas");
//        }
//        NodeAL current = head;
//        int i = 0;
//        while (i < index) {
//            current = current.next;
//            i++;
//        }
//        if (current.prev == null) {
//            addFirst(item);
//        } else {
//            NodeAL newNode = new NodeAL(current.prev, item, current);
//            current.prev.next = newNode;
//            current.prev = newNode;
//            size++;
//        }
//
//    }

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
            NodeAL current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }
    
    public void removeByData(int vertex) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        }
        if (getByData(vertex) == 0) {
            removeFirst();
        } else {
            NodeAL current = head;
            while(current.vertex.simpul != vertex) {
                current = current.next;
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
    public void remove(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        } else if (index < 0 || index >= size) {
            throw new Exception("Index diluar batas");
        }

        if (index == 0) {
            removeFirst();
        } else {
            NodeAL current = head;
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

    public Vertex getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.vertex;
    }

    public Vertex getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        NodeAL tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.vertex;
    }

    public Vertex get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        } else if (index < 0 || index >= size) {
            throw new Exception("Index diluar batas");
        }
        NodeAL tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.vertex;
    }

    public int getByData(int vertex) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        int idxDt = -1;
        NodeAL tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.vertex.simpul == vertex) {
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

//    public void sorting() {
//        for (int i = 1; i < size; i++) {
//            NodeAL tmp = head;
//            for (int j = 0; j < size - i; j++) {
//                if (tmp.vertex > tmp.next.vertex) {
//                    int simpan = tmp.vertex;
//                    tmp.vertex = tmp.next.vertex;
//                    tmp.next.vertex = simpan;
//                }
//                tmp = tmp.next;
//            }
//        }
//    }

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
            NodeAL tmp = head;
            while (tmp != null) {
                System.out.println(tmp.vertex + "\t");
                tmp = tmp.next;
            }
            System.out.println("Berhasil diisi");
        }
    }
}
