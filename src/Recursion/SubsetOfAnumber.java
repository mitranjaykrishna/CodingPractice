package Recursion;

public class SubsetOfAnumber {
    public static void main(String[] args) {
//        int[] arr={1,2,3};
        subset(3,"");
    }

    public static void subset(int n,String p)
    {
        if(n==0)
        {
            System.out.print(p+" ");
            return;
        }
        subset(n-1,p+n);
        subset(n-1,p);
    }
}
