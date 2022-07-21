package PatternQuestions;

public class Q6 {
    public static void main(String[] args) {
        q6(5);

    }

    public static void q6(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if (j>n-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
