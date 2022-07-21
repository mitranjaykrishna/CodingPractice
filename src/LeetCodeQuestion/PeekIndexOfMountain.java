package LeetCodeQuestion;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeekIndexOfMountain {
    public static void main(String[] args) {
        int[] arr={24,69,100,99,79,780,67,36,26,19};
        System.out.println(peekFind(arr));
    }

    static int peekFind(int [] arr)
    {
        int s=0;
        int e= arr.length-1;


        while(s<e)
        {
            int m=s+(e-s)/2;

            if(arr[m]<arr[m+1])
            {
                s=m+1;
            }
            else
                if (arr[m]>arr[m+1])
                e=m;
        }
        return e;

    }
}
