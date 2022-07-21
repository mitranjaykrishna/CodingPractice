package Recursion.Backtracking;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
//        System.out.println(countMaze(3,3));
//        mazePathPrint("",3,3);
//        System.out.println(mazePathPrintReturn("",3,3));
//        mazePathPrintDiagonal("",3,3);

        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
//        mazeObstructions("",maze,0,0);
        mazeAllPath("",maze,0,0);
    }
    public static int countMaze(int r, int c)
    {
        if(r==1 || c==1)
            return 1;
        int left=countMaze(r-1,c);
        int right=countMaze(r,c-1);
        return left+right;
    }
    //PRINT ALL PATH OF MAZE
    //NO RETURN
    public static void mazePathPrint(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            mazePathPrint(p+'D',r-1,c);
        }
        if(c>1) mazePathPrint(p+'R',r,c-1);
    }
    //PRINT ALL PATH OF MAZE
    //RETURN ARRAYLIST
    public static ArrayList<String> mazePathPrintReturn(String p,int r, int c)
    {
        //Base
        if(r==1 && c==1)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;

        }

        ArrayList<String> list=new ArrayList<>();
        if(r>1)
        {
            list.addAll(mazePathPrintReturn(p+'D',r-1,c));
        }
        if(c>1)
        {
            list.addAll(mazePathPrintReturn(p+'R',r,c-1));
        }
        return list;

    }

    //PRINT ALL PATH OF MAZE
    // INCLUDING DIAGONAL PATH
    //NOT RETURNING
    public static void mazePathPrintDiagonal(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1)
        {
            mazePathPrintDiagonal(p+'D',r-1,c);
        }
        if (c>1)
        {
            mazePathPrintDiagonal(p+'R',r,c-1);
        }
        if(c>1 && r>1)
        {
            mazePathPrintDiagonal(p+'S',r-1,c-1);
        }
    }

    //Maze Obstruction
    //Print Path
    public static void mazeObstructions(String p, boolean[][] maze, int r, int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
            return;

        if (r<maze.length-1) mazeObstructions(p+'D',maze,r+1,c);
        if(c<maze[0].length-1) mazeObstructions(p+'R',maze,r,c+1);
    }

    //Maze All Paths
    //Up,Down,Left,Right
    //Stack OverFlow Solved in backtracking open BacktrackingMaze
    public static void mazeAllPath(String p,boolean [][] maze,int r,int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
            return;
        if(r<maze.length-1)
        {
            mazeAllPath(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1)
        {
            mazeAllPath(p+'R',maze,r,c+1);
        }
        if(r>0)
            mazeAllPath(p+'U',maze,r-1,c);
        if(c>0)
            mazeAllPath(p+'L',maze,r,c-1);
    }


}

