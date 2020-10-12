package minggu10;

public class QueueLinkedList {

    int size;
    LinkedListMhsQueue q;

    QueueLinkedList() {
        create();
    }

    void create() {
        q = new LinkedListMhsQueue();
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(Mahasiswa data) {
        q.addLast(data);
        size++;
    }

    Mahasiswa dequeue() {
        Mahasiswa tmp = q.removeFirst();
        size--;
        return tmp;
    }

    void print() {
        q.print();
    }

    void printFront() {
        q.getFirst().print();
    }

    void printRear() {
        q.getLast().print();
    }

    void printPosition(Mahasiswa data) {
        int posData = q.getByKey(data);
        if (posData == -1) {
            System.out.println("Data tidak ditemukan");
        } else {
            System.out.println("Data terdapat pada posisi: " + posData);
        }
    }

    void printDataByPos(int position) {
        Mahasiswa tmp = q.get(position);
        if (tmp == null) {
            System.out.println("Data tidak ditemukan");
        } else {
            System.out.println("Data terdapat pada posisi"+position+" adalah: ");
            tmp.print();
        }
    }
}
