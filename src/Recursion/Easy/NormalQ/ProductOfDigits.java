package Recursion.Easy.NormalQ;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(ProductOfDigit(55));

    }
    public static int ProductOfDigit(int n)
    {
        if(n%10==n)
            return n;
        return (n%10)*ProductOfDigit(n/10);
    }
}
