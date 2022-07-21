package LeetCodeQuestion.RecursionAndBackTracking.Recursion.EasyRecursion;
//https://leetcode.com/problems/binary-search/

public class BinarySearchRecursively {
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        System.out.println(search(arr,9));


    }
    public static int search(int[] nums, int target) {
        return binarySearch(nums,target,0,nums.length-1);

    }

    public static int binarySearch(int [] nums,int target,int s,int e)
    {
        if(s>e)
            return -1;
        int m=s+(e-s)/2;
        if(nums[m]==target)
            return m;
        if(nums[m]<target)
            return binarySearch(nums,target,m+1,e);
        else
            return binarySearch(nums, target, s, m-1);
    }


}
