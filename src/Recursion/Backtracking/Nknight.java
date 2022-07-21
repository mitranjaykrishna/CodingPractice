package Recursion.Backtracking;

public class Nknight {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board=new boolean[n][n];
        knight(board,0,0,2);

    }

    public static void knight(boolean[][] board,int r,int c,int target)
    {
        if(target==0)
        {
            display(board);
            System.out.println();
            return;
        }
        if(r==board.length-1 && c==board.length-1)
            return;
        if(c==board.length-1) {
            knight(board, r + 1, 0, target);
            return;
        }
        if(isSafe(board,r,c))
        {
            board[r][c]=true;
            knight(board,r,c+1,target-1);
            board[r][c]=false;
        }
        knight(board,r,c+1,target);
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        if(isValid(board,r-2,c-1))
        {
            if(board[r-2][c-1])
                return false;
        }
        if(isValid(board,r-2,c+1))
        {
            if(board[r-2][c+1])
                return false;
        }

        if(isValid(board,r-1,c-2))
        {
            if(board[r-1][c-2])
                return false;
        }
        if(isValid(board,r-1,c+2))
        {
            if(board[r-1][c+2])
                return false;
        }
        return true;
    }

    private static boolean isValid(boolean[][] board, int r, int c) {
        if(r>=0 && r<board.length && c>=0 && c<board.length)
            return true;
        return false;

    }

    private static void display(boolean[][] board)
    {
        for (boolean[] arr : board)
        {
            for (boolean e : arr)
            {
                if (e)
                {
                    System.out.print("K ");
                }
                else
                {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
