package Recursion.Easy.NormalQ;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(1020501111));

    }
    public static int countZeroes(int n)
    {
        return helper(n,0);
    }

    private static int helper(int n, int i)
    {
        if (n==0)
            return i;
        if(n%10==0)
            return helper(n/10,i+1);
        return helper(n/10,i);
    }

}
