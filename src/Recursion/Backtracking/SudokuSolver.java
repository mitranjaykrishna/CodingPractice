package Recursion.Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] ch={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(solveSudoku(ch));

    }
    public static boolean solveSudoku(char[][] board) {
       return solve(board,0,0);

    }

    public static boolean solve(char[][] board,int r,int c)
    {
        // base case
        if(r==board.length)
        {
            display(board);
            return true;
        }
        // next call row and col check
        int nr=0;
        int nc=0;

        if(c==board[0].length-1)
        {
            nr=r+1;
            nc=0;

        }
        else
        {
            nr=r;
            nc=c+1;
        }

        //if there is already a number
        if(board[r][c]!='.')
        {
            return solve(board,nr,nc);
        }

        //if there is a empty space
        //check each and every posible number
        else{
            for(int num=1;num<=9;num++)
            {
                //check is the number is possible coreect for each  cell
                if(isSafe(board,r,c,num))
                {
//                    char n=(char)num;
                    board[r][c]=Character.forDigit(num, 10);
                    if(solve(board,nr,nc))
                        return true;
                    //backtracking
                    else
                    board[r][c]='.';
                }
            }//end of loop
        }
        return false;


    }//end of method solve

    public static boolean isSafe(char[][] board,int r,int c,int num)
    {
//        char n=(char)num;
        //check for rows is the number is avaiabale or not
        for(int i=0;i<board.length;i++)
        {
            if(board[i][c]==Character.forDigit(num, 10))
            {
                return false;
            }
        }

        //check for col is the number is available or not
        for(int i=0;i<board[0].length;i++)              //we can also use board.length
        {
            if(board[r][i]==Character.forDigit(num, 10))
            {
                return false;
            }
        }

        //check for 3x3 sub matrix is number is present or not
        int sr=r/3*3;
        int sc=c/3*3;

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[sr+i][sc+j]==Character.forDigit(num, 10))
                    return false;
            }
        }

        return true;
    }

    //display method

    public static void display(char[][] board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }


}
