package LeetCodeQuestion.RecursionAndBackTracking.Backtracking;

import java.util.*;

public class NQueenLeet {
    public static void main(String[] args) {

        System.out.println(solveNQueens(4));


    }
    public static List<List<String>> solveNQueens(int n) {
        boolean [][] board=new boolean[n][n];

        List<List<String>> list = new ArrayList<>(queen("", board, 0));
        return list;

    }

    public static List<List<String>> queen(String p,boolean[][] board,int row)
    {
        if(row==board.length)
        {
            List<List<String>> list= new ArrayList<>();
            list.add(addQ(board));
            return list;
        }

        List<List<String>> list=new ArrayList<>();

        for(int col=0;col<board.length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]=true;
                list.addAll(queen(p,board,row+1));
                board[row][col]=false;
            }
        }
        return list;
    }

    private static List<String> addQ(boolean[][] board) {
        List<String> list=new ArrayList<>();
        StringBuilder s;

        for(boolean[] arr:board)
        {

            s=new StringBuilder();

            for(boolean element :arr)
            {
                if(element)
                    s=s.append('Q');
                else
                    s=s.append('.');
            }
            list.add(s.toString());
            s=null;
        }
        return list;
    }
    private static boolean isSafe(boolean[][] board, int row, int col) {
        //vertical checkUP
        for(int i=0;i<row;i++)
        {
            if(board[i][col])
                return false;
        }
        //check Diagonal left
        int maxLeft=Math.min(row,col);
        for(int i=0;i<=maxLeft;i++)
        {
            if(board[row-i][col-i])
                return false;
        }
        //check Diagonal Right
        int maxRight=Math.min(row,board.length-1-col);
        for (int i=0;i<=maxRight;i++)

        {
            if(board[row-i][col+i])
                return false;
        }
        return true;
    }

}
