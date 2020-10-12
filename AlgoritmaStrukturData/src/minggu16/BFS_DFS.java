package minggu16;

import java.util.Scanner;

public class BFS_DFS {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int vertex, edges, source, destination, start;
        Graph g = new Graph(4);
        int pilih = start = 0;
        do {
            pilih = menu();
            switch (pilih) {
                case 1:
                    g = makeGraph();
                    break;
                case 2:
                    BFS(g, start);
                    break;
                case 3:
                    DFS(g, start);
                    break;
            }

        } while (pilih != 4);

        sc.close();
    }

    static int menu() {
        System.out.println("Graph Menu: ");
        System.out.println("1. Buat Graph");
        System.out.println("2. BFS");
        System.out.println("3. DFS");
        System.out.println("4. Keluar");
        System.out.println("===================");
        System.out.print(">");
        int pilih = sc.nextInt();
        System.out.println("===================");
        return pilih;
    }

    static void BFS(Graph g, int start) {
        System.out.print("Input start: ");
        start = sc.nextInt();
        System.out.println("Following is Breadth First Traversal (starting from vertex 2)");
        g.BFS(start);
        System.out.println();
    }

    static void DFS(Graph g, int start) {
        System.out.print("Input start: ");
        start = sc.nextInt();
        System.out.println("Following is Depth First Traversal (starting from vertex 2)");
        g.DFS(start);
        System.out.println();
    }

    static Graph makeGraph() {
        System.out.print("Masukkan jumlah vertex: ");
        int vertex = sc.nextInt();

        Graph g = new Graph(vertex);

        System.out.print("Masukkan jumlah edges: ");
        int edges = sc.nextInt();

        addEgdes(g, edges, sc);

        return g;
    }

    static void addEgdes(Graph g, int edges, Scanner sc) {
        System.out.println("Masukkan edges: <source> <destination>");
        for (int i = 0; i < edges; i++) {
            int source = sc.nextInt();
            int destination = sc.nextInt();

            g.addEdge(source, destination);
        }
    }

}
