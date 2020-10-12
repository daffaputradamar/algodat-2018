package minggu10;

public class LinkedList {

    Node head;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        head = new Node(item, head);
        size++;
    }

    public void add(int item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
        }
        size++;
    }

    public void addAfter(int item, int data) throws Exception {
        if (isEmpty()) {
            addFirst(data);
        } else {
            if (head.data == item) {
                Node baru = new Node(data, head.next);
                head.next = baru;
            } else {
                Node tmp = head;
                while (tmp.data != item) {
                    tmp = tmp.next;
                }
                Node next = (tmp == null) ? null : tmp.next;
                tmp.next = new Node(data, next);
            }
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
        }
        size++;
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getByKey(int item) throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        Node tmp = head;
        int index = 0;
        while(tmp.data != item){
            tmp = tmp.next;
            index++;
        }
        return index;
    }

    public void removeFirst() {
        if (size == 1) {
            head = null;
        } else {
            Node tmp = head;
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
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
        }
        size--;
    }

    public void removeByKey(int item) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linkedlist kosong");
        }
        if (head.data == item) {
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            while (cur.data != item) {
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
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
        } else {
            System.out.println("LinkedList kosong");
        }
    }
}
