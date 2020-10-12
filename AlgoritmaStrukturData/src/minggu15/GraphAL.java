package minggu15;

import java.util.Scanner;

public class GraphAL {

    int vertex;
    LinkedListAL list[];
    boolean isDirected;

    public GraphAL(int vertex) {
        this.isDirected = false;
        this.vertex = vertex;
        this.list = new LinkedListAL[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedListAL();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah vertex untuk inisialisasi: ");
        int vertex = sc.nextInt();
        GraphAL graph = new GraphAL(vertex);
        int pilih = 0, source, destination, weight;
        do {
            pilih = menu();
            switch (pilih) {
                case 1:
                    System.out.println("Pilih Jenis Graph");
                    System.out.println("1. Undirected");
                    System.out.println("2. Directed");
                    int jenis = sc.nextInt();
                    graph.setGraphType(jenis);
                    break;
                case 2:
                    System.out.print("Jumlah vertex: ");
                    int jml = sc.nextInt();
                    graph = new GraphAL(jml);
                    break;
                case 3:
                    System.out.println("Masukkan edge: <source> <destination> <weight>");
                    source = sc.nextInt();
                    destination = sc.nextInt();
                    weight = sc.nextInt();
                    graph.addEdge(source, destination, weight);
                    break;
                case 4:
                    System.out.println("Masukkan remove edge: <source> <destination>");
                    source = sc.nextInt();
                    destination = sc.nextInt();
                    graph.removeEdge(source, destination);
                    break;
                case 5:
                    graph.removeAllEdges();
                    break;
            }
            graph.printGraph();
        } while (pilih != 6);
//
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 4);
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 4);
//        graph.addEdge(3, 0);
//        graph.printGraph();
//        graph.degree(2);
//
//        graph.removeEdge(1, 4);
        
    }

    static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Graph Menu");
        System.out.println("1. Jenis Graph");
        System.out.println("2. Input jumlah vertex");
        System.out.println("3. addEdge");
        System.out.println("4. removeEdge");
        System.out.println("5. removeAllEdges");
        System.out.println("6. Keluar");
        System.out.println("=======================");
        System.out.print("> ");
        int pilih = sc.nextInt();
        System.out.println("=======================");
        return pilih;
    }

    public void setGraphType(int num) {
        if (num == 1) {
            this.isDirected = false;
        } else if (num == 2) {
            this.isDirected = true;
        }
    }

    public boolean graphType() {
        return this.isDirected;
    }

    public void addEdge(int source, int destination, int weight) {
        Vertex v1 = new Vertex(source, weight);
        Vertex v2 = new Vertex(destination, weight);
        
        if (!graphType()) {
            list[destination].addFirst(v1);
        }
        list[source].addFirst(v2);

    }

    public void degree(int source) throws Exception {
        if (!graphType()) {
            System.out.println("degree vertex " + source + " : " + list[source].size());
        } else {
            int k, totalIn = 0, totalOut = 0;

            for (int i = 0; i < vertex; i++) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j).simpul == source) {
                        ++totalIn;
                    }
                }
                for (k = 0; k < list[source].size(); k++) {
                    list[source].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dari vertex " + source + " : " + totalIn);
            System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
            System.out.println("degree dari vertex " + source + " : " + (totalIn + totalOut));
        }
    }

    public void removeEdge(int source, int destination) throws Exception {

        if (!graphType()) {
            list[destination].removeByData(source);
        }
        list[source].removeByData(destination);

    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    Vertex v = list[i].get(j);
                    System.out.println(v.simpul+"("+v.weight+")\t");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}
