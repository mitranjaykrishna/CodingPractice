package Recursion;

public class Pattern {
    public static void main(String[] args) {
        pattern2(4,0);

    }

    public static void pattern1(int row,int col)
    {
        if(row==0)
        {
            return;
        }
        if(col<row){
            System.out.print("* ");
            pattern1(row,col+1);

        }
        else{
            System.out.println();
            pattern1(row-1,0);
        }
    }

    public static void pattern2(int row,int col)
    {
        if(row==0)
        {
            return;
        }
        if(col<row){
//            System.out.print("* ");
            pattern2(row,col+1);
            System.out.print("* ");

        }
        else{
//            System.out.println();
            pattern2(row-1,0);
            System.out.println();
        }
    }
}
