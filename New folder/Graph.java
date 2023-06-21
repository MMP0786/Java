import java.util.*;

// import QueueImp.Queue;

public class Graph{
    static class Edge{
        int e;
        int des;
        int wt;

    public Edge(int e, int des, int wt){
        this.e = e;
        this.des = des;
        this.wt = wt;
        }
    }

    // creating graph
    public static void createGraph(ArrayList<Edge> graph []){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 10));
        
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
// 0-1-2
// 3-4


        graph[4].add(new Edge(4, 2, 2));
        graph[4].add(new Edge(4,3, 2));
        graph[4].add(new Edge(4, 5, 2));

        graph[5].add(new Edge(5, 3, 2));
        graph[5].add(new Edge(5,4, 2));
        graph[5].add(new Edge(5, 6, 2));
        
        graph[6].add(new Edge(6, 5, 2));


    }
    // tranverse through bfs
    public static void bfs(ArrayList<Edge> graph [], int v, boolean vis[], int start){
        
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr] =true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }

    }

    // dfs
    public static void dfs( ArrayList<Edge> graph [], int curr, boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]= true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(vis[e.des]==false)
                dfs(graph, e.des, vis);
        }
    }
    public static void main(String args[]){

        int v= 7;
        ArrayList<Edge> graph []= new ArrayList[v];
        createGraph(graph);

        boolean vis[] = new boolean[v];
        
        // for(int i=0; i<graph.length; i++){
        //     if(vis[i]==false){
        //         bfs(graph, v, vis, i);
        //     }
        // }
        // bfs(graph, v);

        for(int i=0; i<graph.length; i++){
            if(vis[i]==false){
                 dfs(graph, i, vis);
            }
        }
        

        // dfs
        


        // vertex 2 traverse
        // for(int i=0; i<graph[2].size(); i++){
        //     Edge e = graph[2].get(i);
        //     System.out.println(e.des+","+ e.wt);
        // }

    }
    
}