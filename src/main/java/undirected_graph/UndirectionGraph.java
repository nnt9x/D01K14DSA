package undirected_graph;

public class UndirectionGraph {
    private char[] v;
    private int[][] matrix;

    public UndirectionGraph(int size) {
        this.v = new char[size];
        this.matrix = new int[size][size];
    }

    public void addVertex(int index, char c) {
        v[index] = c;
    }

    public void addEdge(int v1, int v2) {
        matrix[v1][v2] = 1;
        matrix[v2][v1] = 1;
    }

    public void printGraph() {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + ": ");
            for (int j = 0; j < v.length; j++) {
                if (matrix[i][j] == 1) {
                    // In ra dinh j
                    System.out.print(v[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
