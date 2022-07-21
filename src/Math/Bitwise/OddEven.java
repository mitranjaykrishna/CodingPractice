package Math.Bitwise;

public class OddEven {
    public static void main(String[] args) {
        int n=11;
        System.out.println(isodd(n));
    }
    public static boolean isodd(int n)
    {
        return (n&1)!=1;
    }
}
