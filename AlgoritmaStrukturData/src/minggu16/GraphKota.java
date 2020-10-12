package minggu16;

import java.io.*;
import java.util.*;

public class GraphKota {
    private int V;
    private LinkedList<Node>[] adj;
    
    GraphKota(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }
    
    void addEdge(int v, String destination){
        Node newNode = new Node(destination);
        adj[v].add(newNode);
    }
    
    void BFS(String s, Map<String, Integer> map) {
        boolean[] visited = new boolean[V];
        
        LinkedList<String> queue = new LinkedList<String>();
        
        visited[map.get(s)] = true;
        queue.add(s);
        
        while (queue.size() != 0) {            
            s = queue.poll();
            System.out.print(s+" ");
            
            Iterator<Node> i = adj[map.get(s)].listIterator();
            while (i.hasNext()) {
                String n = i.next().namaKota;
                if (!visited[map.get(n)]) {
                    visited[map.get(n)] = true;
                    queue.add(n);
                }
            }
        }
    }
}
