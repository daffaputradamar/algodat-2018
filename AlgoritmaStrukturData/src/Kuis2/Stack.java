package Kuis2;

public class Stack {
    int size;
    DoubleLinkedList data;
    
    Stack(){
        this.size = size;
        data = new DoubleLinkedList();
    }
    
    boolean isEmpty(){
        return size == 0;
    }
    
    void push(int dt){
        data.addLast(dt);
        size++;
    }
    
    void pop(){
        if (!isEmpty()) {
            int a = data.removeLast();
            System.out.println("Data yang diremove adalah: "+a);
        } else {
            System.out.println("=====================");
            System.out.println("Tidak dapat pop, stack masih kosong");
        }
    }
    
    void tampilkan(){
        System.out.println("Isi Stack: ");
        data.printSt();
    } 
    
    void clearStack(){
        data.head = null;
    }
}
