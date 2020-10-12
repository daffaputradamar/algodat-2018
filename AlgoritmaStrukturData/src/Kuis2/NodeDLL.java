package Kuis2;

import minggu11.*;

public class NodeDLL {
    int data;
    NodeDLL prev;
    NodeDLL next;
    
    NodeDLL(NodeDLL prev, int data, NodeDLL next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
 
}
