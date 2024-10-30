package undirected_graph;

public class DirectionGraph {
    // Mang chua dinh va ma tran
    private char[] v;
    private int[][] matrix;

    public DirectionGraph(int size) {
        this.v = new char[size];
        this.matrix = new int[size][size];
    }

    // Them dinh va gia tri
    public void addVertex(int index, char c) {
        v[index] = c;
    }

    // v1, v2, w
    public void addEdge(int v1, int v2, int w) {
        matrix[v1][v2] = w;
    }

    public void printGraph() {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + ": ");
            for (int j = 0; j < v.length; j++) {
                if (matrix[i][j] != 0) {
                    // In ra dinh j
                    System.out.print("-->");
                    System.out.print("[" + v[j] + "-" + matrix[i][j] + "]");
                }
            }
            System.out.println();
        }
    }
}
