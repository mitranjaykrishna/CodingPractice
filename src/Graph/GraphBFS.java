package Graph;
import Graph.GraphRepresentation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
    public static void main(String[] args) {
        GraphRepresentation obj=new GraphRepresentation();
        ArrayList<ArrayList<Integer>> adj= obj.rep(3,3);

        System.out.println(bfsGraph(3,adj));


    }
    public static ArrayList<Integer> bfsGraph(int n,ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean [] vis=new boolean[n+1];
        for(int i=1;i<=n;i++)
        {
            if(!vis[i])
            {
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                vis[i]=true;
                while(!q.isEmpty())
                {
                    int node=q.poll();
                    bfs.add(node);
                    for(int it : adj.get(node)){
                        if(!vis[it])
                        {
                            q.add(it);
                            vis[it]=true;
                        }
                    }
                }
            }
        }
        return bfs;
    }
}
