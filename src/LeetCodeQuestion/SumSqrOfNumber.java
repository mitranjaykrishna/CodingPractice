package LeetCodeQuestion;
//https://leetcode.com/problems/sum-of-square-numbers/

public class SumSqrOfNumber {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(1));

    }
    public static boolean judgeSquareSum(int c) {
        int s=0;
        int e=(int)Math.sqrt(c);
        while(s<=e)
        {
            int a=(int)(Math.pow(s,2)+Math.pow(e,2));
            if(a>c)
                e--;
            else if (a<c)
                s++;
            else
                return true;


        }
        return false;


    }
}
