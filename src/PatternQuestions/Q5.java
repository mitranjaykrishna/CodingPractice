package PatternQuestions;

public class Q5 {
    public static void main(String[] args) {
        q5(5);
    }

    public static void q5(int n)
    {
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n-1;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
