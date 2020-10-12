package minggu8;

public class Queue {

    int max, size, front, rear;
    int[] q;

    Queue(int m) {
        max = m;
        create();
    }

    void create() {
        q = new int[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            q[rear] = data;
            size++;
        }
    }

    int dequeue() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            data = q[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(q[i] + " ");
            System.out.println("Jumlah Antrian = " + size);
        }
    }

    void printFront() {
        System.out.println("Posisi front: " + q[front]);
    }

    void printRear() {
        System.out.println("Posisi rear: " + q[rear]);
    }

    void printPosition(int data) {
        int posData = -1;
        int position = 0;
        int i = front;
        while (i != rear) {
            if (q[i] == data) {
                posData = position;
                break;
            }
            position++;
            i = (i + 1) % max;
        }
        if (q[rear] == data) {
            posData = position;
        }
        if (posData == -1) {
            System.out.println("Data tidak ditemukan");
        } else {
            System.out.println("Data terdapat pada posisi: " + posData);
        }
    }

    void printDataByPos(int position) {
        if (position >= size) {
            System.out.println("Posisi yang anda input melebihi kapasitas");
        } else {
            int i = front;
            int pos = 0;
            while (i != rear) {
                if (pos == position) {
                    System.out.println("Data yang berada pada posisi-" + position + " adalah: " + q[i]);
                    break;
                }
                pos++;
                i = (i + 1) % max;
            }
            if (i == rear) {
                if (pos == position) {
                    System.out.println("Data yang berada pada posisi-" + position + " adalah: " + q[i]);
                }
            }
        }
    }
}
