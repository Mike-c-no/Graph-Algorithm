
package dijkstra;

/**
 *
 * @author Misr
 */
public class Dijkstra {
    
    public static class dijkastraGraph{
        int vertices;
        int matrix[][];

    public dijkastraGraph(int vertex) {
        this.vertices = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int head, int tail, int temp) {
 
        matrix[head][tail]=temp;
        matrix[tail][head] = temp;
    }
        int getMinimumVertex(boolean [] mst, int [] key){
        int minmumKey = Integer.MAX_VALUE;
        int vertex = 0;
   
            for (int i = 0; i <vertices ; i++) {
                if(mst[i]==false && minmumKey>key[i]){
                    minmumKey = key[i];
                    vertex = i;
                }
            }
            return vertex;
        }

    public void dijkstra_GetMinDistances(int sourceVertex){
        boolean[] chara = new boolean[vertices];
        int [] distance = new int[vertices];
        int INFINITY = Integer.MAX_VALUE;
            
            for (int i = 0; i <vertices ; i++) {
         
                distance[i] = INFINITY;
            }


         distance[sourceVertex] = 0;

            for (int i = 0; i <vertices ; i++) {
                
                int vertex_U = getMinimumVertex(chara, distance);
                chara[vertex_U] = true;
                    for (int vertex_V = 0; vertex_V <vertices ; vertex_V++) {
                        if(matrix[vertex_U][vertex_V]>0){
                            if(chara[vertex_V]==false && matrix[vertex_U][vertex_V]!=INFINITY){
                                int newKey = matrix[vertex_U][vertex_V] + distance[vertex_U];
                                    if(newKey<distance[vertex_V])
                                        distance[vertex_V] = newKey;
                                    }
                            }
                        }
                    }
                     printDijkstra(sourceVertex, distance);
    }
    public void printDijkstra(int sourceVertex, int [] key){
        System.out.println("<< Dijkstra Algorithm >>");
            for (int i = 0; i <vertices ; i++) {
                System.out.println("Source Vertex: " + sourceVertex + " to vertex " + + i + " distance: " + key[i]);
            }
        }
    }
}
