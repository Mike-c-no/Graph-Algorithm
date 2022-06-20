
package bfs;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Belayneh Getta
 */
public class BFS {
private int Vertex;
private LinkedList<Integer> bfs[];
    BFS(int v){
        Vertex = v;
        bfs = new LinkedList[v];
            for (int i=0; i<v; ++i)
            bfs[i] = new LinkedList();
       }
void addEdge(int v,int w){
	bfs[v].add(w);
    }
void BFS(int see){
    
    boolean visited[] = new boolean[Vertex];
    LinkedList<Integer> q = new LinkedList<>();
    visited[see]=true;
    q.add(see);

        while (!q.isEmpty()){
		
            see = q.poll();
            System.out.print(see+" ");
            Iterator<Integer> i = bfs[see].listIterator();
                
                while (i.hasNext()){
                    int num = i.next();
                        if (!visited[num]){
                            visited[num] = true;
                            q.add(num);
                        }
                }
        }
    }
    
}
