package LeetCodeQuestion;

public class ReverseInt {
    public static long ans=0;
    public static void main(String[] args) {
        System.out.println(reverse(-123));

    }
    public static int reverse(int x) {
        int flag=0;
        if(x<0)
        {
            x=x*-1;
            flag=1;
        }
        rev(x);
        if(ans>Integer.MAX_VALUE)
            return 0;
        else
        {
            if(flag==1)
                return -1*((int) ans);
             return (int)ans;
        }
    }

    public static long rev(int n)
    {

        int r;
        r=n%10;
        if(n==0)
            return ans;
        if(n>0)
        {
            ans = r + (ans* 10);
            rev(n/10);
        }
        return ans;

    }
}
