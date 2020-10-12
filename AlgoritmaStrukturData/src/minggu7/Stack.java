package minggu7;

public class Stack {
    int size;
    int top = -1;
    String[] data;
    
    Stack(int size){
        this.size = size;
        data = new String[size];
        top = -1;
    }
    
    boolean isEmpty(){
        return top == -1;
    }
    
    boolean isFull(){
        return top == size-1;
    }
    
    void push(String dt){
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("====================");
            System.out.println("Isi Stack Penuh");
        }
    }
    
    void pop(){
        if (!isEmpty()) {
            String a = data[top];
            top--;
            System.out.println("=====================");
            System.out.println("Data yang di pop : " +a);
        } else {
            System.out.println("=====================");
            System.out.println("Tidak dapat pop, stack masih kosong");
        }
    }
    
    void tampilkan(){
        System.out.println("Isi Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.printf("[%s]\n",data[i]);
        }
    } 
    
    void clearStack(){
        if (!isEmpty()) {
            top = -1;
            System.out.println("=====================");
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("=====================");
            System.out.println("Tidak dapat hapus, stack masih kosong");
        }
    }
}
