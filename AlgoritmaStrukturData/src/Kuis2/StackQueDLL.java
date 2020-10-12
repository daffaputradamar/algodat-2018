package Kuis2;

public class StackQueDLL {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new Queue();
        
        st.push(5);
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        
        st.pop();
        st.pop();
        
        st.tampilkan();
        
        System.out.println();
        
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.enqueue(25);
        
        q.dequeue();
        q.dequeue();
        
        q.print();
    }
}
