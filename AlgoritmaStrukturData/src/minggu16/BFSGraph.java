package minggu16;

import java.util.Scanner;

public class BFSGraph {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int vertex, edges, source, destination, start;
        
        System.out.print("Masukkan jumlah vertex: ");
        vertex = sc.nextInt();
        
        Graph g = new Graph(vertex);

        System.out.print("Masukkan jumlah edges: ");
        edges = sc.nextInt();
        
        System.out.println("Masukkan edges: <source> <destination>");
        for (int i = 0; i < edges; i++) {
            source = sc.nextInt();
            destination = sc.nextInt();
            
            g.addEdge(source, destination);
        }
        
//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(1, 2);
//        g.addEdge(2, 0);
//        g.addEdge(2, 3);
//        g.addEdge(3, 3);

//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(1, 3);
//        g.addEdge(2, 3);
//        g.addEdge(3, 2);
//        g.addEdge(3, 4);
        
        System.out.print("Input start: ");
        start = sc.nextInt();

        System.out.println("Following is Breadth First Traversal (starting from vertex 2)");
        g.BFS(start);
        
        sc.close();
    }
}
