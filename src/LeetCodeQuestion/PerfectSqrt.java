package LeetCodeQuestion;
//https://leetcode.com/problems/valid-perfect-square/

public class PerfectSqrt {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));

//        System.out.println(Integer.toBinaryString(49));

    }
    public static boolean isPerfectSquare(int num) {
        int s=0,e=num/2;
        if(num==1)
            return true;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            int sq=mid*mid;
            if(sq>num)
                e=mid-1;
            else if(sq<num)
                s=mid+1;
            else
                return true;
        }
        return false;

    }
}
