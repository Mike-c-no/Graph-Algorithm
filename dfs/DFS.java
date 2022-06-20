package dfs;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Girum
 */
public class DFS {
    
    int V;    
    
    LinkedList<Integer> dfs[]; 
    DFS(int v){
        
        V = v;
        dfs = new LinkedList[v];
            
            for (int i=0; i<v; ++i){
                dfs[i] = new LinkedList();
            }
    }
 void addEdge(int v, int x){
    
    dfs[v].add(x);    
}
void Traversal(int v,int visited[]){
    
    visited[v] = 1;
    System.out.print(v + " ");
    Iterator<Integer> i = dfs[v].listIterator();
        
        while (i.hasNext()){
            int n = i.next();
                if (visited[n]==0)
                Traversal(n, visited);
        }
    }
void Search(int v){
        
    int visited[] = new int[V];
		
    Traversal(v, visited);
        
        for (int i=1;i<V;i++){
            
            if(visited[i]==0){
                
                Traversal(i, visited);
            }
        }
  }
    
}
