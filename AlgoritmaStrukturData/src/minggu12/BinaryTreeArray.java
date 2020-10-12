package minggu12;

public class BinaryTreeArray {

    int[] data;
    int idxLast, size;

    public BinaryTreeArray() {
        data = new int[100];
        idxLast = -1;
        size = 0;
    }

    void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
        this.size = idxLast + 1;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == data.length;
    }

    void add(int data) {
        if (isFull()) {
            System.out.println("Binary Tree full!");
        } else {
            if (isEmpty()) {
                this.data[0] = data;
                size++;
                idxLast = 0;
            } else {
                int i = 0;
                while (true) {
                    if (data < this.data[i]) {
                        if (i * 2 + 1 >= this.data.length) {
                            System.out.println("Data tidak dapat dimasukkan ke dalam tree");
                            break;
                        } else if (this.data[i * 2 + 1] != 0) {
                            i = i * 2 + 1;
                        } else {
                            this.data[i * 2 + 1] = data;
                            size++;
                            if (i * 2 + 1 > idxLast) {
                                idxLast = pindahIdxLast();
                            }
                            break;
                        }
                    } else if (data > this.data[i]) {
                        if (i * 2 + 2 >= this.data.length) {
                            System.out.println("Data tidak dapat dimasukkan ke dalam tree");
                            break;
                        } else if (this.data[i * 2 + 2] != 0) {
                            i = i * 2 + 2;
                        } else {
                            this.data[i * 2 + 2] = data;
                            size++;
                            if (i * 2 + 2 > idxLast) {
                                idxLast = pindahIdxLast();
                            }
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
    }

    int pindahIdxLast() {
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] != 0) {
                return i;
            }
        }
        return -1;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            if (data[idxStart] != 0) {
                System.out.print(data[idxStart] + " ");
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != 0) {
                System.out.print(data[idxStart] + " ");
            }
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
