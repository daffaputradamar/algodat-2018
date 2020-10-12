package Kuis2;

public class Queue {

    int size;
    DoubleLinkedList q;

    Queue() {
        create();
    }

    void create() {
        q = new DoubleLinkedList();
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int data) {
        q.addLast(data);
        size++;
    }

    int dequeue() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            data = q.removeFirst();
            size--;
        }
        return data;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            q.print();
            System.out.println("Jumlah Antrian = " + size);
        }
    }

    void printFront() {
        System.out.println("Posisi front: " + q.head);
    }

    void printRear() {
        System.out.println("Posisi rear: " + q.getLast());
    }

    void printPosition(int data) {
        System.out.println("Data berada di posisi"+q.getByData(data));
    }

    void printDataByPos(int position) {
        System.out.println("Data yang berada di posisi "+position+" adalah: "+q.get(position));
    }
}
