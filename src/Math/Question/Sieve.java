package Math.Question;

public class Sieve {
    public static void main(String[] args) {
        int n=40;
        boolean[] prime=new boolean[n+1];
        sieve(n,prime);
    }
    public static void sieve(int num,boolean[] prime)
    {
        for (int i=2;i*i<=num;i++)
        {
            if(!prime[i])
            {
                for(int j=i*2;j<=num;j+=2)
                {
                    prime[j]=true;
                }
            }
        }
        for (int i=2;i<=num;i++)
        {
            if(!prime[i])
            {
                System.out.print(i+" , ");
            }
        }
    }
}
