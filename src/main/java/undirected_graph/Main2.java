package undirected_graph;

public class Main2 {
    public static void main(String[] args) {
        // Dinh nghia do thi
        UndirectionGraph graph = new UndirectionGraph(4);
        // Tao cach dinh
        graph.addVertex(0, 'A');
        graph.addVertex(1, 'B');
        graph.addVertex(2, 'C');
        graph.addVertex(3, 'D');
        // Tao lien ket - edge
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(2, 1);

        // In ra
        graph.printGraph();
    }
}
