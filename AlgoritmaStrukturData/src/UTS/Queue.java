package UTS;

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
                rear++;
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
                int tmp = front;
                while(tmp != rear){
                    q[tmp] = q[tmp+1];
                    tmp++;
                }
                //tmp == rear
                //rear = tmp-1
                rear--;
            }
        }
        return data;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
        } else {
            int i = front;
            while (i <= rear) {
                System.out.print(q[i] + " ");
                i++;
            }
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
        int i = front;
        while (i <= rear) {
            if (q[i] == data) {
                posData = i;
                break;
            }
            i++;
        }
        if (posData == -1) {
            System.out.println("Data tidak ditemukan");
        } else {
            System.out.println("Data terdapat pada posisi: " + posData);
        }
    }

    void printDataByPos(int position) {
        if (position >= size || position < 0) {
            System.out.println("Posisi yang anda input melebihi kapasitas");
        } else {
            System.out.println("Data yang berada pada posisi-" + position + " adalah: " + q[position]);
        }
    }
}
