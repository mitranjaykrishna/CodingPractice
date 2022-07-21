package LeetCodeQuestion.BinarySearchQuestion;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int [] nums={5,7,7,8,8,10};

        System.out.println(Arrays.toString(searchRange(nums,8)));

    }



    static int[] searchRange(int[] nums, int target)
    {

        int[] ans={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;

        return ans;

    }



    static int search(int [] nums,int target,boolean isStart)
    {
        int ans=-1;

        int s=0;
        int e=nums.length-1;

        while(s<=e)
        {
            int m=s+(e-s)/2;

            if(nums[m]<target)
            {
                s=m+1;
            }
            else
            if(nums[m]>target)
            {
                e=m-1;
            }
            else
            {
                ans=m;
                //potential ans
                if(isStart)
                    e=m-1;
                else
                    s=m+1;
            }


        }

        return ans;
    }
}
