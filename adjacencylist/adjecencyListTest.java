
package adjacencylist;

/**
 *
 * @author Mike-c-no
 */
public class adjecencyListTest {
    
    
    public static void main(String[] args) {
        AdjacencyList adj=new AdjacencyList(9);
            adj.addEdge(0, 2, 11);
            adj.addEdge(0, 4, 16);
            adj.addEdge(6, 3, 9);
            adj.addEdge(3, 5, 9);
            adj.addEdge(7, 7, 9);
            adj.addEdge(8, 1, 19);
		
            System.out.println(adj);
            System.out.println(adj.Connecte(8,1));
    }
    
}
