import java.util.*;
// import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;



public class NewFileGraph{
    static class Edge{
        int e;
        int d;
        int w;
        Edge(int e, int d, int w){
            this.e = e;
            this.d = d;
            this.w = w;
        }
    }

    public static void createGraph( ArrayList<Edge> graph []){
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<Edge>();
        }
         graph[0].add(new Edge(0, 1, 10));
        // graph[0].add(new Edge(0, 1, 10));
        
        // graph[1].add(new Edge(1, 0, 0));
        // graph[1].add(new Edge(1, 2, 5));
        graph[1].add(new Edge(1, 0, 0));
        graph[1].add(new Edge(1, 3, 5));

        // graph[2].add(new Edge(2, 1, -5));
        graph[2].add(new Edge(2, 0, -5));
        graph[2].add(new Edge(2, 4, 12));
        graph[2].add(new Edge(2, 3, 2));

        // graph[3].add(new Edge(3, 4, 2));
        // graph[4].add(new Edge(4, 3, 2));
        graph[3].add(new Edge(3, 1, 2));
        graph[3].add(new Edge(3, 4, 2));
        graph[3].add(new Edge(3, 5, 2));


        graph[4].add(new Edge(4, 2, 2));
        graph[4].add(new Edge(4,3, 2));
        graph[4].add(new Edge(4, 5, 2));

        graph[5].add(new Edge(5, 3, 2));
        graph[5].add(new Edge(5,4, 2));
        graph[5].add(new Edge(5, 6, 2));
        
        graph[6].add(new Edge(6, 5, 2));


    }

    public static void bfs(ArrayList<Edge> graph [],  boolean vis [], int start ){
        Queue<Integer> q = new ConcurrentLinkedQueue<>();
        
        q.add(start);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr] =true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.d);
                }
            }

        }
    }

    public static void dfs(ArrayList<Edge> graph [], int curr, boolean vis [] ){
        
        System.out.print(curr+ " ");
        vis[curr]=true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.d]==false){
                dfs(graph, e.d, vis);
            }
        }
    }

    // search target 
    public static void modifiedDfs(ArrayList<Edge> graph [], int curr, boolean vis [], String p, int tar ){
        if(curr == tar){
            System.out.println(p);
            return;
        }
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(vis[e.d]==false){
                vis[curr]=true; 
                modifiedDfs(graph, e.d, vis, p+e.d, tar);
                vis[curr]=false;
            }
        }
    }

//  cycle of
public static boolean isCycled(ArrayList<Edge> graph[], int curr, boolean vis[], boolean rec[]){
    vis[curr] = true;
    rec[curr] = true;

    for(int i=0; i<graph[curr].size(); i++){
        Edge e = graph[curr].get(i);
        if(rec[e.d]){
            return true;
        }else if(!vis[e.d]){
            if(isCycled(graph, e.d, vis, rec)){
                return true;
            }
        }
    }
    rec[curr]=false;
    return false;
}
    public static void main(String args[]){
        int v=7;
        ArrayList<Edge> graph [] = new ArrayList[v];

        createGraph(graph);
        // for(int i =0; i<graph[0].size(); i++){
        //     Edge e = graph[0].get(i);

        //     System.out.println(e.d);

        // }
        boolean vis [] = new boolean[v];
        // for(int i=0; i<graph.length; i++){
        //     if(vis[i]==false){

        //         bfs(graph, vis, i);
        //     }
        // }
        // for(int i=0; i<graph.length; i++){
        //     if(vis[i]==false){

        //         dfs(graph, i, vis);
        //     }
        // }
        // dfs(graph, 0, vis);

        modifiedDfs(graph, 0, vis, "0", 5);


    }
}