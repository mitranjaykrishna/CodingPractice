package LeetCodeQuestion.RecursionAndBackTracking.Backtracking;

public class NQueen2 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(totalNQueens(n));




    }
    public static int totalNQueens(int n) {
        boolean [][] board=new boolean[n][n];
        return queens(board,0);

    }

    public static int queens(boolean[][] board,int row)
    {
        if(row==board.length)
        {
            return 1;
        }
        int count=0;
        for(int col=0;col<board.length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]=true;
                count+=queens(board,row+1);
                board[row][col]=false;
            }

        }

        return  count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check vertical
        for(int i=0;i<=row;i++)
        {
            if(board[i][col])
            {
                return false;
            }
        }
        //check Diagonal left
        int maxLeft=Math.min(row,col);
        for(int i=0;i<=maxLeft;i++)
        {
            if(board[row-i][col-i])
            {
                return false;
            }
        }
        // check Diagonal right
        int maxRight=Math.min(row,board.length-col-1);
        for (int i=0;i<=maxRight;i++)
        {
            if (board[row-i][col+i])
                return false;
        }

        return true;

    }


}
