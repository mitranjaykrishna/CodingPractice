package Recursion.Easy.NormalQ;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigit(1342124789));

    }
    public static int sumOfDigit(int n)
    {
        if(n==0)
            return 0;
        return (n%10)+sumOfDigit(n/10);
    }
}
