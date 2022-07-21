package PatternQuestions;

public class Q3 {
    public static void main(String[] args) {
        q3(5);
    }
    public static void q3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j =1;j<=n+1-i;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
