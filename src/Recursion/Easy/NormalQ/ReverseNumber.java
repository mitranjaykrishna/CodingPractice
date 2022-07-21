package Recursion.Easy.NormalQ;

public class ReverseNumber {
    public static void reverse(int n)
    {
        if(n%10==n)
        {
            System.out.print(n);
            return;
        }
        System.out.print(n%10);
        reverse(n/10);

    }
    static int sum=0;
    public static void reverse2(int n)
    {
        if (n==0)
            return;
        int r=n%10;
        sum=sum*10+r;
        reverse2(n/10);

    }
    public static void main(String[] args) {
        reverse2(123456);
        System.out.println(sum);

    }

}
