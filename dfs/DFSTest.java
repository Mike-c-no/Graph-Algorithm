package dfs;

/**
 *
 * @author Girum
 */
public class DFSTest {
    public static void main(String[] args) {
        DFS dfs = new DFS(10);
        
            dfs.addEdge(1,2);
            dfs.addEdge(1,4);
            dfs.addEdge(2,5);
            dfs.addEdge(2,6);
            dfs.addEdge(4,7);
            dfs.addEdge(4,8);
            dfs.addEdge(3,9);
            dfs.addEdge(3,4);
            dfs.addEdge(4,3);
        
                dfs.Search(1);
    }
}
