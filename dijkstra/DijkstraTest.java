
package dijkstra;

import dijkstra.Dijkstra.dijkastraGraph;

/**
 *
 * @author Misr
 */
public class DijkstraTest {
     public static void main(String[] args) {
         int vertices = 6;
         int sourceVertex = 0;
         
            dijkastraGraph g = new dijkastraGraph(vertices);
        
                g.addEdge(0, 1, 4);
                g.addEdge(0, 2, 3);
                g.addEdge(1, 2, 1);
                g.addEdge(1, 3, 2);
                g.addEdge(2, 3, 4);
                g.addEdge(3, 4, 2);
                g.addEdge(4, 5, 6);
                g.dijkstra_GetMinDistances(sourceVertex);
    }
    
}
