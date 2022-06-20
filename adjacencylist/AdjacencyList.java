package adjacencylist;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mike-c-no
 */
public class AdjacencyList {
    
    class Edge{
       
        int v,x;
    public Edge(int v,int x){
    
        this.v=v; 
        this.x=x;
    }
@Override
    public String toString(){
    
        return "("+v+","+x+")";
        }
    }
        List<Edge> Adj[];
    
    public AdjacencyList(int m){
    
        Adj=new LinkedList[m];
            for(int i=0;i<Adj.length;i++)
                Adj[i]=new LinkedList<>();
    }
    boolean Connecte(int u,int v){
        
        if (Adj[u].stream().anyMatch((i) -> (i.v==v))) {
            return true;
        }
        return false;
    }
    void addEdge(int u,int v,int x){
    
         Adj[u].add(0,new Edge(v,x)); 
    }
@Override
    public String toString(){
    
        String result="";
            for(int i=0;i<Adj.length;i++)
                result+=i+">>>"+Adj[i]+"\n";
                    return result;
    }
    
}
