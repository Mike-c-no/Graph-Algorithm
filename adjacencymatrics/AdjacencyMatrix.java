package adjacencymatrics;

/**
 *
 * @author Aman
 */
public class AdjacencyMatrix {
     int Vertices;
     int aadjmatrix[][];


public AdjacencyMatrix(int vertex) {
    this.Vertices = vertex;
    aadjmatrix = new int[vertex][vertex];
}
public void addEdge(int head, int tail) {
    aadjmatrix[head][tail]=1;
    aadjmatrix[tail][head] = 1;
}
public void print() {

    for (int i = 0; i < Vertices; i++) {
        for (int j = 0; j <Vertices ; j++) {
            System.out.print(aadjmatrix[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < Vertices; i++) {
            System.out.print("Vertex " + i + " is connected to >> ");
                for (int j = 0; j <Vertices ; j++) {
                    if(aadjmatrix[i][j]==1){
                        System.out.print(j + "  ");
                }
            }
            System.out.println();
        }

    }
}
