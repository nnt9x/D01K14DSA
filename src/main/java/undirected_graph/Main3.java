package undirected_graph;

public class Main3 {
    public static void main(String[] args) {
        DirectionGraph graph = new DirectionGraph(6);
        // Them dinh
        graph.addVertex(0, 'A');
        graph.addVertex(1, 'B');
        graph.addVertex(2, 'C');
        graph.addVertex(3, 'D');
        graph.addVertex(4, 'E');
        graph.addVertex(5, 'F');
        // Them canh: A->B = 3
        graph.addEdge(0,1, 3);
        // B->C = 5
        graph.addEdge(1,2, 5);
        // C->E = 2
        graph.addEdge(2,4, 2);
        //  E -> D = 6
        graph.addEdge(4, 3, 6);
        // E -> F = 1
        graph.addEdge(4, 5, 1);
        // D-> B = 3
        graph.addEdge(3, 1, 3);
        // In ra
        graph.printGraph();
    }
}
