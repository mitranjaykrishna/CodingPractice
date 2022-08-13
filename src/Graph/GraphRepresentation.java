package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphRepresentation {
    public static void main(String[] args) {
        int node=3,edj=3;
        Scanner sc=new Scanner(System.in);

        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<=node;i++)
        {
            adj.add(new ArrayList<Integer>());
        }

        for(int i=1;i<=node;i++)
        {
            int u,v;
            u= sc.nextInt();
            v= sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        System.out.println(adj);


    }
}
