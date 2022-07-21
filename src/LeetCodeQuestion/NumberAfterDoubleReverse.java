package LeetCodeQuestion;
//https://leetcode.com/problems/a-number-after-a-double-reversal/

public class NumberAfterDoubleReverse {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(260));
//        System.out.println(reverse(526));

    }
    public static boolean isSameAfterReversals(int num) {

        return reverse(reverse(num))==num;

    }

    public static int reverse(int num)
    {
        int l=(int) (Math.log10(num)+1),s=0;
        for(int i=0;i<l;i++)
        {
            int temp=num%10;
            s=s*10+temp;
            num=num/10;
        }
        return s;
    }

}
