package Recursion;

public class MazeProblemApnaCollege {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        mazePath(arr,"",1,1);

    }
    public static void mazePath(int [][] arr,String path,int r,int c)
    {
        if(r== arr.length && c== arr.length)
        {
            System.out.println(path);
            return;
        }


        if(c<arr[0].length)
        {
            mazePath(arr,path+'R',r,c+1);
        }
        if(r<arr.length)
        {
            mazePath(arr,path+'D',r+1,c);
        }
    }
}
