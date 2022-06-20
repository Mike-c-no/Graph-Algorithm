
package adjacencymatrics;

/**
 *
 * @author Aman
 */
public class AdjacencyMatricsTest {
    public static void main(String[] args) {
        AdjacencyMatrix g = new AdjacencyMatrix(5);
            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(2, 0);
            g.addEdge(2, 3);
            g.addEdge(3, 4);
            
                g.print();
    }
}
