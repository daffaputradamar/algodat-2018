package minggu15;

import java.util.Scanner;

public class GraphArray {

    private final int vertices;
    private int[][] twoD_array;

    public GraphArray(int v) {
        vertices = v;
        twoD_array = new int[vertices + 1][vertices + 1];
    }

    public static void main(String[] args) {
        int v, e, count = 1, to = 1, from = 0;
        Scanner sc = new Scanner(System.in);
        GraphArray graph;
        try {
            System.out.println("Masukkan jumlah vertices:");
            v = sc.nextInt();
            System.out.println("Masukkan jumlah edges:");
            e = sc.nextInt();

            graph = new GraphArray(v);

            System.out.println("Masukkan edge: <to> <from>");
            while (count <= e) {
                to = sc.nextInt();
                from = sc.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print("\t");
            for (int i = 1; i <= v; i++) {
                System.out.print(stringConversion(i) + " ");
            }
            System.out.println();
            for (int i = 1; i <= v; i++) {
                System.out.print(stringConversion(i) + "\t");
                for (int j = 1; j <= v; j++) {
                    System.out.print(graph.getEdge(i, j) + "\t");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error. Silahkan cek kembali");
        }
        sc.close();
    }

    public static String stringConversion(int index) {
        String kota = null;
        switch (index) {
            case 1:
                kota = "Malang";
                break;
            case 2:
                kota = "Blitar";
                break;
            case 3:
                kota = "Brebes";
                break;
            case 4:
                kota = "Probolinggo";
                break;
            case 5:
                kota = "Pasuruan";
                break;
            case 6:
                kota = "Banyuwangi";
                break;
            case 7:
                kota = "Sidoarjo";
                break;
            case 8:
                kota = "Brebes";
                break;
            case 9:
                kota = "Wonorejo";
                break;
            case 10:
                kota = "Wonogiri";
                break;
        }
        return kota;
    }

    public void makeEdge(int to, int from, int edge) {
        try {
            twoD_array[to][from] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
    }

    public int getEdge(int to, int from) {
        try {
            return twoD_array[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("Vertex tidak ada");
        }
        return -1;
    }

}
