package Recursion;

public class ReduceTo1 {
    public static int c=0;
    public static void main(String[] args) {
        reduce(999999);
        System.out.println(c);

    }
    public static  void reduce(int n)
    {
        if(n==1)
        {
            return;

        }
        if(n%2==0)
        {
            c++;
            reduce(n/2);
        }
        else
        if(n%3==0)
        {
            c++;
            reduce(n/3);
        }
        else
        {
            c++;
            reduce(n-1);
        }
    }
}
