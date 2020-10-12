package minggu16;

import java.util.*;

public class BFSKota {
    
    public static void main(String[] args) {
        
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        
        Map<String, Integer> map = new HashMap<>();
//        map.put("a", 2);
        
        int vertex, edges;
        String namaKota,source, destination, start;
        
        System.out.print("Masukkan jumlah vertex: ");
        vertex = scInt.nextInt();
        
        GraphKota g = new GraphKota(vertex);
        
        System.out.println("Masukkan nama - nama kota");
        for (int i = 0; i < vertex; i++) {
            System.out.print((i+1)+". ");
            namaKota = scStr.nextLine();
            map.put(namaKota, i);
        }

        System.out.print("Masukkan jumlah edges: ");
        edges = scInt.nextInt();
        
        System.out.println("Masukkan edges:");
        for (int i = 0; i < edges; i++) {
            System.out.println("======================");
            System.out.print("Masukkan source\t\t: ");
            source = scStr.nextLine();
            System.out.print("Masukkan destination\t: ");
            destination = scStr.nextLine();
            System.out.println("======================");

            g.addEdge(map.get(source), destination);
        }
        
        System.out.print("Input start: ");
        start = scStr.nextLine();

        System.out.println("Following is Breadth First Traversal: ");
        g.BFS(start, map);
        
        scInt.close();
    }
}
