package LeetCodeQuestion;

import java.util.Arrays;

public class SearchInTwoDArray {
    public static void main(String[] args) {
        int [][] arr={
                {1,2},{3,4},{5,6}
        };
        boolean a=searchMatrix(arr,7);
        System.out.println(a);

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row= matrix.length;
        int col=matrix[0].length;
        if(row==1)
            return binarySearch(matrix,0,0,col-1,target);



        int rstart=0;
        int rend=row-1;
        int cmid=(col)/2;

        while (rstart<(rend-1))
        {
            int rmid=rstart+(rend-rstart)/2;
            if(matrix[rmid][cmid]==target)
                return true;
            if (matrix[rmid][cmid]<target)
                rstart=rmid;
            else
                rend=rmid;
        }
        //Now two rows

        if (matrix[rstart][cmid]==target)
            return true;
        if (matrix[rstart+1][cmid]==target)
            return true;
        //for less then or equal to 2 col
        if(col<=2)
        {

        }

        //1st
        if(col>1 && target<=matrix[rstart][cmid-1])
            return binarySearch(matrix,rstart,0,cmid-1,target);
        //2nd
        if(col>1 && target>=matrix[rstart][cmid+1] && target>=matrix[rstart][col-1] )
            return (binarySearch(matrix,rstart,cmid+1,col-1,target));
        //3rd
        if(col>1 && target<=matrix[rstart+1][cmid-1])
            return (binarySearch(matrix,rstart+1,0,cmid-1,target));
        //4th
        else if(col>1 && target<=matrix[rstart+1][cmid+1])
            return (binarySearch(matrix,rstart+1,cmid+1,col-1,target));
        //remove
        return false;


    }
    public static  boolean binarySearch(int[][] matrix,int row,int cstart,int cend,int t)
    {
        while (cstart<=cend)
        {
            int mid=cstart+(cend-cstart)/2;
            if(matrix[row][mid]<t)
                cstart=mid+1;
            else if (matrix[row][mid]>t)
            {
                cend=mid-1;

            }
            else
                return true ;

        }
        return false;

    }
}
