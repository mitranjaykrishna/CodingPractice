package Recursion.Backtracking;

import java.util.Arrays;

public class BackTrackingMazeProblem {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        int [][] path=new int[maze.length][maze[0].length];
        allMazePath("",maze,0,0,path,1);


    }

    public static void allMazePath(String p,boolean [][] maze,int r,int c,int[][] path,int step)
    {
        if(r== maze.length-1 && c==maze[0].length-1)
        {
            path[r][c]=step;
            for(int[] arr :path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c])
        {
            return;
        }

        maze[r][c]=false;
        path[r][c]=step;

        if(r<maze.length-1)
            allMazePath(p+'D',maze,r+1,c,path,step+1);
        if (c<maze[0].length-1)
            allMazePath(p+'R',maze,r,c+1,path,step+1);
        if(r> maze.length-1)
            allMazePath(p+'U',maze,r-1,c,path,step+1);
        if(c> maze.length-1)
            allMazePath(p+'L',maze,r,c-1,path,step+1);

        //remove signatures after murder
        maze[r][c]=true;
        path[r][c]=0;

    }
}
