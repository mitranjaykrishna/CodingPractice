package LeetCodeQuestion;
//https://leetcode.com/problems/sort-colors/

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,1,2,0,2,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sortColors(int[] nums) {
        int s=0, mid=0;
        int e=nums.length-1;
        while(mid<=e)
        {
            if(nums[mid]==1)
                mid++;
            else if(nums[mid]==2)
            {
                swap(nums,mid,e);
                e--;
            }
            else
            {
                swap(nums,mid,s);
                s++;
                mid++;

            }
        }

    }

    public static void swap(int[] nums, int mid, int e) {
        int temp=nums[mid];
        nums[mid]=nums[e];
        nums[e]=temp;

    }
}
