package LeetCodeQuestion;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        int n=4421;
        System.out.println(subtractProductAndSum(n));

    }
    public static int subtractProductAndSum(int n) {
        int sum=0,mul=1;
        int temp=n;
        //sum
        for(int i=0;i<((int)Math.log10(n)+1);i++)
        {
            sum+=(temp%10);
            temp=temp/10;
        }
        //multiply
        temp=n;
        for(int i=0;i<((int)Math.log10(n)+1);i++)
        {
            mul*=(temp%10);
            temp=temp/10;
        }

        return mul-sum;


    }
}
