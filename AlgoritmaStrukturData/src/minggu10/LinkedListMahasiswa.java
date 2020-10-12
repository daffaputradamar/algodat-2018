package minggu10;

public class LinkedListMahasiswa {

    NodeMahasiswa head;
    int size;

    public LinkedListMahasiswa() {
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

    public void add(Mahasiswa item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            NodeMahasiswa tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            NodeMahasiswa next = (tmp == null) ? null : tmp.next;
            tmp.next = new NodeMahasiswa(item, next);
        }
        size++;
    }

    public void addAfter(Mahasiswa item, Mahasiswa data) throws Exception {
        if (isEmpty()) {
            addFirst(data);
        } else {
            if (head.data.nim.equals(item.nim)) {
                NodeMahasiswa baru = new NodeMahasiswa(data, head.next);
                head.next = baru;
            } else {
                NodeMahasiswa tmp = head;
                while (!tmp.data.nim.equals(item.nim)) {
                    tmp = tmp.next;
                }
                NodeMahasiswa next = (tmp == null) ? null : tmp.next;
                tmp.next = new NodeMahasiswa(data, next);
            }
        }
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

    public Mahasiswa getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.data;
    }

    public Mahasiswa getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        NodeMahasiswa tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Mahasiswa get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        NodeMahasiswa tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getByKey(Mahasiswa item) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        NodeMahasiswa tmp = head;
        int index = 0;
        while(!tmp.data.nim.equals(item.nim)){
            tmp = tmp.next;
            index++;
        }
        return index;
    }

    public void removeFirst() {
        if (size == 1) {
            head = null;
        } else {
            NodeMahasiswa tmp = head;
            head = tmp.next;
            tmp = null;
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size || index < 0) {
            throw new Exception("Nilai index diluar batas");
        }
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa prev = head;
            NodeMahasiswa cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
        }
        size--;
    }

    public void removeByKey(Mahasiswa item) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linkedlist kosong");
        }
        if (head.data.nim.equals(item.nim)) {
            removeFirst();
        } else {
            NodeMahasiswa prev = head;
            NodeMahasiswa cur = head.next;
            while (!cur.data.nim.equals(item.nim)) {
                prev = cur;
                cur = prev.next;
            }
            if (cur.next == null) {
                prev.next = null;
            } else {
                prev.next = cur.next;
            }
        }
        size--;
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
